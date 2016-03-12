package com.zdpzsp.system.bo;

public class SysJtgx {
    private Long sysJtgxId;

    private String sysJtgxName;

    private String sysJtgxRemark;

    private Long createAt;

    private Long createId;

    private Long updateAt;

    private Long updateId;

    private Integer state;

    public Long getSysJtgxId() {
        return sysJtgxId;
    }

    public void setSysJtgxId(Long sysJtgxId) {
        this.sysJtgxId = sysJtgxId;
    }

    public String getSysJtgxName() {
        return sysJtgxName;
    }

    public void setSysJtgxName(String sysJtgxName) {
        this.sysJtgxName = sysJtgxName == null ? null : sysJtgxName.trim();
    }

    public String getSysJtgxRemark() {
        return sysJtgxRemark;
    }

    public void setSysJtgxRemark(String sysJtgxRemark) {
        this.sysJtgxRemark = sysJtgxRemark == null ? null : sysJtgxRemark.trim();
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}