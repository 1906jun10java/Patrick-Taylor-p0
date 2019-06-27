package com.project0.bean;

public class User {//our object class. everything will inherit from this class

	//no-args constructor
	public User() {
		super();
	}

	//constructor method 
	public User(String username, String password, Double offers, Double payments) {
		super();
		this.username = username;
		this.password = password;
		this.offers = offers;
		this.payments = payments;
	}

	//fields for User class
	protected String username;
	protected String password;
	private Double offers;
	private Double payments;

	//getters and setters generated for the User Class
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
	public Double getOffers() {
		return offers;
	}
	public void setOffers(Double offers) {
		this.offers = offers;
	}
	public Double getPayments() {
		return payments;
	}
	public void setPayments(Double payments) {
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", offers=" + offers + ", payments=" + payments
				+ "]";
	}
}
