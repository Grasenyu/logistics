package com.sanyang.logistics03.vo;

public class InWarehouse {
	
    private Integer	in_warehouse_id;
    private Integer		rcpt_prod_id;
    private Integer		rcpt_id;
    private Integer		posn_id;
    private String	posn_code;
	private Integer		store_amt;
	private String	memo;
	private String	backup_area_code;
	private Integer		prod_id;

public InWarehouse() {
	// TODO Auto-generated constructor stub
}

public InWarehouse(Integer in_warehouse_id, Integer rcpt_prod_id, Integer rcpt_id, Integer posn_id, String posn_code,
		Integer store_amt, String memo, String backup_area_code, Integer prod_id) {
	super();
	this.in_warehouse_id = in_warehouse_id;
	this.rcpt_prod_id = rcpt_prod_id;
	this.rcpt_id = rcpt_id;
	this.posn_id = posn_id;
	this.posn_code = posn_code;
	this.store_amt = store_amt;
	this.memo = memo;
	this.backup_area_code = backup_area_code;
	this.prod_id = prod_id;
}

public Integer getIn_warehouse_id() {
	return in_warehouse_id;
}

public void setIn_warehouse_id(Integer in_warehouse_id) {
	this.in_warehouse_id = in_warehouse_id;
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

public Integer getPosn_id() {
	return posn_id;
}

public void setPosn_id(Integer posn_id) {
	this.posn_id = posn_id;
}

public String getPosn_code() {
	return posn_code;
}

public void setPosn_code(String posn_code) {
	this.posn_code = posn_code;
}

public Integer getStore_amt() {
	return store_amt;
}

public void setStore_amt(Integer store_amt) {
	this.store_amt = store_amt;
}

public String getMemo() {
	return memo;
}

public void setMemo(String memo) {
	this.memo = memo;
}

public String getBackup_area_code() {
	return backup_area_code;
}

public void setBackup_area_code(String backup_area_code) {
	this.backup_area_code = backup_area_code;
}

public Integer getProd_id() {
	return prod_id;
}

public void setProd_id(Integer prod_id) {
	this.prod_id = prod_id;
}

@Override
public String toString() {
	return "InWarehouse [in_warehouse_id=" + in_warehouse_id + ", rcpt_prod_id=" + rcpt_prod_id + ", rcpt_id=" + rcpt_id
			+ ", posn_id=" + posn_id + ", posn_code=" + posn_code + ", store_amt=" + store_amt + ", memo=" + memo
			+ ", backup_area_code=" + backup_area_code + ", prod_id=" + prod_id + "]";
}


}
