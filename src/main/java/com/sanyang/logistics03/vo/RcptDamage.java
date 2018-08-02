package com.sanyang.logistics03.vo;

public class RcptDamage {

	Integer damageid ;
	Integer rcpt_id;
	Integer prod_id;
	String damage_degree;
    Integer damagecount;
    String bar_code;
    String posn;
    
    public RcptDamage() {
		// TODO Auto-generated constructor stub
	}

	public Integer getDamageid() {
		return damageid;
	}

	public void setDamageid(Integer damageid) {
		this.damageid = damageid;
	}

	public Integer getRcpt_id() {
		return rcpt_id;
	}

	public void setRcpt_id(Integer rcpt_id) {
		this.rcpt_id = rcpt_id;
	}

	public Integer getProd_id() {
		return prod_id;
	}

	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}

	public String getDamage_degree() {
		return damage_degree;
	}

	public void setDamage_degree(String damage_degree) {
		this.damage_degree = damage_degree;
	}

	public Integer getDamagecount() {
		return damagecount;
	}

	public void setDamagecount(Integer damagecount) {
		this.damagecount = damagecount;
	}

	public String getBar_code() {
		return bar_code;
	}

	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}

	public String getPosn() {
		return posn;
	}

	public void setPosn(String posn) {
		this.posn = posn;
	}

	@Override
	public String toString() {
		return "RcptDamage [damageid=" + damageid + ", rcpt_id=" + rcpt_id + ", prod_id=" + prod_id + ", damage_degree="
				+ damage_degree + ", damagecount=" + damagecount + ", bar_code=" + bar_code + ", posn=" + posn + "]";
	}

	public RcptDamage(Integer damageid, Integer rcpt_id, Integer prod_id, String damage_degree, Integer damagecount,
			String bar_code, String posn) {
		super();
		this.damageid = damageid;
		this.rcpt_id = rcpt_id;
		this.prod_id = prod_id;
		this.damage_degree = damage_degree;
		this.damagecount = damagecount;
		this.bar_code = bar_code;
		this.posn = posn;
	}
    
    
}
