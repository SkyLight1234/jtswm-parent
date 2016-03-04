package com.zdpzsp.system.service.impl;

import com.zdpzsp.frame.FrameConst;
import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.bo.View_param;
import com.zdpzsp.frame.db.mybatis.interceptor.Page;
import com.zdpzsp.frame.exception.DESEncryptException;
import com.zdpzsp.frame.utils.CommFunc;
import com.zdpzsp.frame.utils.DES;
import com.zdpzsp.frame.utils.WebUtils;
import com.zdpzsp.frame.vo.UserInfoVo;
import com.zdpzsp.system.SystemConst;
import com.zdpzsp.system.bo.*;
import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.service.IUserService;
import com.zdpzsp.system.utils.UserInfoUtil;
import com.zdpzsp.system.vo.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public class UserServiceImpl implements IUserService {
    private SysUserMapper sysUserMapper;

    private SysUserRolesMapper sysUserRolesMapper;

    private SysUserStationsMapper sysUserStationsMapper;

    private SysRolesMapper sysRolesMapper;

    private SysStationsMapper sysStationsMapper;

    private SysOrganizationMapper sysOrganizationMapper;

    private SysMenuMapper sysMenuMapper;

    private SysRoleMenusMapper sysRoleMenusMapper;

    private SysStationRptsMapper sysStationRptsMapper;

    private SysStationOrgsMapper sysStationOrgsMapper;

    @Override
    public void login(String userName, String password, HttpSession session) throws ServiceException {
        try {
            if (userName == null || password == null) {
                //参数错误
                throw new ServiceException(ResultCode.param_err);
            }
            SysUser sysUser = this.getSysUserByUserName(userName);
            if (sysUser == null) //用户不存在
            {
                throw new ServiceException(ResultCode.user_login_no_user);
            } else if (SystemConst.SysUserConst.state.enabled != sysUser.getState())//账号禁用
            {
                throw new ServiceException(ResultCode.user_login_user_disable);
            } else if (!sysUser.getLogin_pwd().equals(DES.encrypt(password)))//密码错误
            {
                throw new ServiceException(ResultCode.user_login_pass_no_eq);
            }

            List<SysRoles> sysRolesList = this.getSysRolesByUserId(sysUser.getUser_id());
            if (sysRolesList.isEmpty()) {
                throw new ServiceException(ResultCode.user_login_no_role);
            }

            List<Long> sysRoleIdList = new ArrayList<Long>();
            for (SysRoles sysRoles : sysRolesList) {
                sysRoleIdList.add(sysRoles.getId());
            }
            List<SysMenu> sysMenuList = getSysMenusByRoleIds(sysRoleIdList);
            if (sysMenuList.isEmpty()) {
                throw new ServiceException(ResultCode.user_login_no_menu);
            }


            List<SysStations> sysStationsList = this.getSysStationsByUserId(sysUser.getUser_id());
            List<SysOrganization> sysOrganizationList = new ArrayList<SysOrganization>();
            Set<Long> sysOrganizationIdsSet = new HashSet<Long>();
            if (!sysStationsList.isEmpty()) {
                List<Long> stationsIdList = new ArrayList<Long>();
                for (SysStations sysStations : sysStationsList) {
                    stationsIdList.add(sysStations.getId());
                }
                sysOrganizationList = this.getSysOrganizationByStationIds(stationsIdList);
                sysOrganizationIdsSet = this.getSysRepByStationIds(stationsIdList);
            }


            UserInfoVo userInfoVo = new UserInfoVo();
            userInfoVo.setSysUser(sysUser);
            userInfoVo.setSysRolesList(sysRolesList);
            userInfoVo.setSysMenus(sysMenuList);
            userInfoVo.setSysStationsList(sysStationsList);
            userInfoVo.setSysOrganizations(sysOrganizationList);
            userInfoVo.setRepIds(sysOrganizationIdsSet);
            session.setAttribute(FrameConst.SessionNames.userInfo, userInfoVo);
        } catch (DESEncryptException e) {
            throw new ServiceException(ResultCode.user_login_pass_encrypt_err);
        } catch (ServiceException e) {
            throw e;
        }
    }

    /**
     * 根据用户username查找用户
     * @param userName
     * @return
     */
    @Override
    public SysUser getSysUserByUserName(String userName) {
        SysUserExample sysUserExample=new SysUserExample();
        sysUserExample.or().andUser_codeEqualTo(userName);
        List<SysUser> sysUserList=sysUserMapper.selectByExample(sysUserExample);
        return sysUserList.isEmpty()?null:sysUserList.get(0);
    }

    /**
     * 根据用户id 查询用户角色
     * @param userId
     * @return
     */
    @Override
    public List<SysRoles> getSysRolesByUserId(long userId) {

        SysUserRolesExample sysUserRoleExample=new SysUserRolesExample();
        sysUserRoleExample.or().andUser_idEqualTo(userId).andIs_usedEqualTo(SystemConst.SysUserRolesConst.IsUsed.yes);
        List<SysUserRoles> sysUserRolesList=sysUserRolesMapper.selectByExample(sysUserRoleExample);

        List<SysRoles> sysRolesList=new ArrayList<SysRoles>();
        if(!sysUserRolesList.isEmpty())
        {
            for (SysUserRoles sysUserRoles:sysUserRolesList)
            {
                SysRoles sysRoles=UserInfoUtil.getSysRolesByRoleId(sysUserRoles.getRole_id());
                if(sysRoles!=null){
                    sysRolesList.add(sysRoles);
                }
            }
        }
        return sysRolesList;
    }

    /**
     * 根据角色id集合  查询菜单
     * @param roleIds
     * @return
     */
    @Override
    public List<SysMenu> getSysMenusByRoleIds(List<Long> roleIds){
        return UserInfoUtil.getSysMenuByRoleIds(roleIds);
    }
    /**
     * 根据userId 查询用户岗位
     * @param userId
     * @return
     */
    @Override
    public List<SysStations> getSysStationsByUserId(long userId)
    {
        SysUserStationsExample sysUserStationsExample= new SysUserStationsExample();
        sysUserStationsExample.or().andUser_idEqualTo(userId).andIs_usedEqualTo(SystemConst.SysUserStationsConst.IsUsed.yes);
        List<SysUserStations> sysUserStationsList= sysUserStationsMapper.selectByExample(sysUserStationsExample);

        List<SysStations> sysStationsList=new ArrayList<SysStations>();
        if(!sysUserStationsList.isEmpty())
        {
            for (SysUserStations sysUserStations:sysUserStationsList)
            {
                SysStations sysStations= UserInfoUtil.getSysStationsByStationId(sysUserStations.getStation_id());
                if(sysStations!=null)
                {
                    sysStationsList.add(sysStations);
                }
            }
        }
        return sysStationsList;
    }

    /**
     * 根据 岗位id 查询用户报表id
     * @param stationIds
     * @return
     */
    @Override
    public Set<Long> getSysRepByStationIds(List<Long> stationIds) {
        return UserInfoUtil.getSysRepByStationIds(stationIds);
    }
    /**
     * 根据 岗位id 查询用户组织
     * @param stationIds
     * @return
     */
    @Override
    public List<SysOrganization> getSysOrganizationByStationIds(List<Long> stationIds) {
        return UserInfoUtil.getSysOrganizationByStationIds(stationIds);
    }
    /**
     * 查询系统角色
     * @param isUsed
     * @return
     */
    @Override
    public List<SysRoles> getSysRolesList(byte isUsed) {
        SysRolesExample sysRolesExample=new SysRolesExample();
        sysRolesExample.or().andIs_usedEqualTo(isUsed);
        return sysRolesMapper.selectByExample(sysRolesExample);
    }

    /**
     * 查询系统角色map
     * @param isUsed
     * @return
     */
    @Override
    public Map<Long, SysRoles> getSysRolesMap(byte isUsed) {
        List<SysRoles> sysRolesList=this.getSysRolesList(isUsed);

        Map<Long,SysRoles> sysRolesMap=new HashMap<Long,SysRoles>();
        if(null!=sysRolesList&&!sysRolesList.isEmpty())
        {
            for (SysRoles sysRoles:sysRolesList)
            {
                sysRolesMap.put(sysRoles.getId(),sysRoles);
            }
        }
        return sysRolesMap;
    }

    /**
     * 查询系统菜单
     * @param menu_state
     * @return
     */
    @Override
    public List<SysMenu> getSysMenusList(int menu_state) {
        SysMenuExample sysMenuExample=new SysMenuExample();
        sysMenuExample.or().andMenu_stateEqualTo(menu_state);
        return sysMenuMapper.selectByExample(sysMenuExample);
    }

    /**
     * 查询系统菜单Map
     * @param menu_state
     * @return
     */
    @Override
    public Map<Long,SysMenu> getSysMenusMap(int menu_state)
    {
        List<SysMenu> sysMenusList=this.getSysMenusList(menu_state);

        Map<Long,SysMenu> sysRolesMap=new HashMap<Long,SysMenu>();
        if(null!=sysMenusList&&!sysMenusList.isEmpty())
        {
            for (SysMenu sysMenu:sysMenusList)
            {
                sysRolesMap.put(sysMenu.getMenu_id(),sysMenu);
            }
        }
        return sysRolesMap;
    }


    /**
     * 查询系统岗位
     * @param isUsed
     * @return
     */
    @Override
    public List<SysStations> getSysStationsList(byte isUsed) {
        SysStationsExample sysStationsExample=new SysStationsExample();
        sysStationsExample.or().andIs_usedEqualTo(isUsed);
        return sysStationsMapper.selectByExample(sysStationsExample);
    }

    /**
     * 查询系统岗位
     * @param isUsed
     * @return
     */
    @Override
    public Map<Long, SysStations> getSysStationsMap(byte isUsed) {
        List<SysStations> sysStationsList=this.getSysStationsList(isUsed);

        Map<Long,SysStations> sysStationsMap=new HashMap<Long,SysStations>();
        if(null!=sysStationsList&&!sysStationsList.isEmpty())
        {
            for (SysStations sysStations:sysStationsList)
            {
                sysStationsMap.put(sysStations.getId(),sysStations);
            }
        }
        return sysStationsMap;
    }

    /**
     * 查询系统组织
     * @param state
     * @return
     */
    @Override
    public List<SysOrganization> getSysOrganizationList(int state) {
        SysOrganizationExample sysOrganizationExample=new SysOrganizationExample();
        sysOrganizationExample.or().andStateEqualTo(state);
        return sysOrganizationMapper.selectByExample(sysOrganizationExample);
    }
    /**
     * 查询系统组织 map
     * @param state
     * @return
     */
    @Override
    public Map<Long, SysOrganization> getSysOrganizationMap(int state) {
        List<SysOrganization> sysOrganizationList=this.getSysOrganizationList(state);

        Map<Long,SysOrganization> sysOrganizationMap=new HashMap<Long,SysOrganization>();
        if(null!=sysOrganizationList&&!sysOrganizationList.isEmpty())
        {
            for (SysOrganization sysOrganization:sysOrganizationList)
            {
                sysOrganizationMap.put(sysOrganization.getOrg_id(),sysOrganization);
            }
        }
        return sysOrganizationMap;
    }


    /**
     * 查询系统角色菜单关系
     * @param isUsed
     * @return
     */
    @Override
    public List<SysRoleMenus> sysRoleMenusList(byte isUsed) {
        SysRoleMenusExample sysRoleMenusExample=new SysRoleMenusExample();
        sysRoleMenusExample.or().andIs_usedEqualTo(isUsed);
        return sysRoleMenusMapper.selectByExample(sysRoleMenusExample);
    }

    /**
     * 查询岗位对报表关系
     * @param isUsed
     * @return
     */
    @Override
    public List<SysStationRpts> getSysStationRptsList(byte isUsed) {
        SysStationRptsExample sysStationRptsExample=new SysStationRptsExample();
        sysStationRptsExample.or().andIs_usedEqualTo(isUsed);
        return sysStationRptsMapper.selectByExample(sysStationRptsExample);
    }

    /**
     * 查询岗位对组织关系
     * @param isUsed
     * @return
     */
    @Override
    public List<SysStationOrgs> getSysStationOrgsList(byte isUsed) {
        SysStationOrgsExample sysStationOrgsExample=new SysStationOrgsExample();
        sysStationOrgsExample.or().andIs_usedEqualTo(isUsed);
        return sysStationOrgsMapper.selectByExample(sysStationOrgsExample);
    }


    @Override
	public void getEnableUserTable(Page<SysUser> page) {
        page.setResults( sysUserMapper.getEnableUserTable(page));
	}
	@Override
	public List<View_param> getAllSysRolesFromCache() {

		return CommFunc.getViewParamByType("sys_roles");
	}
	@Override
	public List<View_param> getAllSysStationsFromCache() {
		return CommFunc.getViewParamByType("sys_stations");
	}


	public boolean insertSysUserRole(SysUserRoles sysUserRole) {
		sysUserRole.setId(null);
		sysUserRole.setIs_used((byte) 1);
		sysUserRole.setUpdated_at(null);
		sysUserRole.setUpdater_id(null);
		int flag=sysUserRolesMapper.insert(sysUserRole);
		if(flag==0)
		{
			return false;
		}
		return true;
	}
	public boolean updateSysUserRoleStatus(SysUserRoles sysUserRole)
	{
		SysUserRolesExample exam=new SysUserRolesExample();
		exam.or().andRole_idEqualTo(sysUserRole.getRole_id()).andUser_idEqualTo(sysUserRole.getUser_id()).andIs_usedEqualTo((byte) 1);
		List<SysUserRoles> selectByExample = sysUserRolesMapper.selectByExample(exam);
		if(selectByExample==null||selectByExample.size()==0)
		{
			return false;
		}
		else
		{
			SysUserRoles sysUserRoles = selectByExample.get(0);
			sysUserRoles.setIs_used((byte)0);
			sysUserRoles.setUpdated_at(sysUserRole.getUpdated_at());
			sysUserRoles.setUpdater_id(sysUserRole.getUpdater_id());
			sysUserRolesMapper.updateByPrimaryKey(sysUserRoles);
		}
		return true;

	}

	public boolean insertSysUserStation(SysUserStations sysUserStation)
	{
		sysUserStation.setId(null);
		sysUserStation.setIs_used((byte) 1);
		sysUserStation.setUpdated_at(null);
		sysUserStation.setUpdater_id(null);
		int flag=sysUserStationsMapper.insert(sysUserStation);
		if(flag==0)
		{
			return false;
		}
		return true;
	}
	public boolean UpdateSysUserStationStatus(SysUserStations sysUserStation) {
		SysUserStationsExample exam=new SysUserStationsExample();
		exam.or().andStation_idEqualTo(sysUserStation.getStation_id()).andUser_idEqualTo(sysUserStation.getUser_id()).andIs_usedEqualTo((byte) 1);
		 List<SysUserStations> selectByExample = sysUserStationsMapper.selectByExample(exam);
		if(selectByExample==null||selectByExample.size()==0)
		{
			return false;
		}
		else
		{
			SysUserStations sysUserStations = selectByExample.get(0);
			sysUserStations.setIs_used((byte)0);
			sysUserStations.setUpdated_at(sysUserStation.getUpdated_at());
			sysUserStations.setUpdater_id(sysUserStation.getUpdater_id());
			sysUserStationsMapper.updateByPrimaryKey(sysUserStations);
		}
		return true;
	}


    @Override
	public List<SysMenu> getSysMenus(HttpSession session) {
    	UserInfoVo userInfo=(UserInfoVo)session.getAttribute(FrameConst.SessionNames.userInfo);
		return userInfo.getSysMenus();
	}

    @Override
    public List<CurrentUserRoles> getCurrentUserRoles(HttpServletRequest request) {
        UserInfoVo userInfoVo=WebUtils.getUserInfoVo(request);
        List<SysRoles> list= userInfoVo.getSysRolesList();
        List<CurrentUserRoles> users=new ArrayList<CurrentUserRoles>();
        for(int i=0;i<list.size();i++)
        {
            CurrentUserRoles currentUserRoles=new CurrentUserRoles();
            currentUserRoles.setRoleId(list.get(i).getId());
            currentUserRoles.setRoleName(list.get(i).getRole_name());
            users.add(currentUserRoles);
        }
        return users;
    }

    @Override
    public List<CurrentUserStations> getCurrentUserStations(HttpServletRequest request) {
        UserInfoVo userInfoVo=WebUtils.getUserInfoVo(request);
        List<SysStations> list=userInfoVo.getSysStationsList();
        List<CurrentUserStations> stationses=new ArrayList<CurrentUserStations>();
        for (int i=0;i<list.size();i++)
        {
            CurrentUserStations userStations=new CurrentUserStations();
            userStations.setStationId(list.get(i).getId());
            userStations.setStationName(list.get(i).getStation_name());
            stationses.add(userStations);
        }
        return stationses;
    }

    @Override
    public List<CurrentOrgs> getCurrentOrgs(HttpServletRequest request) {
        UserInfoVo userInfoVo=WebUtils.getUserInfoVo(request);
        List<SysOrganization> list=userInfoVo.getSysOrganizations();
        List<CurrentOrgs> currentOrgses=new ArrayList<CurrentOrgs>();
        for (int i=0;i<list.size();i++)
        {
            CurrentOrgs orgs=new CurrentOrgs();
            orgs.setOrgId(list.get(i).getOrg_id());
            orgs.setOrgName(list.get(i).getOrg_name());
            currentOrgses.add(orgs);
        }
        return currentOrgses;
    }

    @Override
    public List<UserMenus> getCurrentUserMenus(HttpServletRequest request) {
        UserInfoVo userInfoVo=WebUtils.getUserInfoVo(request);
        List<UserMenus> list=new ArrayList<UserMenus>();
        List<SysMenu> sysMenus=userInfoVo.getSysMenus();
        for (int i=0;i<sysMenus.size();i++)
        {
            UserMenus userMenus=new UserMenus();
            userMenus.setMenuName(sysMenus.get(i).getMenu_name());
            userMenus.setMenuUrl(sysMenus.get(i).getMenu_url());
            list.add(userMenus);
        }
        return list;
    }


    @Override
	public void updateSysRoles(String []roleIds,Long userId, HttpServletRequest request) throws ServiceException {

        if(userId==null)
        {
            throw new ServiceException(ResultCode.param_err);
        }

		UserInfoVo  userInfoVo= WebUtils.getUserInfoVo(request);
		long time=System.currentTimeMillis();

        SysUserRoles sysUserRoles=new SysUserRole();
        sysUserRoles.setIs_used(SystemConst.SysRolesConst.IsUsed.no);
        sysUserRoles.setUpdater_id(userInfoVo.getSysUser().getUser_id());
        sysUserRoles.setUpdated_at(time);
        SysUserRolesExample sysUserRolesExample=new SysUserRolesExample();
        sysUserRolesExample.or().andUser_idEqualTo(userId).andIs_usedEqualTo(SystemConst.SysRolesConst.IsUsed.yes);
        sysUserRolesMapper.updateByExampleSelective(sysUserRoles,sysUserRolesExample);
        if(roleIds.length>0) {
            List<SysUserRoles> list1 = new ArrayList<SysUserRoles>();
            for (int i = 0; i < roleIds.length; i++) {
                SysUserRoles userRoles = new SysUserRoles();
                userRoles.setRole_id(Long.parseLong(roleIds[i]));//类型转换错误
                userRoles.setId(null);
                userRoles.setUser_id(userId);
                userRoles.setCreated_at(time);
                userRoles.setCreator_id(userInfoVo.getSysUser().getUser_id());
                userRoles.setIs_used(SystemConst.SysUserRolesConst.IsUsed.yes);
                list1.add(userRoles);
            }
            sysUserRolesMapper.insertSysUserRoles(list1);
        }

	}

	@Override
	public	void updateSysStation(String []stationIds,Long userId,HttpServletRequest request) throws ServiceException {
        if(userId==null)
        {
            throw new ServiceException(ResultCode.param_err);
        }
		UserInfoVo  userInfoVo= WebUtils.getUserInfoVo(request);
		long time=System.currentTimeMillis();
        SysUserStations sysUserStations=new SysUserStations();
        sysUserStations.setIs_used(SystemConst.SysUserStationsConst.IsUsed.no);
        sysUserStations.setUpdater_id(userInfoVo.getSysUser().getUser_id());
        sysUserStations.setUpdated_at(time);
        SysUserStationsExample example=new SysUserStationsExample();
        example.or().andUser_idEqualTo(userId).andIs_usedEqualTo(SystemConst.SysUserStationsConst.IsUsed.yes);
        sysUserStationsMapper.updateByExampleSelective(sysUserStations,example);
        if(stationIds.length>0) {
            List<SysUserStations> list1 = new ArrayList<SysUserStations>();
            for (int i = 0; i < stationIds.length; i++) {
                SysUserStations sysUserStation = new SysUserStations();
                sysUserStation.setUser_id(userId);
                sysUserStation.setStation_id(Long.parseLong(stationIds[i]));//类型转换错误。
                sysUserStation.setIs_used(SystemConst.SysUserStationsConst.IsUsed.yes);
                sysUserStation.setCreator_id(userInfoVo.getSysUser().getUser_id());
                sysUserStation.setCreated_at(time);
                sysUserStation.setId(null);
                list1.add(sysUserStation);
            }
            sysUserStationsMapper.insertUserStations(list1);
        }
	}


    public SysUserMapper getSysUserMapper() {
        return sysUserMapper;
    }

    public void setSysUserMapper(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    public SysUserRolesMapper getSysUserRolesMapper() {
        return sysUserRolesMapper;
    }

    public void setSysUserRolesMapper(SysUserRolesMapper sysUserRolesMapper) {
        this.sysUserRolesMapper = sysUserRolesMapper;
    }

    public SysUserStationsMapper getSysUserStationsMapper() {
        return sysUserStationsMapper;
    }

    public void setSysUserStationsMapper(SysUserStationsMapper sysUserStationsMapper) {
        this.sysUserStationsMapper = sysUserStationsMapper;
    }

    public SysRolesMapper getSysRolesMapper() {
        return sysRolesMapper;
    }

    public void setSysRolesMapper(SysRolesMapper sysRolesMapper) {
        this.sysRolesMapper = sysRolesMapper;
    }

    public SysStationsMapper getSysStationsMapper() {
        return sysStationsMapper;
    }

    public void setSysStationsMapper(SysStationsMapper sysStationsMapper) {
        this.sysStationsMapper = sysStationsMapper;
    }

    public SysOrganizationMapper getSysOrganizationMapper() {
        return sysOrganizationMapper;
    }

    public void setSysOrganizationMapper(SysOrganizationMapper sysOrganizationMapper) {
        this.sysOrganizationMapper = sysOrganizationMapper;
    }

    public SysMenuMapper getSysMenuMapper() {
        return sysMenuMapper;
    }

    public void setSysMenuMapper(SysMenuMapper sysMenuMapper) {
        this.sysMenuMapper = sysMenuMapper;
    }

    public SysRoleMenusMapper getSysRoleMenusMapper() {
        return sysRoleMenusMapper;
    }

    public void setSysRoleMenusMapper(SysRoleMenusMapper sysRoleMenusMapper) {
        this.sysRoleMenusMapper = sysRoleMenusMapper;
    }

    public SysStationRptsMapper getSysStationRptsMapper() {
        return sysStationRptsMapper;
    }

    public void setSysStationRptsMapper(SysStationRptsMapper sysStationRptsMapper) {
        this.sysStationRptsMapper = sysStationRptsMapper;
    }

    public SysStationOrgsMapper getSysStationOrgsMapper() {
        return sysStationOrgsMapper;
    }

    public void setSysStationOrgsMapper(SysStationOrgsMapper sysStationOrgsMapper) {
        this.sysStationOrgsMapper = sysStationOrgsMapper;
    }


}
