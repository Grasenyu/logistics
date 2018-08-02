package com.sanyang.logistics03.vo;

public class Directtion {
	

	private Integer direction_id;
	private String name;
	private String description;
	
	public Directtion() {
		// TODO Auto-generated constructor stub
	}

	public Directtion(Integer direction_id, String name, String description) {
		super();
		this.direction_id = direction_id;
		this.name = name;
		this.description = description;
	}

	public Integer getDirection_id() {
		return direction_id;
	}

	public void setDirection_id(Integer direction_id) {
		this.direction_id = direction_id;
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
		return "Directtion [direction_id=" + direction_id + ", name=" + name + ", description=" + description + "]";
	}
	
	


}
