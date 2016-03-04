package com.zdpzsp.system.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserStationsMapper {
    int countByExample(SysUserStationsExample example);

    int deleteByExample(SysUserStationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserStations record);

    int insertSelective(SysUserStations record);

    List<SysUserStations> selectByExample(SysUserStationsExample example);

    SysUserStations selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserStations record, @Param("example") SysUserStationsExample example);

    int updateByExample(@Param("record") SysUserStations record, @Param("example") SysUserStationsExample example);

    int updateByPrimaryKeySelective(SysUserStations record);

    int updateByPrimaryKey(SysUserStations record);

    int insertUserStations(List<SysUserStations> records);
}