package com.zzq.domain;

public class Account {
	private long account_id;
	private String account_name;
	private String userName;
	private String account_password;
	private double account_balance;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public String getaccount_name() {
		return account_name;
	}
	public void setaccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getAccount_password() {
		return account_password;
	}
	public void setAccount_password(String account_password) {
		this.account_password = account_password;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	
	public Account(String account_name, String userName, String account_password) {
		super();
		this.account_name = account_name;
		this.userName = userName;
		this.account_password = account_password;
	}
	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_name=" + account_name + ", account_password=" + account_password
				+ ", account_balance=" + account_balance + "]";
	}
	
}
