package com.zdpzsp.frame.bo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface View_paramMapper {
    int countByExample(View_paramExample example);

    int deleteByExample(View_paramExample example);

    int insert(View_param record);

    int insertSelective(View_param record);

    List<View_param> selectByExample(View_paramExample example);

    int updateByExampleSelective(@Param("record") View_param record, @Param("example") View_paramExample example);

    int updateByExample(@Param("record") View_param record, @Param("example") View_paramExample example);
}