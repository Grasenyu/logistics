package com.sanyang.logistics03.vo;

public class BackupArea {
	
   private	Integer backup_area_id;
   private	String name;
   private	String code;
   private	Integer wh_id;
   
   public BackupArea() {
	// TODO Auto-generated constructor stub
}
   
   
   
public BackupArea(Integer backup_area_id, String name, String code, Integer wh_id) {
	super();
	this.backup_area_id = backup_area_id;
	this.name = name;
	this.code = code;
	this.wh_id = wh_id;
}



public Integer getBackup_area_id() {
	return backup_area_id;
}
public void setBackup_area_id(Integer backup_area_id) {
	this.backup_area_id = backup_area_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public Integer getWh_id() {
	return wh_id;
}
public void setWh_id(Integer wh_id) {
	this.wh_id = wh_id;
}



@Override
public String toString() {
	return "BackupArea [backup_area_id=" + backup_area_id + ", name=" + name + ", code=" + code + ", wh_id=" + wh_id
			+ "]";
}
   
   

}
