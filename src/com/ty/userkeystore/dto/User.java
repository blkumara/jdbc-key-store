package com.ty.userkeystore.dto;

public class User {
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}
	private int uid;
	private String userName;
	private String email;
	private String password;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
