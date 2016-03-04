package com.zdpzsp.system.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserRolesMapper {
    int countByExample(SysUserRolesExample example);

    int deleteByExample(SysUserRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRoles record);

    int insertSelective(SysUserRoles record);

    List<SysUserRoles> selectByExample(SysUserRolesExample example);

    SysUserRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserRoles record, @Param("example") SysUserRolesExample example);

    int updateByExample(@Param("record") SysUserRoles record, @Param("example") SysUserRolesExample example);

    int updateByPrimaryKeySelective(SysUserRoles record);

    int updateByPrimaryKey(SysUserRoles record);

    int insertSysUserRoles(List<SysUserRoles> records);
}