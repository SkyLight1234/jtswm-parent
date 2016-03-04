package com.zdpzsp.report.vo.rptCfgHeads;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class RptCfgHeadsOneReturnVo {
    private Long  headId;
    private String headName;
    private String headCol;
    private Integer orderId;
    private Long upHeadId;
    

    public Long getHeadId() {
        return headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getHeadCol() {
        return headCol;
    }

    public void setHeadCol(String headCol) {
        this.headCol = headCol;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getUpHeadId() {
        return upHeadId;
    }

    public void setUpHeadId(Long upHeadId) {
        this.upHeadId = upHeadId;
    }
}
