package com.project0.finances;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.project0.beans.Car;
import com.project0.beans.Customer;
import com.project0.beans.Offers;
import com.project0.car.CarLot;
import com.project0.utilities.DataEntry;
import com.project0.utilities.OwnedCars;

public class OfferLog
{
// we'll be able to use the non static methods in our class (
	static DataEntry de = new DataEntry();

	public static HashMap<Double, Offers> offersmap = new HashMap<>();

	// creates new offers to HashMap
	public static void newOffer(Customer customer)
	{
		int index = 0; // this will hold our index of the cars in our CarLot
		Double offer = 0.0; // this will hold the customers offer before its stored
		Car car;

		CarLot.printLot(); // this will print all of our cars
		System.out.println("interested in a car ? enter the number ! ");
		index = de.thisInt(); // returns the index of the car ( to make it easier to "read")
		car = CarLot.returnCarByiD(--index); // this will return the specific car that has the specific index
		if (car == null)
		{ // if the car does not have an index then null
			return;
		}
		System.out.println(car);
		System.out.println("Make an offer for your selected car");
		offer = de.parseDouble();
		// this is making a new offer while getting the CarId, OfferId , the OfferAmount, the customer username 
		Offers oc = new Offers(car.getCarId(), customer.getOfferId() , customer.getOfferAmount(), customer.getUsername());
		offersmap.put(offer, oc);

		// SQLUtility.tryCreateNewOffer(oc);
		System.out.println("Offer has been placed , please wait for employee approval");
	}

	// this will let us add offers to our Hashmap
	public static void addToOfferMap(Offers oc)
	{
		double offer = oc.getOfferAmount();
		offersmap.put(offer, oc);
		return;
	}

// this will let us view all key value pairs in our HashMap
	public static void printOffers()
	{
		Set<Double> key = new HashSet<>();
		int index = 1;

		System.out.println("these are the number of bids on the car");
		key = offersmap.keySet();
		for (double offer : key)
		{
			Offers oc = offersmap.get(offer);
			System.out.println(oc);
			Car car = CarLot.returnCarByiD(oc.getCarId());
			System.out.println(index + ")" + offer + ":"+car);
			index++;
		}
	}
	// lets our employee pick an offer for our car

	public static void selectOffer()
	{

		double offerselector;
		System.out.println("Select an offer");
		offerselector = de.parseDouble();

		if (offersmap.containsKey(offerselector))
		{ // if the specific key is used then this will call the offer thats
			// paired to the key
			Offers oc = offersmap.get(offerselector);
		
			// payment will go here
			PaymentsLog.createNewPaymentAccount(oc);
			Car car = CarLot.returnCarByiD(oc.getCarId());
			
			// Soldcars will go here
			OwnedCars.addCarsObj(car);
			CarLot.removeCars(car);
			
			// ALL SQL HERE
			System.out.println("Offer has been accepted");

		} else
		{
			System.out.println("No offers have been accepted");
		}
		return;

	}
}
