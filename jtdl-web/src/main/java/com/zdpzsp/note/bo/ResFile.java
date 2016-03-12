package com.zdpzsp.note.bo;

public class ResFile {
    private Long res_id;

    private String file_url;

    private String file_name;

    private String file_code;

    private Long create_at;

    private Long create_id;

    private Long update_at;

    private Long update_id;

    private Integer state;

    public Long getRes_id() {
        return res_id;
    }

    public void setRes_id(Long res_id) {
        this.res_id = res_id;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url == null ? null : file_url.trim();
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name == null ? null : file_name.trim();
    }

    public String getFile_code() {
        return file_code;
    }

    public void setFile_code(String file_code) {
        this.file_code = file_code == null ? null : file_code.trim();
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