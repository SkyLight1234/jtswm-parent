package com.zdpzsp.system.service.impl;

import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.service.IUserService;

import javax.servlet.http.HttpSession;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public class UserServiceImpl implements IUserService {

    @Override
    public void register() {

    }

   public void login(String userName, String password, HttpSession session) throws ServiceException {
       /*  try {
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
            List<SyMenu> sysMenuList = getSysMenusByRoleIds(sysRoleIdList);
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
        }*/
    }



}
