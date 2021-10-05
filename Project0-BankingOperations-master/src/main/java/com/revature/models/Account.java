package com.revature.models;

public class Account {
	
	private double deposit;
	private double balance;
	private String username;
	private String password;
	private boolean isActive;
	private boolean inJoinAccount;
	
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
	public Account(String username, Strig password, double deposit) {
		this();
		this.username = username;
		this.password = password;
		this.deposit = deposit;
	}
	
	
}
