package com.zdpzsp.system.bo;

public class SysHost {
    private Long sys_host_id;

    private String sys_host_name;

    private String sys_host_head;

    private Long create_at;

    private Long create_id;

    private Long update_at;

    private Long update_id;

    private Integer state;

    private String host_type;

    private String host_ip;

    private Integer host_port;

    public Long getSys_host_id() {
        return sys_host_id;
    }

    public void setSys_host_id(Long sys_host_id) {
        this.sys_host_id = sys_host_id;
    }

    public String getSys_host_name() {
        return sys_host_name;
    }

    public void setSys_host_name(String sys_host_name) {
        this.sys_host_name = sys_host_name == null ? null : sys_host_name.trim();
    }

    public String getSys_host_head() {
        return sys_host_head;
    }

    public void setSys_host_head(String sys_host_head) {
        this.sys_host_head = sys_host_head == null ? null : sys_host_head.trim();
    }

    public Long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Long create_at) {
        this.create_at = create_at;
    }

    public Long getCreate_id() {
        return create_id;
    }

    public void setCreate_id(Long create_id) {
        this.create_id = create_id;
    }

    public Long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Long update_at) {
        this.update_at = update_at;
    }

    public Long getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Long update_id) {
        this.update_id = update_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getHost_type() {
        return host_type;
    }

    public void setHost_type(String host_type) {
        this.host_type = host_type == null ? null : host_type.trim();
    }

    public String getHost_ip() {
        return host_ip;
    }

    public void setHost_ip(String host_ip) {
        this.host_ip = host_ip == null ? null : host_ip.trim();
    }

    public Integer getHost_port() {
        return host_port;
    }

    public void setHost_port(Integer host_port) {
        this.host_port = host_port;
    }
}