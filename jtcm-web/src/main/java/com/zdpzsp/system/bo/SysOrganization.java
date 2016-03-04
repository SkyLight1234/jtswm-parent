package com.zdpzsp.system.bo;

import java.util.Date;

public class SysOrganization {
    private Long org_id;

    private String org_name;

    private Integer up_org_id;

    private Integer org_type;

    private String org_sub_type;

    private String org_addr;

    private Integer state;

    private String cpu_id;

    private Integer company_id;

    private String contacts;

    private String contact_email;

    private String contact_number;

    private Date create_time;

    private String org_Longitude;

    private String org_latitude;

    private String addrArry;

    public Long getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Long org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name == null ? null : org_name.trim();
    }

    public Integer getUp_org_id() {
        return up_org_id;
    }

    public void setUp_org_id(Integer up_org_id) {
        this.up_org_id = up_org_id;
    }

    public Integer getOrg_type() {
        return org_type;
    }

    public void setOrg_type(Integer org_type) {
        this.org_type = org_type;
    }

    public String getOrg_sub_type() {
        return org_sub_type;
    }

    public void setOrg_sub_type(String org_sub_type) {
        this.org_sub_type = org_sub_type == null ? null : org_sub_type.trim();
    }

    public String getOrg_addr() {
        return org_addr;
    }

    public void setOrg_addr(String org_addr) {
        this.org_addr = org_addr == null ? null : org_addr.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCpu_id() {
        return cpu_id;
    }

    public void setCpu_id(String cpu_id) {
        this.cpu_id = cpu_id == null ? null : cpu_id.trim();
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email == null ? null : contact_email.trim();
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number == null ? null : contact_number.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getOrg_Longitude() {
        return org_Longitude;
    }

    public void setOrg_Longitude(String org_Longitude) {
        this.org_Longitude = org_Longitude == null ? null : org_Longitude.trim();
    }

    public String getOrg_latitude() {
        return org_latitude;
    }

    public void setOrg_latitude(String org_latitude) {
        this.org_latitude = org_latitude == null ? null : org_latitude.trim();
    }

    public String getAddrArry() {
        return addrArry;
    }

    public void setAddrArry(String addrArry) {
        this.addrArry = addrArry == null ? null : addrArry.trim();
    }
}