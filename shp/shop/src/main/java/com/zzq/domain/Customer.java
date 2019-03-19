package com.zzq.domain;

import java.util.Date;

/**
 * 
 * @author Administrator
 *	消费者
 */
public class Customer {
	private int id;
	private String userName;
	
	private String passWord;
	
	private String address;
	
	private String email;
	
	private String phone;
	
	private Date buyTime;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public Customer(String userName, String passWord, String address,
			String email, String phone) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
