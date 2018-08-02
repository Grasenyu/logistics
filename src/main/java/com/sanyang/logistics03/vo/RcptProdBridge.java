package com.sanyang.logistics03.vo;

public class RcptProdBridge {
	
	Integer rcpt_prod_id ;
	Integer rcpt_id;
	Integer work_order_id;
	Integer prod_id;
	String pname;
	String ptype;
	String pcode;
	String package_name;
	Integer plan_amt;
	Integer incount;
	Integer lostcount;
	Integer destorycount;
	Integer backup_area_id;
	Integer prein_amt;
	Integer in_amt;
	
	public RcptProdBridge() {
		// TODO Auto-generated constructor stub
	}

	public RcptProdBridge(Integer rcpt_prod_id, Integer rcpt_id, Integer work_order_id, Integer prod_id, String pname,
			String ptype, String pcode, String package_name, Integer plan_amt, Integer incount, Integer lostcount,
			Integer destorycount, Integer backup_area_id, Integer prein_amt, Integer in_amt) {
		super();
		this.rcpt_prod_id = rcpt_prod_id;
		this.rcpt_id = rcpt_id;
		this.work_order_id = work_order_id;
		this.prod_id = prod_id;
		this.pname = pname;
		this.ptype = ptype;
		this.pcode = pcode;
		this.package_name = package_name;
		this.plan_amt = plan_amt;
		this.incount = incount;
		this.lostcount = lostcount;
		this.destorycount = destorycount;
		this.backup_area_id = backup_area_id;
		this.prein_amt = prein_amt;
		this.in_amt = in_amt;
	}

	public Integer getRcpt_prod_id() {
		return rcpt_prod_id;
	}

	public void setRcpt_prod_id(Integer rcpt_prod_id) {
		this.rcpt_prod_id = rcpt_prod_id;
	}

	public Integer getRcpt_id() {
		return rcpt_id;
	}

	public void setRcpt_id(Integer rcpt_id) {
		this.rcpt_id = rcpt_id;
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

	public Integer getIncount() {
		return incount;
	}

	public void setIncount(Integer incount) {
		this.incount = incount;
	}

	public Integer getLostcount() {
		return lostcount;
	}

	public void setLostcount(Integer lostcount) {
		this.lostcount = lostcount;
	}

	public Integer getDestorycount() {
		return destorycount;
	}

	public void setDestorycount(Integer destorycount) {
		this.destorycount = destorycount;
	}

	public Integer getBackup_area_id() {
		return backup_area_id;
	}

	public void setBackup_area_id(Integer backup_area_id) {
		this.backup_area_id = backup_area_id;
	}

	public Integer getPrein_amt() {
		return prein_amt;
	}

	public void setPrein_amt(Integer prein_amt) {
		this.prein_amt = prein_amt;
	}

	public Integer getIn_amt() {
		return in_amt;
	}

	public void setIn_amt(Integer in_amt) {
		this.in_amt = in_amt;
	}

	@Override
	public String toString() {
		return "RcptProdBridge [rcpt_prod_id=" + rcpt_prod_id + ", rcpt_id=" + rcpt_id + ", work_order_id="
				+ work_order_id + ", prod_id=" + prod_id + ", pname=" + pname + ", ptype=" + ptype + ", pcode=" + pcode
				+ ", package_name=" + package_name + ", plan_amt=" + plan_amt + ", incount=" + incount + ", lostcount="
				+ lostcount + ", destorycount=" + destorycount + ", backup_area_id=" + backup_area_id + ", prein_amt="
				+ prein_amt + ", in_amt=" + in_amt + "]";
	}
	
	

}
