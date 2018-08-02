package com.sanyang.logistics03.vo;

public class Workorder_Product {
	
	  private int oid;//` int(11) NOT NULL AUTO_INCREMENT,
	  private int prod_id;//` int(11) DEFAULT NULL,
	  private int workid;//` int(11) DEFAULT NULL,
	  private int pcount;//` int(11) DEFAULT NULL,
	  private int scount;//` int(11) DEFAULT NULL,
	  
	  public Workorder_Product() {
		// TODO Auto-generated constructor stub
	}
	  
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public int getWorkid() {
		return workid;
	}
	public void setWorkid(int workid) {
		this.workid = workid;
	}
	public int getPcount() {
		return pcount;
	}
	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
	public int getScount() {
		return scount;
	}
	public void setScount(int scount) {
		this.scount = scount;
	}
	@Override
	public String toString() {
		return "Workorder_Product [oid=" + oid + ", prod_id=" + prod_id + ", workid=" + workid + ", pcount=" + pcount
				+ ", scount=" + scount + "]";
	}
	public Workorder_Product(int oid, int prod_id, int workid, int pcount, int scount) {
		super();
		this.oid = oid;
		this.prod_id = prod_id;
		this.workid = workid;
		this.pcount = pcount;
		this.scount = scount;
	}
	  
	  

}
