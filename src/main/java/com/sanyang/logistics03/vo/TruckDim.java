package com.sanyang.logistics03.vo;

import javax.xml.crypto.Data;

public class TruckDim {
	 private Integer   truck_id;
	 private String  license;
	 private char  carry_capcty;
	 private Integer  owner_type_id;
	 private Data  create_date;
	 private Data   update_date;
	 private String  trucktype;
	 private String  truckstatus;
	 private String  trucklocation;
	 private Integer  truckage;
	public Integer getTruck_id() {
		return truck_id;
	}
	public void setTruck_id(Integer truck_id) {
		this.truck_id = truck_id;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public char getCarry_capcty() {
		return carry_capcty;
	}
	public void setCarry_capcty(char carry_capcty) {
		this.carry_capcty = carry_capcty;
	}
	public Integer getOwner_type_id() {
		return owner_type_id;
	}
	public void setOwner_type_id(Integer owner_type_id) {
		this.owner_type_id = owner_type_id;
	}
	public Data getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Data create_date) {
		this.create_date = create_date;
	}
	public Data getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Data update_date) {
		this.update_date = update_date;
	}
	public String getTrucktype() {
		return trucktype;
	}
	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}
	public String getTruckstatus() {
		return truckstatus;
	}
	public void setTruckstatus(String truckstatus) {
		this.truckstatus = truckstatus;
	}
	public String getTrucklocation() {
		return trucklocation;
	}
	public void setTrucklocation(String trucklocation) {
		this.trucklocation = trucklocation;
	}
	public Integer getTruckage() {
		return truckage;
	}
	public void setTruckage(Integer truckage) {
		this.truckage = truckage;
	}
	 
	 
	 
}
