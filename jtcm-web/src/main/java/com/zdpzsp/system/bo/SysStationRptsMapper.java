package com.zdpzsp.system.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysStationRptsMapper {
    int countByExample(SysStationRptsExample example);

    int deleteByExample(SysStationRptsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysStationRpts record);

    int insertSelective(SysStationRpts record);

    List<SysStationRpts> selectByExample(SysStationRptsExample example);

    SysStationRpts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysStationRpts record, @Param("example") SysStationRptsExample example);

    int updateByExample(@Param("record") SysStationRpts record, @Param("example") SysStationRptsExample example);

    int updateByPrimaryKeySelective(SysStationRpts record);

    int updateByPrimaryKey(SysStationRpts record);
}