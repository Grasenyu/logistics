package com.sanyang.logistics03.vo;

public class Yhuser {
	 private Integer  user_id;
	 private String  login_id;
	 private String  username;
	 private String  password;
	 private String  phone;
	 private String  address;
	 
	 public Yhuser() {
		// TODO Auto-generated constructor stub
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Yhuser(Integer user_id, String login_id, String username, String password, String phone, String address) {
		super();
		this.user_id = user_id;
		this.login_id = login_id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Yhuser [user_id=" + user_id + ", login_id=" + login_id + ", username=" + username + ", password="
				+ password + ", phone=" + phone + ", address=" + address + "]";
	}


	 
	

}
