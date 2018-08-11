package com.sanyang.logistics03.vo;

public class PickOut {
	private Integer	pickout_id;
	private Integer	sched_id;
	private Integer	wh_id;
	private String	plan_pickout_date;
	private String		status_id;
	private String		create_date;
	private String		update_date;
	private String		done_flag;
	private String name;
	 private String contact;

public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

public PickOut() {
	// TODO Auto-generated constructor stub
}

public PickOut(Integer pickout_id, Integer sched_id, Integer wh_id, String plan_pickout_date, String status_id,
		String create_date, String update_date, String done_flag, String name) {
	super();
	this.pickout_id = pickout_id;
	this.sched_id = sched_id;
	this.wh_id = wh_id;
	this.plan_pickout_date = plan_pickout_date;
	this.status_id = status_id;
	this.create_date = create_date;
	this.update_date = update_date;
	this.done_flag = done_flag;
	this.name = name;
}

public Integer getPickout_id() {
	return pickout_id;
}

public void setPickout_id(Integer pickout_id) {
	this.pickout_id = pickout_id;
}

public Integer getSched_id() {
	return sched_id;
}

public void setSched_id(Integer sched_id) {
	this.sched_id = sched_id;
}

public Integer getWh_id() {
	return wh_id;
}

public void setWh_id(Integer wh_id) {
	this.wh_id = wh_id;
}

public String getPlan_pickout_date() {
	return plan_pickout_date;
}

public void setPlan_pickout_date(String plan_pickout_date) {
	this.plan_pickout_date = plan_pickout_date;
}

public String getStatus_id() {
	return status_id;
}

public void setStatus_id(String status_id) {
	this.status_id = status_id;
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

public String getDone_flag() {
	return done_flag;
}

public void setDone_flag(String done_flag) {
	this.done_flag = done_flag;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "PickOut [pickout_id=" + pickout_id + ", sched_id=" + sched_id + ", wh_id=" + wh_id + ", plan_pickout_date="
			+ plan_pickout_date + ", status_id=" + status_id + ", create_date=" + create_date + ", update_date="
			+ update_date + ", done_flag=" + done_flag + ", name=" + name + "]";
}






}
