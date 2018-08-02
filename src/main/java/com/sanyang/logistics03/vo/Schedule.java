package com.sanyang.logistics03.vo;

public class Schedule {
	
	Integer sched_id;
	Integer region_id;
	String create_date;
	String update_date;
	String exec_done_flag;
	Integer sched_type_id;
	Integer driver_type;
	Integer truck_id;
	Integer driver_id;
	Integer third_party_id;
	String end_date;
	Integer hacount;
	Integer pcount;
	String schstatus;
	String fromaddress;
	String toaddress;
	String cuname;
	String cuphone;
	
	public Schedule() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Schedule(Integer sched_id, Integer region_id, String create_date, String update_date, String exec_done_flag,
			Integer sched_type_id, Integer driver_type, Integer truck_id, Integer driver_id, Integer third_party_id,
			String end_date, Integer hacount, Integer pcount, String schstatus, String fromaddress, String toaddress,
			String cuname, String cuphone) {
		super();
		this.sched_id = sched_id;
		this.region_id = region_id;
		this.create_date = create_date;
		this.update_date = update_date;
		this.exec_done_flag = exec_done_flag;
		this.sched_type_id = sched_type_id;
		this.driver_type = driver_type;
		this.truck_id = truck_id;
		this.driver_id = driver_id;
		this.third_party_id = third_party_id;
		this.end_date = end_date;
		this.hacount = hacount;
		this.pcount = pcount;
		this.schstatus = schstatus;
		this.fromaddress = fromaddress;
		this.toaddress = toaddress;
		this.cuname = cuname;
		this.cuphone = cuphone;
	}


	public Integer getSched_id() {
		return sched_id;
	}


	public void setSched_id(Integer sched_id) {
		this.sched_id = sched_id;
	}


	public Integer getRegion_id() {
		return region_id;
	}


	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
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


	public String getExec_done_flag() {
		return exec_done_flag;
	}


	public void setExec_done_flag(String exec_done_flag) {
		this.exec_done_flag = exec_done_flag;
	}


	public Integer getSched_type_id() {
		return sched_type_id;
	}


	public void setSched_type_id(Integer sched_type_id) {
		this.sched_type_id = sched_type_id;
	}


	public Integer getDriver_type() {
		return driver_type;
	}


	public void setDriver_type(Integer driver_type) {
		this.driver_type = driver_type;
	}


	public Integer getTruck_id() {
		return truck_id;
	}


	public void setTruck_id(Integer truck_id) {
		this.truck_id = truck_id;
	}


	public Integer getDriver_id() {
		return driver_id;
	}


	public void setDriver_id(Integer driver_id) {
		this.driver_id = driver_id;
	}


	public Integer getThird_party_id() {
		return third_party_id;
	}


	public void setThird_party_id(Integer third_party_id) {
		this.third_party_id = third_party_id;
	}


	public String getEnd_date() {
		return end_date;
	}


	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	public Integer getHacount() {
		return hacount;
	}


	public void setHacount(Integer hacount) {
		this.hacount = hacount;
	}


	public Integer getPcount() {
		return pcount;
	}


	public void setPcount(Integer pcount) {
		this.pcount = pcount;
	}


	public String getSchstatus() {
		return schstatus;
	}


	public void setSchstatus(String schstatus) {
		this.schstatus = schstatus;
	}


	public String getFromaddress() {
		return fromaddress;
	}


	public void setFromaddress(String fromaddress) {
		this.fromaddress = fromaddress;
	}


	public String getToaddress() {
		return toaddress;
	}


	public void setToaddress(String toaddress) {
		this.toaddress = toaddress;
	}


	public String getCuname() {
		return cuname;
	}


	public void setCuname(String cuname) {
		this.cuname = cuname;
	}


	public String getCuphone() {
		return cuphone;
	}


	public void setCuphone(String cuphone) {
		this.cuphone = cuphone;
	}


	@Override
	public String toString() {
		return "Schedule [sched_id=" + sched_id + ", region_id=" + region_id + ", create_date=" + create_date
				+ ", update_date=" + update_date + ", exec_done_flag=" + exec_done_flag + ", sched_type_id="
				+ sched_type_id + ", driver_type=" + driver_type + ", truck_id=" + truck_id + ", driver_id=" + driver_id
				+ ", third_party_id=" + third_party_id + ", end_date=" + end_date + ", hacount=" + hacount + ", pcount="
				+ pcount + ", schstatus=" + schstatus + ", fromaddress=" + fromaddress + ", toaddress=" + toaddress
				+ ", cuname=" + cuname + ", cuphone=" + cuphone + "]";
	}
	
	
	
	
}
