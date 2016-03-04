package com.zdpzsp.report.vo.rptCfgHeads;

import com.zdpzsp.report.bo.RptCfgHeads;

import java.util.List;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class RptCfgHeadsRootVo {
    private  List<RptCfgHeads> oneRptCfgHeadsList;
    private List<RptCfgHeads> twoRptCfgHeadsList;

    public List<RptCfgHeads> getOneRptCfgHeadsList() {
        return oneRptCfgHeadsList;
    }

    public void setOneRptCfgHeadsList(List<RptCfgHeads> oneRptCfgHeadsList) {
        this.oneRptCfgHeadsList = oneRptCfgHeadsList;
    }

    public List<RptCfgHeads> getTwoRptCfgHeadsList() {
        return twoRptCfgHeadsList;
    }

    public void setTwoRptCfgHeadsList(List<RptCfgHeads> twoRptCfgHeadsList) {
        this.twoRptCfgHeadsList = twoRptCfgHeadsList;
    }
}
