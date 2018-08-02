package com.sanyang.logistics03.vo;

public class Customer {
	
	private Integer cid;
	
	private String  cname;
	
	private Integer zip;
	
	private String  address;
	
	private String  contact;
	
	private String  fax;
	
	private String  principal;
	
	private String  description;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(Integer cid, String cname, Integer zip, String address, String contact, String fax,
			String principal, String description) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.zip = zip;
		this.address = address;
		this.contact = contact;
		this.fax = fax;
		this.principal = principal;
		this.description = description;
	}


	public Integer getCid() {
		return cid;
	}


	public void setCid(Integer cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public Integer getZip() {
		return zip;
	}


	public void setZip(Integer zip) {
		this.zip = zip;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getPrincipal() {
		return principal;
	}


	public void setPrincipal(String principal) {
		this.principal = principal;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", zip=" + zip + ", address=" + address + ", contact="
				+ contact + ", fax=" + fax + ", principal=" + principal + ", description=" + description + "]";
	}
	
	

}
