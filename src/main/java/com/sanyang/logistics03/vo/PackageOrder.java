package com.sanyang.logistics03.vo;

public class PackageOrder {
private Integer	order_id; 
private Integer	direction_id; 
private Integer	wh_id; 
private Integer	cust_package_id; 
private Integer	package_amt;


public PackageOrder() {
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "PackageOrder [order_id=" + order_id + ", direction_id=" + direction_id + ", wh_id=" + wh_id
			+ ", cust_package_id=" + cust_package_id + ", package_amt=" + package_amt + "]";
}


public Integer getOrder_id() {
	return order_id;
}


public void setOrder_id(Integer order_id) {
	this.order_id = order_id;
}


public Integer getDirection_id() {
	return direction_id;
}


public void setDirection_id(Integer direction_id) {
	this.direction_id = direction_id;
}


public Integer getWh_id() {
	return wh_id;
}


public void setWh_id(Integer wh_id) {
	this.wh_id = wh_id;
}


public Integer getCust_package_id() {
	return cust_package_id;
}


public void setCust_package_id(Integer cust_package_id) {
	this.cust_package_id = cust_package_id;
}


public Integer getPackage_amt() {
	return package_amt;
}


public void setPackage_amt(Integer package_amt) {
	this.package_amt = package_amt;
}


public PackageOrder(Integer order_id, Integer direction_id, Integer wh_id, Integer cust_package_id,
		Integer package_amt) {
	super();
	this.order_id = order_id;
	this.direction_id = direction_id;
	this.wh_id = wh_id;
	this.cust_package_id = cust_package_id;
	this.package_amt = package_amt;
}





}
