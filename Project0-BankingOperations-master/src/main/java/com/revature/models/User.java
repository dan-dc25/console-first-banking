package com.revature.models;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	//private List<Account> accounts; 
	
	public User() {
		super();
		//accounts = new ArrayList<Account>();
	}

	
	public User(String firstName, String lastName, String email, String username, String password) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.setEmail(email);
		this.username = username;
		this.password = password;
	}

	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	@Override
	public String toString() {
		return "User [First name: " + firstName + ", Last name: " + lastName + ", username: " + username + ", password: " + password + "]";
	}

}