package com.project0.finances;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.project0.beans.Car;
import com.project0.beans.Customer;
import com.project0.car.CarLot;
import com.project0.utilities.DataEntry;

public class OfferLog {

	public static HashMap<Double, Offers> offer = new HashMap<>();

// when you want to add to our HashMap 
	public static void addToOfferMap(Offers oc) {
		double offer = oc.getOfferAmount();
		offers.put(offer,oc);
		return;
	}
	
	// print out all our offers 
	public static void printOffers() {
		Set<Double> key = new HashSet<>();
		int index = 1;
		
		System.out.println("These are the current offers on a  car");
		
		key = offers.keySet();
		for(double offers : key ) {
			;
			Car c = CarLot.returnCarByiD(oc.getCarId());
			System.out.println(index + ")"+ offer+":"+c) ;
			index++;
			
		}
	}

	// we'll be able to use the non static methods in our class (
	static DataEntry de = new DataEntry();

	public static void newOffersCustomer(Customer customer) {
		int index = 0;
		double offers = 0;
		Car car;

		CarLot.printLot(); // prints our our cars
		System.out.println("enter the car Id you want to bid on today");
		index = de.thisInt(); // returns the index of our car selected
		car = CarLot.returnCarByiD(index); // this will return our cars from out vacant lot
		if (car == null) {
			return;

		}

	}

}
