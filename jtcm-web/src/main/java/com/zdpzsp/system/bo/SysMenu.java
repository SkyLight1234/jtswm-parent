package com.zdpzsp.system.bo;

public class SysMenu {
    private Long menu_id;

    private String menu_name;

    private String menu_desc;

    private Integer menu_pid;

    private Integer menu_type;

    private Integer menu_order;

    private String menu_target;

    private String menu_url;

    private String menu_pic;

    private String system_id;

    private String sub_system_id;

    private Integer menu_state;

    public Long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Long menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name == null ? null : menu_name.trim();
    }

    public String getMenu_desc() {
        return menu_desc;
    }

    public void setMenu_desc(String menu_desc) {
        this.menu_desc = menu_desc == null ? null : menu_desc.trim();
    }

    public Integer getMenu_pid() {
        return menu_pid;
    }

    public void setMenu_pid(Integer menu_pid) {
        this.menu_pid = menu_pid;
    }

    public Integer getMenu_type() {
        return menu_type;
    }

    public void setMenu_type(Integer menu_type) {
        this.menu_type = menu_type;
    }

    public Integer getMenu_order() {
        return menu_order;
    }

    public void setMenu_order(Integer menu_order) {
        this.menu_order = menu_order;
    }

    public String getMenu_target() {
        return menu_target;
    }

    public void setMenu_target(String menu_target) {
        this.menu_target = menu_target == null ? null : menu_target.trim();
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url == null ? null : menu_url.trim();
    }

    public String getMenu_pic() {
        return menu_pic;
    }

    public void setMenu_pic(String menu_pic) {
        this.menu_pic = menu_pic == null ? null : menu_pic.trim();
    }

    public String getSystem_id() {
        return system_id;
    }

    public void setSystem_id(String system_id) {
        this.system_id = system_id == null ? null : system_id.trim();
    }

    public String getSub_system_id() {
        return sub_system_id;
    }

    public void setSub_system_id(String sub_system_id) {
        this.sub_system_id = sub_system_id == null ? null : sub_system_id.trim();
    }

    public Integer getMenu_state() {
        return menu_state;
    }

    public void setMenu_state(Integer menu_state) {
        this.menu_state = menu_state;
    }
}