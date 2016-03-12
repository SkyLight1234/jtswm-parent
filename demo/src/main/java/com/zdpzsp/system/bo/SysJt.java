package com.zdpzsp.system.bo;

public class SysJt {
    private Long jtId;

    private String jtNickname;

    private String jtCity;

    private String jtAddress;

    private Integer jiNum;

    private Long createAt;

    private Long createId;

    private Long updateAt;

    private Long updateId;

    private Integer state;

    public Long getJtId() {
        return jtId;
    }

    public void setJtId(Long jtId) {
        this.jtId = jtId;
    }

    public String getJtNickname() {
        return jtNickname;
    }

    public void setJtNickname(String jtNickname) {
        this.jtNickname = jtNickname == null ? null : jtNickname.trim();
    }

    public String getJtCity() {
        return jtCity;
    }

    public void setJtCity(String jtCity) {
        this.jtCity = jtCity == null ? null : jtCity.trim();
    }

    public String getJtAddress() {
        return jtAddress;
    }

    public void setJtAddress(String jtAddress) {
        this.jtAddress = jtAddress == null ? null : jtAddress.trim();
    }

    public Integer getJiNum() {
        return jiNum;
    }

    public void setJiNum(Integer jiNum) {
        this.jiNum = jiNum;
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