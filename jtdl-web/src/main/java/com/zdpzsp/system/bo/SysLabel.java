package com.zdpzsp.system.bo;

public class SysLabel {
    private Long sysLabelId;

    private String sysLabelName;

    private String sysLabelRemark;

    private Long sysUserId;

    private String sysRoleName;

    private Long createAt;

    private Long createId;

    private Long updateAt;

    private Long updateId;

    private Integer state;

    public Long getSysLabelId() {
        return sysLabelId;
    }

    public void setSysLabelId(Long sysLabelId) {
        this.sysLabelId = sysLabelId;
    }

    public String getSysLabelName() {
        return sysLabelName;
    }

    public void setSysLabelName(String sysLabelName) {
        this.sysLabelName = sysLabelName == null ? null : sysLabelName.trim();
    }

    public String getSysLabelRemark() {
        return sysLabelRemark;
    }

    public void setSysLabelRemark(String sysLabelRemark) {
        this.sysLabelRemark = sysLabelRemark == null ? null : sysLabelRemark.trim();
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysRoleName() {
        return sysRoleName;
    }

    public void setSysRoleName(String sysRoleName) {
        this.sysRoleName = sysRoleName == null ? null : sysRoleName.trim();
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