package com.zdpzsp.system.vo;

import com.zdpzsp.system.bo.SysUserRoles;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SysUserRole extends SysUserRoles implements Serializable {

	private static final long serialVersionUID = -5826046876499425234L;
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
