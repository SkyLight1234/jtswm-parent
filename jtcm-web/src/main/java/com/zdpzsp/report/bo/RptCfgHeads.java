package com.zdpzsp.report.bo;

public class RptCfgHeads {
    private Long id;

    private Long rpt_cfg_main_id;

    private String head_name;

    private Integer head_type;

    private Long up_head_id;

    private String head_col;

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

    public String getHead_name() {
        return head_name;
    }

    public void setHead_name(String head_name) {
        this.head_name = head_name == null ? null : head_name.trim();
    }

    public Integer getHead_type() {
        return head_type;
    }

    public void setHead_type(Integer head_type) {
        this.head_type = head_type;
    }

    public Long getUp_head_id() {
        return up_head_id;
    }

    public void setUp_head_id(Long up_head_id) {
        this.up_head_id = up_head_id;
    }

    public String getHead_col() {
        return head_col;
    }

    public void setHead_col(String head_col) {
        this.head_col = head_col == null ? null : head_col.trim();
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