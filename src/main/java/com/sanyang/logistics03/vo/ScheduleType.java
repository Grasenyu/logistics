package com.sanyang.logistics03.vo;

public class ScheduleType {
	
	Integer sched_type_id;
	String name;
	String description;

	public ScheduleType() {
		// TODO Auto-generated constructor stub
	}

	public ScheduleType(Integer sched_type_id, String name, String description) {
		super();
		this.sched_type_id = sched_type_id;
		this.name = name;
		this.description = description;
	}

	public Integer getSched_type_id() {
		return sched_type_id;
	}

	public void setSched_type_id(Integer sched_type_id) {
		this.sched_type_id = sched_type_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ScheduleType [sched_type_id=" + sched_type_id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
