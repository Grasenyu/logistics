package com.sanyang.logistics03.vo;

public class PrepareOutWarehouse {
	private Integer	posn_id;
	private String	posn_code;
	private Integer	shelf_id;
	private Integer	wh_id;
	private String posn_no;
	private Integer	capacity;
	private Integer	available_capacity;
	private Integer	occupy_amt;

	
	public PrepareOutWarehouse() {
		// TODO Auto-generated constructor stub
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


	public Integer getShelf_id() {
		return shelf_id;
	}


	public void setShelf_id(Integer shelf_id) {
		this.shelf_id = shelf_id;
	}


	public Integer getWh_id() {
		return wh_id;
	}


	public void setWh_id(Integer wh_id) {
		this.wh_id = wh_id;
	}


	public String getPosn_no() {
		return posn_no;
	}


	public void setPosn_no(String posn_no) {
		this.posn_no = posn_no;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public Integer getAvailable_capacity() {
		return available_capacity;
	}


	public void setAvailable_capacity(Integer available_capacity) {
		this.available_capacity = available_capacity;
	}


	public Integer getOccupy_amt() {
		return occupy_amt;
	}


	public void setOccupy_amt(Integer occupy_amt) {
		this.occupy_amt = occupy_amt;
	}


	@Override
	public String toString() {
		return "PrepareOutWarehouse [posn_id=" + posn_id + ", posn_code=" + posn_code + ", shelf_id=" + shelf_id
				+ ", wh_id=" + wh_id + ", posn_no=" + posn_no + ", capacity=" + capacity + ", available_capacity="
				+ available_capacity + ", occupy_amt=" + occupy_amt + "]";
	}


	public PrepareOutWarehouse(Integer posn_id, String posn_code, Integer shelf_id, Integer wh_id, String posn_no,
			Integer capacity, Integer available_capacity, Integer occupy_amt) {
		super();
		this.posn_id = posn_id;
		this.posn_code = posn_code;
		this.shelf_id = shelf_id;
		this.wh_id = wh_id;
		this.posn_no = posn_no;
		this.capacity = capacity;
		this.available_capacity = available_capacity;
		this.occupy_amt = occupy_amt;
	}
	
	
	
	
	
	
	
}
