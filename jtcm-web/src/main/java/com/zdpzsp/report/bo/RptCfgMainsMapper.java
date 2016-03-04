package com.zdpzsp.report.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RptCfgMainsMapper {
    int countByExample(RptCfgMainsExample example);

    int deleteByExample(RptCfgMainsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RptCfgMains record);

    int insertSelective(RptCfgMains record);

    List<RptCfgMains> selectByExample(RptCfgMainsExample example);

    RptCfgMains selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RptCfgMains record, @Param("example") RptCfgMainsExample example);

    int updateByExample(@Param("record") RptCfgMains record, @Param("example") RptCfgMainsExample example);

    int updateByPrimaryKeySelective(RptCfgMains record);

    int updateByPrimaryKey(RptCfgMains record);
}