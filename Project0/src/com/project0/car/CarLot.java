package com.project0.car;

import java.util.ArrayList;
import com.project0.beans.*;

public class CarLot {
	
	static ArrayList<Car> carLot = new ArrayList<Car>();

	// addition of a car CarLot
	public static void addCars(String make, String model, String color, int year, double milage, String transmission) {
		Car c = new Car(make, model, color, year, milage, transmission);
		carLot.add(c);
		return;
	}

	// adds a car object to the Array
	public static void addCarsObject(Car c) {
		carLot.add(c);
		return;
	}

	// removes cars from the Array
	public static void removeCars(Car car) {
		carLot.remove(car);
		return;
	}

	// gets the Index of a specific car 
	public static Car returnIndex(int index) {
		if (index > carLot.size() || index < 0) {
			System.out.println("You need to make a selection before we can continue");
			return null;
		}
		Car c = carLot.get(index);
		return c;
	}

	// prints all cars from the array list
	public static void printLot() {
		int t = 1;
		for (Car c : carLot) {
			System.out.println(t + ")");
			System.out.println(c);
			t++;

		}

	}
	public static Car returnCarByiD(int carId) {
		for (Car c: carLot) {
			if(c.getCarId()== carId) {
					return c;
			}
		}
		
		
		System.out.println("No car with this Id please try again ");
		return null;
		
	}
}
