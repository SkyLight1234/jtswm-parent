package com.zdpzsp.report.bo;

public class RptCfgQueries {
    private Long id;

    private Long rpt_cfg_main_id;

    private String query_col;

    private String query_name;

    private String query_operator;

    private String query_type;

    private String query_data;

    private Integer order_id;

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

    public Long getRpt_cfg_main_id() {
        return rpt_cfg_main_id;
    }

    public void setRpt_cfg_main_id(Long rpt_cfg_main_id) {
        this.rpt_cfg_main_id = rpt_cfg_main_id;
    }

    public String getQuery_col() {
        return query_col;
    }

    public void setQuery_col(String query_col) {
        this.query_col = query_col == null ? null : query_col.trim();
    }

    public String getQuery_name() {
        return query_name;
    }

    public void setQuery_name(String query_name) {
        this.query_name = query_name == null ? null : query_name.trim();
    }

    public String getQuery_operator() {
        return query_operator;
    }

    public void setQuery_operator(String query_operator) {
        this.query_operator = query_operator == null ? null : query_operator.trim();
    }

    public String getQuery_type() {
        return query_type;
    }

    public void setQuery_type(String query_type) {
        this.query_type = query_type == null ? null : query_type.trim();
    }

    public String getQuery_data() {
        return query_data;
    }

    public void setQuery_data(String query_data) {
        this.query_data = query_data == null ? null : query_data.trim();
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
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