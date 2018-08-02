package com.sanyang.logistics03.vo;

public class RoleFuncBridge {
	
	Integer role_id;
	Integer func_id;
	
	public RoleFuncBridge() {
		// TODO Auto-generated constructor stub
	}

	public RoleFuncBridge(Integer role_id, Integer func_id) {
		super();
		this.role_id = role_id;
		this.func_id = func_id;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Integer getFunc_id() {
		return func_id;
	}

	public void setFunc_id(Integer func_id) {
		this.func_id = func_id;
	}

	@Override
	public String toString() {
		return "RoleFuncBridge [role_id=" + role_id + ", func_id=" + func_id + "]";
	}
	
	
}
