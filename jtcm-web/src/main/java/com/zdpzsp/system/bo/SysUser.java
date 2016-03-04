package com.zdpzsp.system.bo;

import java.util.Date;

public class SysUser {
    private Long user_id;

    private String user_code;

    private String user_name;

    private String login_pwd;

    private Integer user_type;

    private Integer user_org;

    private Integer org_type;

    private Integer state;

    private Date create_time;

    private Integer emp_id;

    private Date last_login_time;

    private String last_login_ip;

    private String dynamic_pwd;

    private Date dynamic_pwd_time;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code == null ? null : user_code.trim();
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getLogin_pwd() {
        return login_pwd;
    }

    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd == null ? null : login_pwd.trim();
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public Integer getUser_org() {
        return user_org;
    }

    public void setUser_org(Integer user_org) {
        this.user_org = user_org;
    }

    public Integer getOrg_type() {
        return org_type;
    }

    public void setOrg_type(Integer org_type) {
        this.org_type = org_type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip == null ? null : last_login_ip.trim();
    }

    public String getDynamic_pwd() {
        return dynamic_pwd;
    }

    public void setDynamic_pwd(String dynamic_pwd) {
        this.dynamic_pwd = dynamic_pwd == null ? null : dynamic_pwd.trim();
    }

    public Date getDynamic_pwd_time() {
        return dynamic_pwd_time;
    }

    public void setDynamic_pwd_time(Date dynamic_pwd_time) {
        this.dynamic_pwd_time = dynamic_pwd_time;
    }
}