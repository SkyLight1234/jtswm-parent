package com.zdpzsp.note.bo;

public class WorkBookLabel {
    private Long wb_lable_id;

    private Long user_id;

    private Long parent_id;

    private String label_name;

    private String label_remark;

    private Long res_id;

    private Integer is_file;

    private Long create_at;

    private Long create_id;

    private Long update_at;

    private Long update_id;

    private Integer state;

    public Long getWb_lable_id() {
        return wb_lable_id;
    }

    public void setWb_lable_id(Long wb_lable_id) {
        this.wb_lable_id = wb_lable_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name == null ? null : label_name.trim();
    }

    public String getLabel_remark() {
        return label_remark;
    }

    public void setLabel_remark(String label_remark) {
        this.label_remark = label_remark == null ? null : label_remark.trim();
    }

    public Long getRes_id() {
        return res_id;
    }

    public void setRes_id(Long res_id) {
        this.res_id = res_id;
    }

    public Integer getIs_file() {
        return is_file;
    }

    public void setIs_file(Integer is_file) {
        this.is_file = is_file;
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
}