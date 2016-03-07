package com.zdpzsp.system.vo;

/**
 * Created by Administrator on 2016/3/7.
 */
public class RegisterUserVo {
    private String userEmail;
    private String sysAccount;
    private String sysPassword;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getSysAccount() {
        return sysAccount;
    }

    public void setSysAccount(String sysAccount) {
        this.sysAccount = sysAccount;
    }

    public String getSysPassword() {
        return sysPassword;
    }

    public void setSysPassword(String sysPassword) {
        this.sysPassword = sysPassword;
    }
}
