package com.zdpzsp.report.vo.rptCfgMains;

import java.util.List;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class RptCfgMainsRootReturnVo {
    private String rptName;
    private List<RptCfgMainsReturnVo> rptCfgMainsReturnVos;

    public String getRptName() {
        return rptName;
    }

    public void setRptName(String rptName) {
        this.rptName = rptName;
    }

    public List<RptCfgMainsReturnVo> getRptCfgMainsReturnVos() {
        return rptCfgMainsReturnVos;
    }

    public void setRptCfgMainsReturnVos(List<RptCfgMainsReturnVo> rptCfgMainsReturnVos) {
        this.rptCfgMainsReturnVos = rptCfgMainsReturnVos;
    }
}
