package com.project0.finances;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math.*;

public class Payments {
		/*
		 * I created a scanner to implement in all the methods below. 
		 * just check it out and see if that is correct for your scanner class
		 * to determine if it will work or not. 
		 * im getting a few errors, im not sure why but then hopefully the code runs.
		 * if you see any changes that need to be done let me know. 
		 */
	Scanner sc = new Scanner(System.in);
	public HashMap<String, Double> carlist;
	public double principal;
	public double term;
	public double payments;
	public double rate;

	public int carLot(){
		
			HashMap<String, Double> carList = null;
			carList.put("Subaru", 29095.00);
			carList.put("Ford", 29965.00);
			carList.put("Cadillac", 63215.00);
			carList.put("BMW", 40499.00);
			carList.put("Jeep", 50317.00);
			carList.put("Chevrolet", 49000.00);
			System.out.println(carList);
		return carList.size();
		
	}
	public double annualTerms() {
		//number of months the auto loan will be
		//customers will be able to select the terms of their loan
		//need to use the scanner method 
		double[] arrterm = {24, 36, 48, 60, 72, 84}; 
		for (int i = 0; i <= arrterm.length; i++){
			System.out.println(term);
		}
		System.out.println("Select the term that fits your desire.");
		int term = sc.nextInt();
		System.out.println("Customer elected to term condition: "+term);
		return term;	
	}
		
	public double carLoan(double principal) {
		HashMap<String, Double> carList = null;
		
		if(carList.isEmpty()) {
		System.out.println("Car Lot is vacant.");;
		}else if (carList.size() > 0) {
		//need to implement the scanner method so customer can select car. 
		System.out.println("Select from Vehicle List: "+carList.entrySet());
		String vehicleselect = sc.nextLine();
		System.out.println("You have selected: " +vehicleselect); 
		}
		String vehicleselect;
		if("vehicleselect" == "Subaru") {
			System.out.println(carList.get("Subaru"));
		}else if("vehicleselect" == "Ford")
			System.out.println(carList.get("Ford"));
		else if("vehicleselect" == "Cadillac") {
			System.out.println(carList.get("Cadillac"));
		}else if("vehicleselect" == "BMW") {
			System.out.println(carList.get("BMW"));
		}else if("vehicleselect" == "Jeep") {
			System.out.println(carList.get("Jeep"));
		}else if ("vehicleselect" == "Chevrolet") {
			System.out.println(carList.get("Chevrolet"));
		} else {
			System.out.println("You have to make a selection.");
		}
		return principal;
	}
	public double interestRate(double rate) {
		System.out.println("Select interest rate from 1 to 20.");
		double intrate = sc.nextDouble();
		System.out.println("You've selected: "+intrate);
		
		double a = 12.0;
		rate = (intrate /a);
		return rate;
	}
	public double monthlyPayments(double monthlyPayment) {
		double annualrate = this.interestRate(rate);
		double vehicleprice = this.carLoan(principal);
		double months = this.annualTerms(); 
	
		monthlyPayment = ((annualrate*vehicleprice)/(1-(1 + annualrate)*(-(Math.sqrt(months)))));
		
		return monthlyPayment;	
	}
}
