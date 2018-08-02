package com.sanyang.logistics03.vo;

public class Receipt {
	
	Integer rcpt_id;
	Integer sched_id;
	Integer wh_id;
	String plan_receipt_date;
	String status_id;
	String create_date;
	String update_date;
	
	public Receipt() {
		// TODO Auto-generated constructor stub
	}

	public Receipt(Integer rcpt_id, Integer sched_id, Integer wh_id, String plan_receipt_date, String status_id,
			String create_date, String update_date) {
		super();
		this.rcpt_id = rcpt_id;
		this.sched_id = sched_id;
		this.wh_id = wh_id;
		this.plan_receipt_date = plan_receipt_date;
		this.status_id = status_id;
		this.create_date = create_date;
		this.update_date = update_date;
	}

	public Integer getRcpt_id() {
		return rcpt_id;
	}

	public void setRcpt_id(Integer rcpt_id) {
		this.rcpt_id = rcpt_id;
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

	public String getPlan_receipt_date() {
		return plan_receipt_date;
	}

	public void setPlan_receipt_date(String plan_receipt_date) {
		this.plan_receipt_date = plan_receipt_date;
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

	@Override
	public String toString() {
		return "Receipt [rcpt_id=" + rcpt_id + ", sched_id=" + sched_id + ", wh_id=" + wh_id + ", plan_receipt_date="
				+ plan_receipt_date + ", status_id=" + status_id + ", create_date=" + create_date + ", update_date="
				+ update_date + "]";
	}
	
	
	
	
	
}
