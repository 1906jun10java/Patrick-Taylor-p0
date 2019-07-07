package com.project0.utilities;

import java.util.HashMap;

import com.project0.beans.*;

public class EmployeeLogin {
	public static HashMap<String, Employee> empLogin = new HashMap<>();

	public static boolean newEmployeeLogin(String userName, String password, String firstname, String lastname) {
		if (userName != null) {
			if (password != null) {
				Employee newEmployeeLogin = new Employee(userName, password, firstname, lastname); 
				
					Employee.put(newEmployeeLogin.getUsername(), newEmployeeLogin);
				return true;
			}
		}
		// if you leave a field blank you will get this message !
		System.out.println("please make sure all fields are filled !");
		return false;

	}

	// will return if user name is already in the map
	public static Employee employeeLogin(String userName) {
		return empLogin.get(userName);
	}

	public static boolean login(String userName, String password) {
		boolean result;
		result = empLogin.containsKey(userName);
		if (result = false) {
			System.out.println("Username not found , If you haven't been added ask your manager to add you");
			return false;
			// this line is for if our users userName is not already in the HashMap
		}
		Employee employeeLogin = empLogin.get(userName);
		if (employeeLogin.getPassword().equals(password)) {
			System.out.println("welcome !" + userName);
			return true;
			// these lines are for when our userName is correct
		}

		System.out.println(
				"password was not accepted please retry. if you forgot your pasword please let management know ");
		// if (you.getPassword().equals(null)) {
		return false;
		// if our password is incorrect
	}
	public static Employee returnEmployee(String userName) {
		// return Employee userName
		return empLogin.get(userName);
	}
	
	
} 
	