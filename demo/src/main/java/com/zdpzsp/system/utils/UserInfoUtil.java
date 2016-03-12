package com.zdpzsp.system.utils;

import com.zdpzsp.system.SystemConst;
import com.zdpzsp.system.bo.SysRoles;
import com.zdpzsp.system.service.IUserService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiong on 2015/11/24.
 */
public class UserInfoUtil {

    private static Map<Long,SysRoles> sysRolesMap=new HashMap<Long,SysRoles>();//角色map   key为角色id
  /*  private static Map<Long,SysMenu> sysMenuMap=new HashMap<Long,SysMenu>();//菜单map key为菜单id

    private static Map<Long,SysStations> sysStationsMap=new HashMap<Long,SysStations>(); //岗位map key为岗位id
    private static Map<Long,SysOrganization> sysOrganizationMap=new HashMap<Long,SysOrganization>();//组织map key组织id


    private static Map<Long,List<SysMenu>> sysRolesMenu=new HashMap<Long,List<SysMenu>>();//角色菜单map   key为角色id
    private static Map<Long,List<SysOrganization>> sysStationsOrganization=new HashMap<Long,List<SysOrganization>>();//岗位组织map key为岗位id
    private static Map<Long,Set<Long>> sysStationsRepIdMap=new HashMap<Long,Set<Long>>(); //岗位对报表id 的map  key为岗位id*/


    public static void init(IUserService userService)
    {
        sysRolesMap=userService.getSysRolesMap(SystemConst.GobalCfg.State.enable);
        /*sysMenuMap=userService.getSysMenusMap(SystemConst.SysMenuConst.menu_state.enabled);

        sysStationsMap=userService.getSysStationsMap(SystemConst.SysStations.IsUsed.yes);
        sysOrganizationMap=userService.getSysOrganizationMap(SystemConst.SysOrganizationConst.state.enabled);

        sysRolesMenu=packageSysRolesMenu(userService);
        sysStationsOrganization=packageSysStationsOrganization(userService);
        sysStationsRepIdMap=packageSysStationsRepIdMap(userService);*/
    }

