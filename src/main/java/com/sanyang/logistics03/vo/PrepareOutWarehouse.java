package com.sanyang.logistics03.vo;

public class PrepareOutWarehouse {
	  private Integer preout_id;
	   private Integer  pickout_prod_id;
	   private Integer pickout_id;
	   private Integer posn_id;
	   private Integer prod_id;
	   private String pname;
	   private String ptype;
	   private String pcode;
	   private String package_name;
	   private String posn_code;
	   private Integer preout_amt;
	   private String policy_id;
	   private String backup_area_code;
	   private Integer backupid;
	   private String done_flag;
	
	public PrepareOutWarehouse() {
		// TODO Auto-generated constructor stub
	}

	public PrepareOutWarehouse(Integer preout_id, Integer pickout_prod_id, Integer pickout_id, Integer posn_id,
			Integer prod_id, String pname, String ptype, String pcode, String package_name, String posn_code,
			Integer preout_amt, String policy_id, String backup_area_code, Integer backupid, String done_flag) {
		super();
		this.preout_id = preout_id;
		this.pickout_prod_id = pickout_prod_id;
		this.pickout_id = pickout_id;
		this.posn_id = posn_id;
		this.prod_id = prod_id;
		this.pname = pname;
		this.ptype = ptype;
		this.pcode = pcode;
		this.package_name = package_name;
		this.posn_code = posn_code;
		this.preout_amt = preout_amt;
		this.policy_id = policy_id;
		this.backup_area_code = backup_area_code;
		this.backupid = backupid;
		this.done_flag = done_flag;
	}

	public Integer getPreout_id() {
		return preout_id;
	}

	public void setPreout_id(Integer preout_id) {
		this.preout_id = preout_id;
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

	public String getPosn_code() {
		return posn_code;
	}

	public void setPosn_code(String posn_code) {
		this.posn_code = posn_code;
	}

	public Integer getPreout_amt() {
		return preout_amt;
	}

	public void setPreout_amt(Integer preout_amt) {
		this.preout_amt = preout_amt;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public String getBackup_area_code() {
		return backup_area_code;
	}

	public void setBackup_area_code(String backup_area_code) {
		this.backup_area_code = backup_area_code;
	}

	public Integer getBackupid() {
		return backupid;
	}

	public void setBackupid(Integer backupid) {
		this.backupid = backupid;
	}

	public String getDone_flag() {
		return done_flag;
	}

	public void setDone_flag(String done_flag) {
		this.done_flag = done_flag;
	}

	@Override
	public String toString() {
		return "PrepareOutWarehouse [preout_id=" + preout_id + ", pickout_prod_id=" + pickout_prod_id + ", pickout_id="
				+ pickout_id + ", posn_id=" + posn_id + ", prod_id=" + prod_id + ", pname=" + pname + ", ptype=" + ptype
				+ ", pcode=" + pcode + ", package_name=" + package_name + ", posn_code=" + posn_code + ", preout_amt="
				+ preout_amt + ", policy_id=" + policy_id + ", backup_area_code=" + backup_area_code + ", backupid="
				+ backupid + ", done_flag=" + done_flag + "]";
	}
	
	
	
	
	
	
	
}
