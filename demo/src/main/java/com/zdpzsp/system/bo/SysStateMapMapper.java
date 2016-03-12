package com.zdpzsp.system.bo;

import com.zdpzsp.system.bo.SysStateMap;
import com.zdpzsp.system.bo.SysStateMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStateMapMapper {
    int countByExample(SysStateMapExample example);

    int deleteByExample(SysStateMapExample example);

    int deleteByPrimaryKey(Long stateId);

    int insert(SysStateMap record);

    int insertSelective(SysStateMap record);

    List<SysStateMap> selectByExample(SysStateMapExample example);

    SysStateMap selectByPrimaryKey(Long stateId);

    int updateByExampleSelective(@Param("record") SysStateMap record, @Param("example") SysStateMapExample example);

    int updateByExample(@Param("record") SysStateMap record, @Param("example") SysStateMapExample example);

    int updateByPrimaryKeySelective(SysStateMap record);

    int updateByPrimaryKey(SysStateMap record);
}