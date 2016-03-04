package com.zdpzsp.system.service;

import com.zdpzsp.frame.bo.View_param;
import com.zdpzsp.frame.db.mybatis.interceptor.Page;
import com.zdpzsp.system.bo.*;
import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.vo.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public interface IUserService {
    void login(String userName, String password, HttpSession session) throws ServiceException;

    /**
     * 根据用户username查找用户
     * @param userName
     * @return
     */
    SysUser getSysUserByUserName(String userName);

    /**
     * 根据userId 查询用户角色关系
     * @param userId
     * @return
     */
    List<SysRoles> getSysRolesByUserId(long userId);

    /**
     * 根据角色id集合  查询菜单
     * @param roleIds
     * @return
     */
    List<SysMenu> getSysMenusByRoleIds(List<Long> roleIds);

    /**
     * 根据userId 查询用户岗位关系
     * @param userId
     * @return
     */
    List<SysStations> getSysStationsByUserId(long userId);

    /**
     * 根据 岗位id 查询用户报表id
     * @param stationIds
     * @return
     */
    public Set<Long> getSysRepByStationIds(List<Long> stationIds);
    /**
     * 根据 岗位id 查询用户组织
     * @param stationIds
     * @return
     */
    List<SysOrganization> getSysOrganizationByStationIds(List<Long> stationIds);

    /**
     * 查询系统角色
     * @param isUsed
     * @return
     */
    List<SysRoles> getSysRolesList(byte isUsed);
    /**
     * 查询系统角色Map
     * @param isUsed
     * @return
     */
    Map<Long,SysRoles> getSysRolesMap(byte isUsed);

    /**
     * 查询系统菜单
     * @param menu_state
     * @return
     */
    List<SysMenu> getSysMenusList(int menu_state);

    /**
     * 查询系统菜单Map
     * @param menu_state
     * @return
     */
    Map<Long,SysMenu> getSysMenusMap(int menu_state);

    /**
     * 查询系统岗位
     * @param isUsed
     * @return
     */
    List<SysStations> getSysStationsList(byte isUsed);

    /**
     * 查询系统岗位Map
     * @param isUsed
     * @return
     */
    Map<Long,SysStations> getSysStationsMap(byte isUsed);

    /**
     * 查询系统组织
     * @param state
     * @return
     */
    List<SysOrganization> getSysOrganizationList(int state);

    /**
     * 查询系统组织map
     * @param state
     * @return
     */
    Map<Long,SysOrganization> getSysOrganizationMap(int state);

    /**
     * 查询系统角色菜单关系
     * @param isUsed
     * @return
     */
    List<SysRoleMenus> sysRoleMenusList(byte isUsed);

    /**
     * 查询岗位对报表关系
     * @param isUsed
     * @return
     */
    List<SysStationRpts> getSysStationRptsList(byte isUsed);

    /**
     * 查询岗位对组织关系
     * @param isUsed
     * @return
     */
    List<SysStationOrgs> getSysStationOrgsList(byte isUsed);




    /**
     * 获取可用用户列表
     */
    void getEnableUserTable(Page<SysUser> page);
    /**
     * 从缓存里面获取所有的系统角色
     * @return
     */
    List<View_param> getAllSysRolesFromCache();
    /**
     * 从缓存里面获取所有的系统岗位
     * @return
     */
    List<View_param> getAllSysStationsFromCache();


    /**
     * 修改用户的角色
     * @param roleIds 角色ID数组
     * @param userId 被修改用户ID
     * @param request 用于获取当前用户ID
     */
    void updateSysRoles(String[] roleIds, Long userId, HttpServletRequest request) throws ServiceException;


    /**
     * 修改用户岗位
     * @param stationIds 岗位ID数组
     * @param userId 被修改用户ID
     * @param request 用于获取当前用户ID
     */
    void updateSysStation(String[] stationIds, Long userId, HttpServletRequest request) throws ServiceException;

    /**
     * 获取系统菜单
     * @param session
     * @return
     */
    List<SysMenu> getSysMenus(HttpSession session);

    /**
     * 获取当前用户角色
     * @param request
     * @return list列表
     */
    List<CurrentUserRoles> getCurrentUserRoles(HttpServletRequest request);

    /**
     * 获取当前用户岗位
     * @param request
     * @return list列表
     */
    List<CurrentUserStations> getCurrentUserStations(HttpServletRequest request);

    /**
     * 获取当前用户组织
     * @param request
     * @return list列表
     */
    List<CurrentOrgs> getCurrentOrgs(HttpServletRequest request);

    /**
     * 获取当前用户菜单
     * @param request
     * @return list列表
     */
    List<UserMenus> getCurrentUserMenus(HttpServletRequest request);
}
