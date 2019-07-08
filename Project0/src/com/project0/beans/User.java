package com.project0.beans;

public abstract class User {
	// our object class. everything will inherit from this class
	// no-args constructor
	// constructor method

	public User(String username, String password, String firstname, String lastname) {

		super();

		this.username = username; // employee or customer username
		this.password = password; // their password
		this.firstname = firstname; // first name
		this.lastname = lastname; // last name

		// this.offers = offers; // offers on all cars .. not sure if this should be in
		// another class itself
		// this.payments = payments; // Customer or employee will be able to see
		// payments

	}

	// fields for User class

	protected String username;
	protected String password;
	private String firstname;
	private String lastname;
	// private Double offers;
	// private Double payments;

	// getters and setters generated for the User Class

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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	// toString

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + "]";
	}
}

/*
 * public Double getOffers() { //public void setPayments(Double payments) { //
 * this.payments = payments;
 * 
 * // return offers; //public void setOffers(Double offers) { // this.offers =
 * offers;
 * 
 * //public Double getPayments() { //return payments;
 */
// not sure if we need this in the user bean class 