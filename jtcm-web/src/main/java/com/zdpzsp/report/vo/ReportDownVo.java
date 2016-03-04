package com.zdpzsp.report.vo;

import java.io.InputStream;

/**
 * Created by xiaxia on 2015/12/1 .
 */
public class ReportDownVo {
    private String name;
    private InputStream data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputStream getData() {
        return data;
    }

    public void setData(InputStream data) {
        this.data = data;
    }
}
