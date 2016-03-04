package com.zdpzsp.report.vo.rptCfgMains;

import com.zdpzsp.report.bo.RptCfgMains;

import java.util.List;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class RptCfgMainsRootVo {
    private RptCfgMains rootRptCfgMains;
    private List<RptCfgMains> rptCfgMainsList;

    public RptCfgMains getRootRptCfgMains() {
        return rootRptCfgMains;
    }

    public void setRootRptCfgMains(RptCfgMains rootRptCfgMains) {
        this.rootRptCfgMains = rootRptCfgMains;
    }

    public List<RptCfgMains> getRptCfgMainsList() {
        return rptCfgMainsList;
    }

    public void setRptCfgMainsList(List<RptCfgMains> rptCfgMainsList) {
        this.rptCfgMainsList = rptCfgMainsList;
    }
}
