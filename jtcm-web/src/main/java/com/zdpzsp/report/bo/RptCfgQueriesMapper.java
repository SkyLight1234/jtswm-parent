package com.zdpzsp.report.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RptCfgQueriesMapper {
    int countByExample(RptCfgQueriesExample example);

    int deleteByExample(RptCfgQueriesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RptCfgQueries record);

    int insertSelective(RptCfgQueries record);

    List<RptCfgQueries> selectByExample(RptCfgQueriesExample example);

    RptCfgQueries selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RptCfgQueries record, @Param("example") RptCfgQueriesExample example);

    int updateByExample(@Param("record") RptCfgQueries record, @Param("example") RptCfgQueriesExample example);

    int updateByPrimaryKeySelective(RptCfgQueries record);

    int updateByPrimaryKey(RptCfgQueries record);
}