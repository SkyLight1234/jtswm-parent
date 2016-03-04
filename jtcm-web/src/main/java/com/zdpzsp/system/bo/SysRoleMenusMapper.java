package com.zdpzsp.system.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleMenusMapper {
    int countByExample(SysRoleMenusExample example);

    int deleteByExample(SysRoleMenusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenus record);

    int insertSelective(SysRoleMenus record);

    List<SysRoleMenus> selectByExample(SysRoleMenusExample example);

    SysRoleMenus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleMenus record, @Param("example") SysRoleMenusExample example);

    int updateByExample(@Param("record") SysRoleMenus record, @Param("example") SysRoleMenusExample example);

    int updateByPrimaryKeySelective(SysRoleMenus record);

    int updateByPrimaryKey(SysRoleMenus record);
}