package com.sanyang.logistics03.vo;

public class CustomerOrdertype {
	
	private Integer cust_ordertype_id;
	
	private Integer cid;
	
	private Integer sysordertype_id;
	
	private Integer name;
	
	private String description;
	
	
	public CustomerOrdertype() {
		// TODO Auto-generated constructor stub
	}


	public CustomerOrdertype(Integer cust_ordertype_id, Integer cid, Integer sysordertype_id, Integer name,
			String description) {
		super();
		this.cust_ordertype_id = cust_ordertype_id;
		this.cid = cid;
		this.sysordertype_id = sysordertype_id;
		this.name = name;
		this.description = description;
	}


	public Integer getCust_ordertype_id() {
		return cust_ordertype_id;
	}


	public void setCust_ordertype_id(Integer cust_ordertype_id) {
		this.cust_ordertype_id = cust_ordertype_id;
	}


	public Integer getCid() {
		return cid;
	}


	public void setCid(Integer cid) {
		this.cid = cid;
	}


	public Integer getSysordertype_id() {
		return sysordertype_id;
	}


	public void setSysordertype_id(Integer sysordertype_id) {
		this.sysordertype_id = sysordertype_id;
	}


	public Integer getName() {
		return name;
	}


	public void setName(Integer name) {
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
		return "CustomerOrdertype [cust_ordertype_id=" + cust_ordertype_id + ", cid=" + cid + ", sysordertype_id="
				+ sysordertype_id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	

}
