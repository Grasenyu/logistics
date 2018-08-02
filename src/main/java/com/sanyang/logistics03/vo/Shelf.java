package com.sanyang.logistics03.vo;

public class Shelf {
	
	Integer shelf_id;
	String shelf_no;
	Integer layer;
	Integer psnum;
	Integer capacity;
	Integer volume;
	Integer max_bearing;
	Integer channel_flag;
	Integer channel_id;
	Integer wh_id;
	
	String create_date;
	String update_date;
	
	public Shelf() {
		// TODO Auto-generated constructor stub
	}

	public Shelf(Integer shelf_id, String shelf_no, Integer layer, Integer psnum, Integer capacity, Integer volume,
			Integer max_bearing, Integer channel_flag, Integer channel_id, Integer wh_id, String create_date,
			String update_date) {
		super();
		this.shelf_id = shelf_id;
		this.shelf_no = shelf_no;
		this.layer = layer;
		this.psnum = psnum;
		this.capacity = capacity;
		this.volume = volume;
		this.max_bearing = max_bearing;
		this.channel_flag = channel_flag;
		this.channel_id = channel_id;
		this.wh_id = wh_id;
		this.create_date = create_date;
		this.update_date = update_date;
	}

	public Integer getShelf_id() {
		return shelf_id;
	}

	public void setShelf_id(Integer shelf_id) {
		this.shelf_id = shelf_id;
	}

	public String getShelf_no() {
		return shelf_no;
	}

	public void setShelf_no(String shelf_no) {
		this.shelf_no = shelf_no;
	}

	public Integer getLayer() {
		return layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
	}

	public Integer getPsnum() {
		return psnum;
	}

	public void setPsnum(Integer psnum) {
		this.psnum = psnum;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getMax_bearing() {
		return max_bearing;
	}

	public void setMax_bearing(Integer max_bearing) {
		this.max_bearing = max_bearing;
	}

	public Integer getChannel_flag() {
		return channel_flag;
	}

	public void setChannel_flag(Integer channel_flag) {
		this.channel_flag = channel_flag;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public Integer getWh_id() {
		return wh_id;
	}

	public void setWh_id(Integer wh_id) {
		this.wh_id = wh_id;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	@Override
	public String toString() {
		return "Shelf [shelf_id=" + shelf_id + ", shelf_no=" + shelf_no + ", layer=" + layer + ", psnum=" + psnum
				+ ", capacity=" + capacity + ", volume=" + volume + ", max_bearing=" + max_bearing + ", channel_flag="
				+ channel_flag + ", channel_id=" + channel_id + ", wh_id=" + wh_id + ", create_date=" + create_date
				+ ", update_date=" + update_date + "]";
	}
	
	
}
