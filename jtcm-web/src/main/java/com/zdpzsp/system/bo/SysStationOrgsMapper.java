package com.zdpzsp.system.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysStationOrgsMapper {
    int countByExample(SysStationOrgsExample example);

    int deleteByExample(SysStationOrgsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysStationOrgs record);

    int insertSelective(SysStationOrgs record);

    List<SysStationOrgs> selectByExample(SysStationOrgsExample example);

    SysStationOrgs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysStationOrgs record, @Param("example") SysStationOrgsExample example);

    int updateByExample(@Param("record") SysStationOrgs record, @Param("example") SysStationOrgsExample example);

    int updateByPrimaryKeySelective(SysStationOrgs record);

    int updateByPrimaryKey(SysStationOrgs record);
}