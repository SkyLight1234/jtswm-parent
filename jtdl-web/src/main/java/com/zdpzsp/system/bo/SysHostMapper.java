package com.zdpzsp.system.bo;

import com.zdpzsp.system.bo.SysHost;
import com.zdpzsp.system.bo.SysHostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysHostMapper {
    int countByExample(SysHostExample example);

    int deleteByExample(SysHostExample example);

    int deleteByPrimaryKey(Long sys_host_id);

    int insert(SysHost record);

    int insertSelective(SysHost record);

    List<SysHost> selectByExample(SysHostExample example);

    SysHost selectByPrimaryKey(Long sys_host_id);

    int updateByExampleSelective(@Param("record") SysHost record, @Param("example") SysHostExample example);

    int updateByExample(@Param("record") SysHost record, @Param("example") SysHostExample example);

    int updateByPrimaryKeySelective(SysHost record);

    int updateByPrimaryKey(SysHost record);
}