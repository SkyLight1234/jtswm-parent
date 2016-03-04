package com.zdpzsp.system.bo;

public class SysRoleMenus {
    private Long id;

    private Long role_id;

    private Long menu_id;

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

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public Long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Long menu_id) {
        this.menu_id = menu_id;
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