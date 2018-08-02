package com.sanyang.logistics03.vo;

public class OwnerTypeDim {
private Integer	owner_type_id; 
private String		name; 
private String		description;




public OwnerTypeDim() {
	// TODO Auto-generated constructor stub
}




public Integer getOwner_type_id() {
	return owner_type_id;
}




public void setOwner_type_id(Integer owner_type_id) {
	this.owner_type_id = owner_type_id;
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




public OwnerTypeDim(Integer owner_type_id, String name, String description) {
	super();
	this.owner_type_id = owner_type_id;
	this.name = name;
	this.description = description;
}




@Override
public String toString() {
	return "OwnerTypeDim [owner_type_id=" + owner_type_id + ", name=" + name + ", description=" + description + "]";
}





}
