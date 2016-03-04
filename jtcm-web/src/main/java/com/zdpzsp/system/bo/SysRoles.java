package com.zdpzsp.system.bo;

public class SysRoles {
    private Long id;

    private String role_name;

    private String role_desc;

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

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name == null ? null : role_name.trim();
    }

    public String getRole_desc() {
        return role_desc;
    }

    public void setRole_desc(String role_desc) {
        this.role_desc = role_desc == null ? null : role_desc.trim();
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