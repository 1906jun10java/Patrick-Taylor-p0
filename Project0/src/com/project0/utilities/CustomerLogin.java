package com.project0.utilities;

import com.project0.beans.*;
import java.util.HashMap;

public class CustomerLogin {
	public static HashMap<String, Customer> cusLogin = new HashMap<>();
// using a HashMap because we can use key value pairs to get our customers info 
// it is unordered , if we wanted order we could use a Linked HashMap 

	// New Customer addition
	public static boolean newCustomerLogin(String userName, String password, String firstname, String lastname) {
		if (userName != null) {
			if (password != null) {
				Customer you = new Customer(userName, password, firstname, lastname);
				cusLogin.put(you.getUsername(), you);
				return true;
			}
		}
		// if you leave a field blank you will get this message !
		System.out.println("please make sure all fields are filled !");
		return false;

	}

	// will return if user name is already in the map
	public static Customer returningCustomer(String userName) {
		return cusLogin.get(userName);
	}

	public static boolean login(String userName, String password) {
		boolean result;
		result = cusLogin.containsKey(userName);
		if (result = false) {
			System.out.println("Username not found , please try again . Dont't have an account ? sign up !");
			return false;
			// this line is for if our users userName is not already in the HashMap
		}
		Customer you = cusLogin.get(userName);
		if (you.getPassword().equals(password)) {
			System.out.println("welcome !");
			return true;
			// these lines are for when our userName is correct
		}

		System.out.println("password was not accepted please retry.");
		// if (you.getPassword().equals(null)) {
		return false;
		// if our password is incorrect
	}

	// will return our customer userName
	public static Customer returnCustomer(String userName) {
		return cusLogin.get(userName);
	}
	
}
// this will be where we insert the data relationship between SQL  and our cusLogin HashMap 
