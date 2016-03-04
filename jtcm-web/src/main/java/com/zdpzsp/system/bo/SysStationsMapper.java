package com.zdpzsp.system.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysStationsMapper {
    int countByExample(SysStationsExample example);

    int deleteByExample(SysStationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysStations record);

    int insertSelective(SysStations record);

    List<SysStations> selectByExample(SysStationsExample example);

    SysStations selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysStations record, @Param("example") SysStationsExample example);

    int updateByExample(@Param("record") SysStations record, @Param("example") SysStationsExample example);

    int updateByPrimaryKeySelective(SysStations record);

    int updateByPrimaryKey(SysStations record);
}