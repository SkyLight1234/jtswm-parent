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

    public Set<Long> getRepIds() {
        return repIds;
    }

    public void setRepIds(Set<Long> repIds) {
        this.repIds = repIds;
    }
}
