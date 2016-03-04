package com.zdpzsp.system.bo;

import com.zdpzsp.system.bo.SysLabel;
import com.zdpzsp.system.bo.SysLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLabelMapper {
    int countByExample(SysLabelExample example);

    int deleteByExample(SysLabelExample example);

    int deleteByPrimaryKey(Long sysLabelId);

    int insert(SysLabel record);

    int insertSelective(SysLabel record);

    List<SysLabel> selectByExample(SysLabelExample example);

    SysLabel selectByPrimaryKey(Long sysLabelId);

    int updateByExampleSelective(@Param("record") SysLabel record, @Param("example") SysLabelExample example);

    int updateByExample(@Param("record") SysLabel record, @Param("example") SysLabelExample example);

    int updateByPrimaryKeySelective(SysLabel record);

    int updateByPrimaryKey(SysLabel record);
}