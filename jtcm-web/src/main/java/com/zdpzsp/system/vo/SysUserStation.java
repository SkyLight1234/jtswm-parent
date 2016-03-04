package com.zdpzsp.system.vo;

import com.zdpzsp.system.bo.SysUserStations;

import java.io.Serializable;

public class SysUserStation extends SysUserStations implements Serializable{

	private static final long serialVersionUID = 7635698546285023418L;
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
