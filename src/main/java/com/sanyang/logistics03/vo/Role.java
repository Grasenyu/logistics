package com.sanyang.logistics03.vo;

public class Role {
	
	Integer role_id;
	String name;
	String description;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(Integer role_id, String name, String description) {
		super();
		this.role_id = role_id;
		this.name = name;
		this.description = description;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}
