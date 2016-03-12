package com.zdpzsp.system.bo;

import com.zdpzsp.system.bo.SysJt;
import com.zdpzsp.system.bo.SysJtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJtMapper {
    int countByExample(SysJtExample example);

    int deleteByExample(SysJtExample example);

    int deleteByPrimaryKey(Long jtId);

    int insert(SysJt record);

    int insertSelective(SysJt record);

    List<SysJt> selectByExample(SysJtExample example);

    SysJt selectByPrimaryKey(Long jtId);

    int updateByExampleSelective(@Param("record") SysJt record, @Param("example") SysJtExample example);

    int updateByExample(@Param("record") SysJt record, @Param("example") SysJtExample example);

    int updateByPrimaryKeySelective(SysJt record);

    int updateByPrimaryKey(SysJt record);
}