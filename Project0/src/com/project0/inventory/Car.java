package com.project0.inventory;

import java.util.ArrayList;
import java.util.List;

import com.project0.car.CarLot;

public class Car extends CarLot{	
	/*
	 * For the Car class, we can implement the methods for:
	 * view the cars on the lot
	 * 
	 * add or remove cars from the lot 
	 * 
	 * sort cars
	 */
	private List<CarLot> newInv = new ArrayList<>();
	//(String make, String model, String color, int year, double milage, String transmission)
	
		public boolean addCarsToLot(Car e) {//method for adding cars to the lot
			newInv.add(new Car());	
			if (newInv.add(new Car()) == List<Carlot>()) {
				
			}
			return true;  
			
		}

}
