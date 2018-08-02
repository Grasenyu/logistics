package com.sanyang.logistics03.vo;

public class Sysorders {
	 private Integer   oid;
	 private String  cus_order_no;
	 private Integer  parent_oid;
	 public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getCus_order_no() {
		return cus_order_no;
	}
	public void setCus_order_no(String cus_order_no) {
		this.cus_order_no = cus_order_no;
	}
	public Integer getParent_oid() {
		return parent_oid;
	}
	public void setParent_oid(Integer parent_oid) {
		this.parent_oid = parent_oid;
	}
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public Integer getSys_order_type_id() {
		return sys_order_type_id;
	}
	public void setSys_order_type_id(Integer sys_order_type_id) {
		this.sys_order_type_id = sys_order_type_id;
	}
	public Integer getCust_order_type_id() {
		return cust_order_type_id;
	}
	public void setCust_order_type_id(Integer cust_order_type_id) {
		this.cust_order_type_id = cust_order_type_id;
	}
	public String getFrom_address() {
		return from_address;
	}
	public void setFrom_address(String from_address) {
		this.from_address = from_address;
	}
	public String getTo_address() {
		return to_address;
	}
	public void setTo_address(String to_address) {
		this.to_address = to_address;
	}
	public String getTo_customer() {
		return to_customer;
	}
	public void setTo_customer(String to_customer) {
		this.to_customer = to_customer;
	}
	public Integer getFrom_warehouse() {
		return from_warehouse;
	}
	public void setFrom_warehouse(Integer from_warehouse) {
		this.from_warehouse = from_warehouse;
	}
	public Integer getTo_warehouse() {
		return to_warehouse;
	}
	public void setTo_warehouse(Integer to_warehouse) {
		this.to_warehouse = to_warehouse;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	private Integer  cust_id;
	 private Integer  sys_order_type_id;
	 private Integer  cust_order_type_id;
	 private String  from_address;
	 private String  to_address;
	 private String  to_customer;
	 private Integer  from_warehouse;
	 private Integer  to_warehouse;
	 private Integer  order_status;
	 
	 
	 
}
