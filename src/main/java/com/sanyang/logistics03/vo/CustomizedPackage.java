package com.sanyang.logistics03.vo;


public class CustomizedPackage {
	
	private Integer pid;
	
	private String pname;
	
	private String rules;
	
	private String rule_description;
	
	private String unit_weight;
	
	private String unit_volume;
	
	private String unit_length;
	
	private String unit_width;
	
	private String unit_height;
	
	private String unit_flag;
	

	public CustomizedPackage() {
		// TODO Auto-generated constructor stub
	}


	public CustomizedPackage(Integer pid, String pname, String rules, String rule_description, String unit_weight,
			String unit_volume, String unit_length, String unit_width, String unit_height, String unit_flag) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.rules = rules;
		this.rule_description = rule_description;
		this.unit_weight = unit_weight;
		this.unit_volume = unit_volume;
		this.unit_length = unit_length;
		this.unit_width = unit_width;
		this.unit_height = unit_height;
		this.unit_flag = unit_flag;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getRules() {
		return rules;
	}


	public void setRules(String rules) {
		this.rules = rules;
	}


	public String getRule_description() {
		return rule_description;
	}


	public void setRule_description(String rule_description) {
		this.rule_description = rule_description;
	}


	public String getUnit_weight() {
		return unit_weight;
	}


	public void setUnit_weight(String unit_weight) {
		this.unit_weight = unit_weight;
	}


	public String getUnit_volume() {
		return unit_volume;
	}


	public void setUnit_volume(String unit_volume) {
		this.unit_volume = unit_volume;
	}


	public String getUnit_length() {
		return unit_length;
	}


	public void setUnit_length(String unit_length) {
		this.unit_length = unit_length;
	}


	public String getUnit_width() {
		return unit_width;
	}


	public void setUnit_width(String unit_width) {
		this.unit_width = unit_width;
	}


	public String getUnit_height() {
		return unit_height;
	}


	public void setUnit_height(String unit_height) {
		this.unit_height = unit_height;
	}


	public String getUnit_flag() {
		return unit_flag;
	}


	public void setUnit_flag(String unit_flag) {
		this.unit_flag = unit_flag;
	}


	@Override
	public String toString() {
		return "CustomizedPackage [pid=" + pid + ", pname=" + pname + ", rules=" + rules + ", rule_description="
				+ rule_description + ", unit_weight=" + unit_weight + ", unit_volume=" + unit_volume + ", unit_length="
				+ unit_length + ", unit_width=" + unit_width + ", unit_height=" + unit_height + ", unit_flag="
				+ unit_flag + "]";
	}
	
	
}
