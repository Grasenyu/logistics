package com.sanyang.logistics03.vo;

public class DriverDim {
	
    private Integer driver_id;
    private String name;
    private String	sex;
	private Integer	age;
	private Integer	driverage;
	private String	status;
	private String	license;
	private String	drivertype;
	private String	to_date;
	private String	contact;

	public DriverDim() {
		// TODO Auto-generated constructor stub
	}

	public DriverDim(Integer driver_id, String name, String sex, Integer age, Integer driverage, String status,
			String license, String drivertype, String to_date, String contact) {
		super();
		this.driver_id = driver_id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.driverage = driverage;
		this.status = status;
		this.license = license;
		this.drivertype = drivertype;
		this.to_date = to_date;
		this.contact = contact;
	}

	public Integer getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(Integer driver_id) {
		this.driver_id = driver_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDriverage() {
		return driverage;
	}

	public void setDriverage(Integer driverage) {
		this.driverage = driverage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getDrivertype() {
		return drivertype;
	}

	public void setDrivertype(String drivertype) {
		this.drivertype = drivertype;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "DriverDim [driver_id=" + driver_id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", driverage="
				+ driverage + ", status=" + status + ", license=" + license + ", drivertype=" + drivertype
				+ ", to_date=" + to_date + ", contact=" + contact + "]";
	}
	
	

}
