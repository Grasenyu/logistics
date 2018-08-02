package com.sanyang.logistics03.vo;

public class SysFunction {
	 private Integer   func_id;
	 private String  name;
	 private String  url;
	 private char  func_level;
	 private Integer  parent_id;
	 private String  description;
	 
	 
	 
	 
	 public SysFunction() {
		// TODO Auto-generated constructor stub
	}
	public SysFunction(Integer func_id, String name, String url, char func_level, Integer parent_id,
			String description) {
		super();
		this.func_id = func_id;
		this.name = name;
		this.url = url;
		this.func_level = func_level;
		this.parent_id = parent_id;
		this.description = description;
	}
	@Override
	public String toString() {
		return "SysFunction [func_id=" + func_id + ", name=" + name + ", url=" + url + ", func_level=" + func_level
				+ ", parent_id=" + parent_id + ", description=" + description + "]";
	}
	public Integer getFunc_id() {
		return func_id;
	}
	public void setFunc_id(Integer func_id) {
		this.func_id = func_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public char getFunc_level() {
		return func_level;
	}
	public void setFunc_level(char func_level) {
		this.func_level = func_level;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 
	 
	 
}
