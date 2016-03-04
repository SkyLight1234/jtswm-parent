package com.zdpzsp.report.vo.rptCfgHeads;

import java.util.List;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class RptCfgHeadsRootReturnVo {
    private List<RptCfgHeadsOneReturnVo> rptCfgHeadsOneReturnVos;
    private List<RptCfgHeadsTwoReturnVo> rptCfgHeadsTwoReturnVos;

    public List<RptCfgHeadsOneReturnVo> getRptCfgHeadsOneReturnVos() {
        return rptCfgHeadsOneReturnVos;
    }

    public void setRptCfgHeadsOneReturnVos(List<RptCfgHeadsOneReturnVo> rptCfgHeadsOneReturnVos) {
        this.rptCfgHeadsOneReturnVos = rptCfgHeadsOneReturnVos;
    }

    public List<RptCfgHeadsTwoReturnVo> getRptCfgHeadsTwoReturnVos() {
        return rptCfgHeadsTwoReturnVos;
    }

    public void setRptCfgHeadsTwoReturnVos(List<RptCfgHeadsTwoReturnVo> rptCfgHeadsTwoReturnVos) {
        this.rptCfgHeadsTwoReturnVos = rptCfgHeadsTwoReturnVos;
    }
}
