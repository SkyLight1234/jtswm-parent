package com.zdpzsp.note.bo;

import com.zdpzsp.note.bo.WorkBookLabel;
import com.zdpzsp.note.bo.WorkBookLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkBookLabelMapper {
    int countByExample(WorkBookLabelExample example);

    int deleteByExample(WorkBookLabelExample example);

    int deleteByPrimaryKey(Long wb_lable_id);

    int insert(WorkBookLabel record);

    int insertSelective(WorkBookLabel record);

    List<WorkBookLabel> selectByExample(WorkBookLabelExample example);

    WorkBookLabel selectByPrimaryKey(Long wb_lable_id);

    int updateByExampleSelective(@Param("record") WorkBookLabel record, @Param("example") WorkBookLabelExample example);

    int updateByExample(@Param("record") WorkBookLabel record, @Param("example") WorkBookLabelExample example);

    int updateByPrimaryKeySelective(WorkBookLabel record);

    int updateByPrimaryKey(WorkBookLabel record);
}