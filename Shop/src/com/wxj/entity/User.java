package com.wxj.entity;

import java.sql.*;

public class User {
	private String username;
	private String password;
	private String phone;
	private Timestamp register_time;
	private int userID ;
	
	public int getUserID() {
		return userID;
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
	public Timestamp getRegister_time() {
		return register_time;
	}
	public void setRegister_time(Timestamp register_time) {
		this.register_time = register_time;
	}
	
	
}
