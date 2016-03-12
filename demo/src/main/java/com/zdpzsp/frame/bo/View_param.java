package com.zdpzsp.frame.bo;

public class View_param {
    private String code_type;

    private String code_value;

    private String code_name;

    private String code_desc;

    private String parent_value;

    private String parent_type;

    private String code_type_alias;

    private String sort_id;

    private String state;

    private String extend_code;

    public String getCode_type() {
        return code_type;
    }

    public void setCode_type(String code_type) {
        this.code_type = code_type == null ? null : code_type.trim();
    }

    public String getCode_value() {
        return code_value;
    }

    public void setCode_value(String code_value) {
        this.code_value = code_value == null ? null : code_value.trim();
    }

    public String getCode_name() {
        return code_name;
    }

    public void setCode_name(String code_name) {
        this.code_name = code_name == null ? null : code_name.trim();
    }

    public String getCode_desc() {
        return code_desc;
    }

    public void setCode_desc(String code_desc) {
        this.code_desc = code_desc == null ? null : code_desc.trim();
    }

    public String getParent_value() {
        return parent_value;
    }

    public void setParent_value(String parent_value) {
        this.parent_value = parent_value == null ? null : parent_value.trim();
    }

    public String getParent_type() {
        return parent_type;
    }

    public void setParent_type(String parent_type) {
        this.parent_type = parent_type == null ? null : parent_type.trim();
    }

    public String getCode_type_alias() {
        return code_type_alias;
    }

    public void setCode_type_alias(String code_type_alias) {
        this.code_type_alias = code_type_alias == null ? null : code_type_alias.trim();
    }

    public String getSort_id() {
        return sort_id;
    }

    public void setSort_id(String sort_id) {
        this.sort_id = sort_id == null ? null : sort_id.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getExtend_code() {
        return extend_code;
    }

    public void setExtend_code(String extend_code) {
        this.extend_code = extend_code == null ? null : extend_code.trim();
    }
}