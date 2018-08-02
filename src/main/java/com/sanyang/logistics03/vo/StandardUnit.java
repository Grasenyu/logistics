package com.sanyang.logistics03.vo;

public class StandardUnit {
	 private Integer   unitid;
	 private String  name;
	 private String  description;
	 private String  catery;
	 
	 
	 public StandardUnit() {
		// TODO Auto-generated constructor stub
	}
	public StandardUnit(Integer unitid, String name, String description, String catery) {
		super();
		this.unitid = unitid;
		this.name = name;
		this.description = description;
		this.catery = catery;
	}
	@Override
	public String toString() {
		return "StandardUnit [unitid=" + unitid + ", name=" + name + ", description=" + description + ", catery="
				+ catery + "]";
	}
	public Integer getUnitid() {
		return unitid;
	}
	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
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
	public String getCatery() {
		return catery;
	}
	public void setCatery(String catery) {
		this.catery = catery;
	}
	
}
