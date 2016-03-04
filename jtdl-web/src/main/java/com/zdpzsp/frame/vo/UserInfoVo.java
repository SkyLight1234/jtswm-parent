package com.zdpzsp.frame.vo;

import com.zdpzsp.system.bo.*;

import java.util.List;
import java.util.Set;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public class UserInfoVo {
    private SysUser sysUser;
    private List<SysRoles> sysRolesList;
    private List<SysMenu> sysMenus;
    private List<SysStations> sysStationsList;
    private List<SysOrganization> sysOrganizations;
    private Set<Long> repIds;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public List<SysRoles> getSysRolesList() {
        return sysRolesList;
    }

    public void setSysRolesList(List<SysRoles> sysRolesList) {
        this.sysRolesList = sysRolesList;
    }

    public List<SysMenu> getSysMenus() {
        return sysMenus;
    }

    public void setSysMenus(List<SysMenu> sysMenus) {
        this.sysMenus = sysMenus;
    }

    public List<SysStations> getSysStationsList() {
        return sysStationsList;
    }

    public void setSysStationsList(List<SysStations> sysStationsList) {
        this.sysStationsList = sysStationsList;
    }

    public List<SysOrganization> getSysOrganizations() {
        return sysOrganizations;
    }

    public void setSysOrganizations(List<SysOrganization> sysOrganizations) {
        this.sysOrganizations = sysOrganizations;
    }

    public Set<Long> getRepIds() {
        return repIds;
    }

    public void setRepIds(Set<Long> repIds) {
        this.repIds = repIds;
    }
}
