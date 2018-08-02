package com.sanyang.logistics03.vo;

public class OutWarehouse {
	
	private Integer	out_warehouse_id;
	private Integer	pickout_prod_id;
	private Integer	pickout_id;
	private Integer	posn_id;
	private String	posn_code;
	private Integer	prod_id;
	private String	package_name;
	private Integer	out_amt;
	private String	backup_area_code;
	
	
	
	public OutWarehouse() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "OutWarehouse [out_warehouse_id=" + out_warehouse_id + ", pickout_prod_id=" + pickout_prod_id
				+ ", pickout_id=" + pickout_id + ", posn_id=" + posn_id + ", posn_code=" + posn_code + ", prod_id="
				+ prod_id + ", package_name=" + package_name + ", out_amt=" + out_amt + ", backup_area_code="
				+ backup_area_code + "]";
	}



	public Integer getOut_warehouse_id() {
		return out_warehouse_id;
	}



	public void setOut_warehouse_id(Integer out_warehouse_id) {
		this.out_warehouse_id = out_warehouse_id;
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



	public Integer getProd_id() {
		return prod_id;
	}



	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}



	public String getPackage_name() {
		return package_name;
	}



	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}



	public Integer getOut_amt() {
		return out_amt;
	}



	public void setOut_amt(Integer out_amt) {
		this.out_amt = out_amt;
	}



	public String getBackup_area_code() {
		return backup_area_code;
	}



	public void setBackup_area_code(String backup_area_code) {
		this.backup_area_code = backup_area_code;
	}



	public OutWarehouse(Integer out_warehouse_id, Integer pickout_prod_id, Integer pickout_id, Integer posn_id,
			String posn_code, Integer prod_id, String package_name, Integer out_amt, String backup_area_code) {
		super();
		this.out_warehouse_id = out_warehouse_id;
		this.pickout_prod_id = pickout_prod_id;
		this.pickout_id = pickout_id;
		this.posn_id = posn_id;
		this.posn_code = posn_code;
		this.prod_id = prod_id;
		this.package_name = package_name;
		this.out_amt = out_amt;
		this.backup_area_code = backup_area_code;
	}
	
	
	
	
}
