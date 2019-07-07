package com.project0.beans;

import java.util.ArrayList;

import com.project0.inventory.*;

public class Employee extends User {
	protected String username;
	protected String password;
	protected String firstname;
	protected String lastname;
	private Double offers;
	private Double payments;
	private ArrayList<Car> carsInLot = new ArrayList<Car>();

	// getters and setters
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

// fields 
	public Employee(String username, String password, String firstname, String lastname) {
		super(username, password, firstname, lastname);

		// this.offers = offers;
		// this.payments = payments;
	}

//toString 
	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", offers=" + offers + ", payments=" + payments + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getOffers()=" + getOffers() + ", getPayments()=" + getPayments() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public ArrayList<Car> returnSellableCars() {
		return carsInLot;
	}

	public static void put(String username2, Employee newEmployeeLogin) {
		// TODO Auto-generated method stub
		
	}
}
