package com.zdpzsp.system.bo;

import com.zdpzsp.system.bo.SysJtgx;
import com.zdpzsp.system.bo.SysJtgxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJtgxMapper {
    int countByExample(SysJtgxExample example);

    int deleteByExample(SysJtgxExample example);

    int deleteByPrimaryKey(Long sysJtgxId);

    int insert(SysJtgx record);

    int insertSelective(SysJtgx record);

    List<SysJtgx> selectByExample(SysJtgxExample example);

    SysJtgx selectByPrimaryKey(Long sysJtgxId);

    int updateByExampleSelective(@Param("record") SysJtgx record, @Param("example") SysJtgxExample example);

    int updateByExample(@Param("record") SysJtgx record, @Param("example") SysJtgxExample example);

    int updateByPrimaryKeySelective(SysJtgx record);

    int updateByPrimaryKey(SysJtgx record);
}