    /**
     * 组装岗位的报表id
     * @param userService
     * @return
     *//*
    private static Map<Long,Set<Long>> packageSysStationsRepIdMap(IUserService userService) {
        List<SysStationRpts> sysStationRptsList = userService.getSysStationRptsList(SystemConst.SysStationRptsConst.IsUsed.yes);
        Map<Long,Set<Long>> sysStationsRepIdMapTemp=new HashMap<Long,Set<Long>>();
        if (sysStationRptsList != null && !sysStationRptsList.isEmpty())
        {
            for (SysStationRpts sysStationRpts:sysStationRptsList)
            {
                Set<Long> sysStationsRepSet=sysStationsRepIdMapTemp.get(sysStationRpts.getStation_id());
                if(sysStationsRepSet==null)
                {
                    sysStationsRepSet=new HashSet<Long>();
                    sysStationsRepIdMapTemp.put(sysStationRpts.getStation_id(),sysStationsRepSet);
                }
                sysStationsRepSet.add(sysStationRpts.getRpt_id());
            }
        }
        return  sysStationsRepIdMapTemp;
    }

    *//**
     * 组装岗位的组织
     * @param userService
     * @return
     *//*
    private static Map<Long,List<SysOrganization>> packageSysStationsOrganization(IUserService userService) {
        List<SysStationOrgs> sysStationOrgsList=userService.getSysStationOrgsList(SystemConst.SysStationOrgsConst.IsUsed.yes);
        Map<Long,List<SysOrganization>> sysStationsOrganizationTemp=new HashMap<Long,List<SysOrganization>>();

        Set<Long> hasMaxOrg=new HashSet<Long>();
        if(sysStationOrgsList!=null&&!sysStationOrgsList.isEmpty())
        {
            for (SysStationOrgs sysStationOrgs:sysStationOrgsList)
            {
                List<SysOrganization> sysStationsOrganizationList=sysStationsOrganizationTemp.get(sysStationOrgs.getStation_id());
                if(sysStationsOrganizationList==null)
                {
                    sysStationsOrganizationList=new ArrayList<SysOrganization>();
                    sysStationsOrganizationTemp.put(sysStationOrgs.getStation_id(),sysStationsOrganizationList);
                }
                if(9999==sysStationOrgs.getOrg_id())
                {
                    hasMaxOrg.add(sysStationOrgs.getStation_id());
                }else
                {
                    sysStationsOrganizationList.add(getSysOrganizationByOrgId(sysStationOrgs.getOrg_id()));
                }
            }
        }
        if(!hasMaxOrg.isEmpty())
        {
            List<SysOrganization> sysOrganizationList=new ArrayList<SysOrganization>();
            if(!sysOrganizationMap.isEmpty())
            {
                for (Long key:sysOrganizationMap.keySet()){
                    sysOrganizationList.add(sysOrganizationMap.get(key));
                }
            }
            for (Long stationId:hasMaxOrg)
            {
                List<SysOrganization> sysOrganizationListtemp=sysStationsOrganizationTemp.get(stationId);
                sysOrganizationListtemp.clear();
                sysOrganizationListtemp.addAll(sysOrganizationList);
            }

        }
        return sysStationsOrganizationTemp;
    }

    *//**
     * 组装角色的菜单
     * @param userService
     * @return
     *//*
    private static Map<Long,List<SysMenu>> packageSysRolesMenu(IUserService userService) {
        List<SysRoleMenus> sysRoleMenusList=userService.sysRoleMenusList(SystemConst.SysRoleMenusConst.IsUsed.yes);
        Map<Long,List<SysMenu>> sysRolesMenuTemp=new HashMap<Long,List<SysMenu>>();
        if(sysRoleMenusList!=null&&!sysRoleMenusList.isEmpty())
        {
            for (SysRoleMenus sysRoleMenus:sysRoleMenusList)
            {
                List<SysMenu> sysRolesMenusList=sysRolesMenuTemp.get(sysRoleMenus.getRole_id());
                if(sysRolesMenusList==null)
                {
                    sysRolesMenusList=new ArrayList<SysMenu>();
                    sysRolesMenuTemp.put(sysRoleMenus.getRole_id(),sysRolesMenusList);
                }
                sysRolesMenusList.add(getSysMenuByMenuId(sysRoleMenus.getMenu_id()));
            }
        }
        return sysRolesMenuTemp;
    }




    *//**
     * 根据id获得角色信息
     * @param roleId
     * @return
     *//*
    public static SysRoles getSysRolesByRoleId(long roleId)
    {
        return CommonUtil.copyObj(sysRolesMap.get(roleId));
    }

    *//**
     * 根据角色id获取该角色下的菜单
     * @param roleId
     * @return
     *//*
    public static List<SysMenu> getSysMenuByRoleId(long roleId)
    {
        List<SysMenu> sysMenus=sysRolesMenu.get(roleId);
        return CommonUtil.copyObj(sysMenus);
    }

    *//**
     * 根据角色id集合 获取该集合下的菜单（去重复）
     * @param roleIdList
     * @return
     *//*
    public static List<SysMenu> getSysMenuByRoleIds(List<Long> roleIdList)
    {
        Map<Long,SysMenu> sysMenusMap=new HashMap<Long,SysMenu>();
        for (Long aLong:roleIdList)//将所有角色的菜单存入map  达到去重复
        {
            List<SysMenu> sysMenusList=getSysMenuByRoleId(aLong);
            if(sysMenusList!=null) {
                for (SysMenu sysMenu:sysMenusList)
                {
                    sysMenusMap.put(sysMenu.getMenu_id(),sysMenu);
                }
            }
        }
        List<SysMenu> sysMenusList=new ArrayList<SysMenu>();
        if(!sysMenusMap.isEmpty())//将map中的菜单转换为list
        {
            for (Long key:sysMenusMap.keySet())
            {
                sysMenusList.add(sysMenusMap.get(key));
            }
        }
        Collections.sort(sysMenusList, new Comparator<SysMenu>() {
            @Override
            public int compare(SysMenu o1, SysMenu o2) {
                return o1.getMenu_order()<o2.getMenu_order()?1:-1;
            }
        });
        return sysMenusList;
    }


    *//**
     * 根据id获取岗位信息
     * @param station_id
     * @return
     *//*
    public static SysStations getSysStationsByStationId(long station_id)
    {
        return CommonUtil.copyObj(sysStationsMap.get(station_id));
    }


    *//**
     * 根据岗位查询组织
     * @param stationId
     * @return
     *//*
    public static List<SysOrganization> getSysOrganizationByStationIds(long stationId)
    {
        List<SysOrganization> sysMenus=sysStationsOrganization.get(stationId);
        return CommonUtil.copyObj(sysMenus);
    }

    *//**
     * 根据岗位List查询组织（去重复）
     * @param stationIdList
     * @return
     *//*
    public static List<SysOrganization> getSysOrganizationByStationIds(List<Long> stationIdList)
    {
        Map<Long,SysOrganization> SysOrganizationMap=new HashMap<Long,SysOrganization>();
        for (Long aLong:stationIdList)//将所有岗位的组织存入map  达到去重复
        {
            List<SysOrganization> sysOrganizations=getSysOrganizationByStationIds(aLong);
            if(sysOrganizations!=null) {
                for (SysOrganization sysOrganization:sysOrganizations)
                {
                    SysOrganizationMap.put(sysOrganization.getOrg_id(),sysOrganization);
                }
            }
        }
        List<SysOrganization> sysOrganizations=new ArrayList<SysOrganization>();
        if(!SysOrganizationMap.isEmpty())//将map中的组织转换为list
        {
            for (Long key:SysOrganizationMap.keySet())
            {
                sysOrganizations.add(SysOrganizationMap.get(key));
            }
        }
        Collections.sort(sysOrganizations, new Comparator<SysOrganization>() {
            @Override
            public int compare(SysOrganization o1, SysOrganization o2) {
                return o1.getOrg_id()>o2.getOrg_id()?1:-1;
            }
        });
        return sysOrganizations;
    }

    public static Set<Long> getSysRepByStationIds(Long stationIds) {
        return CommonUtil.copyObj(sysStationsRepIdMap.get(stationIds));
    }
    *//**
     * 根据 岗位id 查询用户报表id
     * @param stationIds
     * @return
     *//*
    public static Set<Long> getSysRepByStationIds(List<Long> stationIds) {
        Set<Long> tempSet=new HashSet<Long>();
        if(stationIds!=null&&!stationIds.isEmpty()){
            for (Long stationId:stationIds)
            {
                Set<Long> longs=getSysRepByStationIds(stationId);
                if(longs!=null)
                {
                    tempSet.addAll(longs);
                }
            }
        }
        return tempSet;
    }

    *//**
     * 根据id获得菜单
     * @param menuId
     * @return
     *//*
    public static SysMenu getSysMenuByMenuId(long menuId)
    {
       return CommonUtil.copyObj(sysMenuMap.get(menuId));
    }

    *//**
     * 根据id获得组织
     * @param orgId
     * @return
     *//*
    public static SysOrganization getSysOrganizationByOrgId(Long orgId)
    {
        return CommonUtil.copyObj(sysOrganizationMap.get(orgId));
    }

   public static void main(String[] args) {
        SysUser sysUser=new SysUser();
        sysUser.setUser_id(1l);
        SysUser sysUser2=CommonUtil.copyObj(sysUser);

       Set<SysUser> sysUsers=new HashSet<SysUser>();
       sysUsers.add(sysUser);
       sysUsers.add(sysUser);
       sysUsers.add(sysUser2);
       System.out.println(1);

    }*/



}
