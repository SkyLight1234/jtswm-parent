package com.zdpzsp.note.bo;

import com.zdpzsp.note.bo.ResFile;
import com.zdpzsp.note.bo.ResFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResFileMapper {
    int countByExample(ResFileExample example);

    int deleteByExample(ResFileExample example);

    int deleteByPrimaryKey(Long res_id);

    int insert(ResFile record);

    int insertSelective(ResFile record);

    List<ResFile> selectByExample(ResFileExample example);

    ResFile selectByPrimaryKey(Long res_id);

    int updateByExampleSelective(@Param("record") ResFile record, @Param("example") ResFileExample example);

    int updateByExample(@Param("record") ResFile record, @Param("example") ResFileExample example);

    int updateByPrimaryKeySelective(ResFile record);

    int updateByPrimaryKey(ResFile record);
}