package com.sanyang.logistics03.vo;

public class Region {
	
	Integer region_id;
	String name;
	String description;
	
	public Region() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Region(Integer region_id, String name, String description) {
		super();
		this.region_id = region_id;
		this.name = name;
		this.description = description;
	}



	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
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
		return "Region [region_id=" + region_id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}
