package com.sanyang.logistics03.vo;

public class PickoutProdBridge {
	private Integer	pickout_prod_id;
	private Integer	pickout_id;
	private Integer	work_order_id;
	private Integer	prod_id;
	private String	pname;
	private String	ptype;
	private String	pcode;
	private String	package_name;
	private Integer	plan_amt;
	private Integer	preout_amt;
	private Integer	out_amt;


public PickoutProdBridge() {
	// TODO Auto-generated constructor stub
}


public Integer getPickout_prod_id() {
	return pickout_prod_id;
}


public void setPickout_prod_id(Integer pickout_prod_id) {
	this.pickout_prod_id = pickout_prod_id;
}


public Integer getPickout_id() {
	return pickout_id;
}


public void setPickout_id(Integer pickout_id) {
	this.pickout_id = pickout_id;
}


public Integer getWork_order_id() {
	return work_order_id;
}


public void setWork_order_id(Integer work_order_id) {
	this.work_order_id = work_order_id;
}


public Integer getProd_id() {
	return prod_id;
}


public void setProd_id(Integer prod_id) {
	this.prod_id = prod_id;
}


public String getPname() {
	return pname;
}


public void setPname(String pname) {
	this.pname = pname;
}


public String getPtype() {
	return ptype;
}


public void setPtype(String ptype) {
	this.ptype = ptype;
}


public String getPcode() {
	return pcode;
}


public void setPcode(String pcode) {
	this.pcode = pcode;
}


public String getPackage_name() {
	return package_name;
}


public void setPackage_name(String package_name) {
	this.package_name = package_name;
}


public Integer getPlan_amt() {
	return plan_amt;
}


public void setPlan_amt(Integer plan_amt) {
	this.plan_amt = plan_amt;
}


public Integer getPreout_amt() {
	return preout_amt;
}


public void setPreout_amt(Integer preout_amt) {
	this.preout_amt = preout_amt;
}


public Integer getOut_amt() {
	return out_amt;
}


public void setOut_amt(Integer out_amt) {
	this.out_amt = out_amt;
}


@Override
public String toString() {
	return "PickoutProdBridge [pickout_prod_id=" + pickout_prod_id + ", pickout_id=" + pickout_id + ", work_order_id="
			+ work_order_id + ", prod_id=" + prod_id + ", pname=" + pname + ", ptype=" + ptype + ", pcode=" + pcode
			+ ", package_name=" + package_name + ", plan_amt=" + plan_amt + ", preout_amt=" + preout_amt + ", out_amt="
			+ out_amt + "]";
}


public PickoutProdBridge(Integer pickout_prod_id, Integer pickout_id, Integer work_order_id, Integer prod_id,
		String pname, String ptype, String pcode, String package_name, Integer plan_amt, Integer preout_amt,
		Integer out_amt) {
	super();
	this.pickout_prod_id = pickout_prod_id;
	this.pickout_id = pickout_id;
	this.work_order_id = work_order_id;
	this.prod_id = prod_id;
	this.pname = pname;
	this.ptype = ptype;
	this.pcode = pcode;
	this.package_name = package_name;
	this.plan_amt = plan_amt;
	this.preout_amt = preout_amt;
	this.out_amt = out_amt;
}












}
