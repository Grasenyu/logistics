package com.sanyang.logistics03.vo;

public class Product {
private Integer	pid;
private String		pname;
private String	catery;
private String	pmodel;
private String code;
private String	provider;
private String	create_date;
private String	update_date;
private Integer		package_id;
private String	status;

public Product() {
	// TODO Auto-generated constructor stub
}

public Integer getPid() {
	return pid;
}

public void setPid(Integer pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getCatery() {
	return catery;
}

public void setCatery(String catery) {
	this.catery = catery;
}

public String getPmodel() {
	return pmodel;
}

public void setPmodel(String pmodel) {
	this.pmodel = pmodel;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getProvider() {
	return provider;
}

public void setProvider(String provider) {
	this.provider = provider;
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

public Integer getPackage_id() {
	return package_id;
}

public void setPackage_id(Integer package_id) {
	this.package_id = package_id;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", catery=" + catery + ", pmodel=" + pmodel + ", code=" + code
			+ ", provider=" + provider + ", create_date=" + create_date + ", update_date=" + update_date
			+ ", package_id=" + package_id + ", status=" + status + "]";
}

public Product(Integer pid, String pname, String catery, String pmodel, String code, String provider,
		String create_date, String update_date, Integer package_id, String status) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.catery = catery;
	this.pmodel = pmodel;
	this.code = code;
	this.provider = provider;
	this.create_date = create_date;
	this.update_date = update_date;
	this.package_id = package_id;
	this.status = status;
}


}
