package com.zdpzsp.report.bo;

public class RptCfgMains {
    private Long id;

    private String rpt_code;

    private String rpt_name;

    private Integer dir_type;

    private Long up_rpt_id;

    private String rpt_url;

    private String rpt_type;

    private String main_sql;

    private Byte is_used;

    private Long created_at;

    private Long creator_id;

    private Long updated_at;

    private Long updater_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRpt_code() {
        return rpt_code;
    }

    public void setRpt_code(String rpt_code) {
        this.rpt_code = rpt_code == null ? null : rpt_code.trim();
    }

    public String getRpt_name() {
        return rpt_name;
    }

    public void setRpt_name(String rpt_name) {
        this.rpt_name = rpt_name == null ? null : rpt_name.trim();
    }

    public Integer getDir_type() {
        return dir_type;
    }

    public void setDir_type(Integer dir_type) {
        this.dir_type = dir_type;
    }

    public Long getUp_rpt_id() {
        return up_rpt_id;
    }

    public void setUp_rpt_id(Long up_rpt_id) {
        this.up_rpt_id = up_rpt_id;
    }

    public String getRpt_url() {
        return rpt_url;
    }

    public void setRpt_url(String rpt_url) {
        this.rpt_url = rpt_url == null ? null : rpt_url.trim();
    }

    public String getRpt_type() {
        return rpt_type;
    }

    public void setRpt_type(String rpt_type) {
        this.rpt_type = rpt_type == null ? null : rpt_type.trim();
    }

    public String getMain_sql() {
        return main_sql;
    }

    public void setMain_sql(String main_sql) {
        this.main_sql = main_sql == null ? null : main_sql.trim();
    }

    public Byte getIs_used() {
        return is_used;
    }

    public void setIs_used(Byte is_used) {
        this.is_used = is_used;
    }

    public Long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Long created_at) {
        this.created_at = created_at;
    }

    public Long getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(Long creator_id) {
        this.creator_id = creator_id;
    }

    public Long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Long updated_at) {
        this.updated_at = updated_at;
    }

    public Long getUpdater_id() {
        return updater_id;
    }

    public void setUpdater_id(Long updater_id) {
        this.updater_id = updater_id;
    }
}