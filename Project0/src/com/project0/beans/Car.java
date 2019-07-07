package com.project0.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.project0.car.CarLot;

public class Car extends CarLot {

	/*
	 * 
	 * For the Car class, we can implement the methods for:
	 * 
	 * view the cars on the lot
	 * 
	 * 
	 * 
	 * add or remove cars from the lot
	 * 
	 * 
	 * 
	 * sort cars
	 * 
	 */
	private List<CarLot> newInv = new ArrayList<>();

	// (String make, String model, String color, int year, double milage, String
	// transmission)

	public boolean addCarsToLot(Car e) {//method for adding cars to the lot
				newInv.add(new Car());	

				if (newInv.add(new Car()) == List<Carlot>()) {
				

				return true;  

				

			}
			public HashMap<String, Double> carlist;

				HashMap<String, Double> carList; 

				carList.put("Subaru", 29095.00);

				carList.put("Ford", 29965.00);

				carList.put("Cadillac", 63215.00);

				carList.put("BMW", 40499.00);

				carList.put("Jeep", 50317.00);

				carList.put("Chevrolet", 49000.00);

				System.out.println(carList);

				return carList.size();
	}
}

