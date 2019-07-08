package com.project0.car;

import java.util.ArrayList;
import com.project0.beans.*;

public class CarLot {
	
	static ArrayList<Car> carLot = new ArrayList<Car>();

	// addition of a car CarLot
	public static void addCars(String make, String model, String color, int year, double milage, String transmission, int carId) {
		Car car = new Car(make, model, color, year, milage, transmission, carId);
		carLot.add(car);
		return;
	}

	// adds a car object to the Array
	public static void addCarsObject(Car car) {
		carLot.add(car);
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
		Car car = carLot.get(index);
		return car;
	}

	// prints all cars from the array list
	public static void printLot() {
		int t = 1;
		for (Car car : carLot) {
			System.out.println(t + ")");
			System.out.println(car);
			t++;

		}

	}
	public static Car returnCarByiD(int carId) {
		for (Car car: carLot) {
			if(car.getCarId()== carId) {
					return car;
			}
		}
		
		
		System.out.println("No car with this Id please try again ");
		return null;
		
	}
}
