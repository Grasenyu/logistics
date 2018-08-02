package com.sanyang.logistics03.vo;

public class ProdPosnBridge {

	
	private Integer oid;
	private Integer	posn_id;
	private Integer	wh_id;
	private Integer prod_id;
	private Integer occupy_amt;

	public ProdPosnBridge() {
		// TODO Auto-generated constructor stub
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getPosn_id() {
		return posn_id;
	}

	public void setPosn_id(Integer posn_id) {
		this.posn_id = posn_id;
	}

	public Integer getWh_id() {
		return wh_id;
	}

	public void setWh_id(Integer wh_id) {
		this.wh_id = wh_id;
	}

	public Integer getProd_id() {
		return prod_id;
	}

	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}

	public Integer getOccupy_amt() {
		return occupy_amt;
	}

	public void setOccupy_amt(Integer occupy_amt) {
		this.occupy_amt = occupy_amt;
	}

	@Override
	public String toString() {
		return "ProdPosnBridge [oid=" + oid + ", posn_id=" + posn_id + ", wh_id=" + wh_id + ", prod_id=" + prod_id
				+ ", occupy_amt=" + occupy_amt + "]";
	}

	public ProdPosnBridge(Integer oid, Integer posn_id, Integer wh_id, Integer prod_id, Integer occupy_amt) {
		super();
		this.oid = oid;
		this.posn_id = posn_id;
		this.wh_id = wh_id;
		this.prod_id = prod_id;
		this.occupy_amt = occupy_amt;
	}
	
	
	
}
