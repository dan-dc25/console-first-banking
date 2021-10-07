package com.revature.models;

public class Account {
	
	private double deposit;
	private double balance;
	private double cardLimit;
	private String username;
	private String password;
	private boolean isActive;
	
	public Account() {
		super();
	}
	
	//To create a checking account
	public Account(String usernme, String password) {
		this();
		this.username = username;
		this.password = password;
	}
	
	//To create a savings account
	public Account(String username, String password, double deposit) {
		this();
		this.deposit = deposit;
	}
	
	public double getDepoist() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getCardLimit() {
		return cardLimit;
	}
	
	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
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
	
}
