package com.project0.beans;


import java.util.ArrayList;


import com.project0.inventory.Car;

public class Customer extends User {

	private ArrayList<Car> myCars = new ArrayList<Car>();
	private double amountLeft;
	
	
	// ArrayList so that the customer can see it when using the drop down menus 
	public ArrayList<Car> returnMyCars() {
		return myCars;
	}
	// this will show how much more money is left on the car 
	public double getAmountLeft() {
		return amountLeft; 
	}
	public void setAmountLeft(double amountLeft) {
		this.amountLeft = amountLeft;
	}
	// Constructor for the customer Class

	public Customer(String username, String password, String firstname , String lastname) {

		super(username , password , firstname, lastname);
		
		
		// making a separate method for our remaining balance only available to the customer 
		
		

	// took out the previous information because we did not need it 
	// generated getters and setters for the Customer Class


	}

	@Override
	public String toString() {
		return "Customer [myCars=" + myCars + ", amountLeft=" + amountLeft + ", username=" + username + ", password="
				+ password + ", returnMyCars()=" + returnMyCars() + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
} 

