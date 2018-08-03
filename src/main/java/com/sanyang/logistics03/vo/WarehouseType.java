package com.sanyang.logistics03.vo;

public class WarehouseType {
	private Integer type_id;
	private String name;
	private String description;
	public WarehouseType() {
		// TODO Auto-generated constructor stub
	}
	public WarehouseType(Integer type_id, String name, String description) {
		super();
		this.type_id = type_id;
		this.name = name;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Warehouse_type [type_id=" + type_id + ", name=" + name + ", description=" + description + "]";
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
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

}
