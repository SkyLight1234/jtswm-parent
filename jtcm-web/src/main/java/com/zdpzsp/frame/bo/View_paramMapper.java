package com.zdpzsp.frame.bo;

import java.util.List;

public interface View_paramMapper {
    int countByExample(View_paramExample example);

    List<View_param> selectByExample(View_paramExample example);
}