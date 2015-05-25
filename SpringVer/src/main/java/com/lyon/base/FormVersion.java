package com.lyon.base;

public abstract class FormVersion {
	
	protected FormVersion(Integer ver){
		this.ver = ver;
	}
	
	private Integer ver;

	public Integer getVer() {
		return ver;
	}

}
