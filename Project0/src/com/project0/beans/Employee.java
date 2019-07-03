package com.project0.beans;
import com.project0.inventory.*;
public class Employee extends User {

	// field for the Employee Class

	protected String username;

	protected String password;

	private Double offers;

	private Double payments;
	private Array

	// getters and setters for the Employee Class

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

	// constructor for Employee Class

	public Employee(String username, String password, Double offers, Double payments) {

		super(password, password, password, password);

		this.username = username;

		this.password = password;

		this.offers = offers;

		this.payments = payments;

	}

	@Override

	public String toString() {

		return "Employee [username=" + username + ", password=" + password + ", offers=" + offers + ", payments="

				+ payments + "]";

	}

}
