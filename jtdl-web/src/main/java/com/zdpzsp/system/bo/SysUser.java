package com.zdpzsp.system.bo;

public class SysUser {
    private Long sysUserId;

    private String sysAccount;

    private String sysPassword;

    private String headUrl;

    private String sysUserNickname;

    private Long createAt;

    private Long createId;

    private Long updateAt;

    private Long updateId;

    private Integer state;

    private Long jtId;

    private Integer isHead;

    private Long sysJtgxId;

    private String sysJtgxName;

    private String sysUserPhone2;

    private String userEmail;

    private String sex;

    private Long birthday;

    private Integer userState;

    private String address;

    private String school;

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysAccount() {
        return sysAccount;
    }

    public void setSysAccount(String sysAccount) {
        this.sysAccount = sysAccount == null ? null : sysAccount.trim();
    }

    public String getSysPassword() {
        return sysPassword;
    }

    public void setSysPassword(String sysPassword) {
        this.sysPassword = sysPassword == null ? null : sysPassword.trim();
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    public String getSysUserNickname() {
        return sysUserNickname;
    }

    public void setSysUserNickname(String sysUserNickname) {
        this.sysUserNickname = sysUserNickname == null ? null : sysUserNickname.trim();
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

    public Long getJtId() {
        return jtId;
    }

    public void setJtId(Long jtId) {
        this.jtId = jtId;
    }

    public Integer getIsHead() {
        return isHead;
    }

    public void setIsHead(Integer isHead) {
        this.isHead = isHead;
    }

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

    public String getSysUserPhone2() {
        return sysUserPhone2;
    }

    public void setSysUserPhone2(String sysUserPhone2) {
        this.sysUserPhone2 = sysUserPhone2 == null ? null : sysUserPhone2.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }
}