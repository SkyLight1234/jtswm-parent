package com.zdpzsp.report.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RptCfgHeadsMapper {
    int countByExample(RptCfgHeadsExample example);

    int deleteByExample(RptCfgHeadsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RptCfgHeads record);

    int insertSelective(RptCfgHeads record);

    List<RptCfgHeads> selectByExample(RptCfgHeadsExample example);

    RptCfgHeads selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RptCfgHeads record, @Param("example") RptCfgHeadsExample example);

    int updateByExample(@Param("record") RptCfgHeads record, @Param("example") RptCfgHeadsExample example);

    int updateByPrimaryKeySelective(RptCfgHeads record);

    int updateByPrimaryKey(RptCfgHeads record);
}