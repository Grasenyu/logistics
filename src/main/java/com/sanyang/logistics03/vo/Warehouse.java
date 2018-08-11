package com.sanyang.logistics03.vo;

import java.util.Date;

public class Warehouse {
	
	 private Integer wh_id;//` int(11) NOT NULL AUTO_INCREMENT,
	 private Integer type_id;//` int(11) DEFAULT NULL,
	 private String name;//` varchar(100) DEFAULT NULL,
	 private String whno;//` varchar(150) DEFAULT NULL,
	 private String address;//` varchar(150) DEFAULT NULL,
	 private String principle;//` varchar(100) DEFAULT NULL,
	 private Integer height;//` int(11) DEFAULT NULL,
	 private Integer area;//` int(11) DEFAULT NULL,
	 private Integer fireproof_level;//` int(11) DEFAULT NULL,
	 private Integer whtype;//` int(11) DEFAULT NULL,
	 private String material;//` varchar(150) DEFAULT NULL,
	 private Integer bearing_weigh;//` int(11) DEFAULT NULL,
	 private String create_date;//` datetime DEFAULT NULL,
	 private String update_date;//` datetime DEFAULT NULL,
	 private String contact;//` varchar(30) DEFAULT NULL,
	 private Integer firelevel;//` varchar(10) DEFAULT NULL,
	 
	 public Warehouse() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	 
	public Warehouse(Integer wh_id, Integer type_id, String name, String whno, String address, String principle,
			Integer height, Integer area, Integer fireproof_level, Integer whtype, String material,
			Integer bearing_weigh, String create_date, String update_date, String contact, Integer firelevel) {
		super();
		this.wh_id = wh_id;
		this.type_id = type_id;
		this.name = name;
		this.whno = whno;
		this.address = address;
		this.principle = principle;
		this.height = height;
		this.area = area;
		this.fireproof_level = fireproof_level;
		this.whtype = whtype;
		this.material = material;
		this.bearing_weigh = bearing_weigh;
		this.create_date = create_date;
		this.update_date = update_date;
		this.contact = contact;
		this.firelevel = firelevel;
	}



	public Integer getWh_id() {
		return wh_id;
	}
	public void setWh_id(Integer wh_id) {
		this.wh_id = wh_id;
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
	public String getWhno() {
		return whno;
	}
	public void setWhno(String whno) {
		this.whno = whno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrinciple() {
		return principle;
	}
	public void setPrinciple(String principle) {
		this.principle = principle;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getFireproof_level() {
		return fireproof_level;
	}
	public void setFireproof_level(Integer fireproof_level) {
		this.fireproof_level = fireproof_level;
	}
	public Integer getWhtype() {
		return whtype;
	}
	public void setWhtype(Integer whtype) {
		this.whtype = whtype;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Integer getBearing_weigh() {
		return bearing_weigh;
	}
	public void setBearing_weigh(Integer bearing_weigh) {
		this.bearing_weigh = bearing_weigh;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Integer getFirelevel() {
		return firelevel;
	}
	public void setFirelevel(Integer firelevel) {
		this.firelevel = firelevel;
	}
	@Override
	public String toString() {
		return "Warehouse [wh_id=" + wh_id + ", type_id=" + type_id + ", name=" + name + ", whno=" + whno + ", address="
				+ address + ", principle=" + principle + ", height=" + height + ", area=" + area + ", fireproof_level="
				+ fireproof_level + ", whtype=" + whtype + ", material=" + material + ", bearing_weigh=" + bearing_weigh
				+ ", create_date=" + create_date + ", update_date=" + update_date + ", contact=" + contact
				+ ", firelevel=" + firelevel + "]";
	}
	
	 
	 

}
