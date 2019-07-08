package com.project0.utilities;

import java.util.ArrayList;
import java.util.List;
import com.project0.beans.Car;

public class OwnedCars
{
	public static List<Car> soldCars = new ArrayList<>();

	// adds a car object to OwnedCars
	public static void addCarsObj(Car c)
	{
		soldCars.add(c); // adds car object to the Ownedcars ArrayList
		return;
	}

	// this method will print the cars that have been sold
	public static void printSoldOnes(int carId)
	{
		for (Car c : soldCars) // ever car sold 
		{
			if (c.getCarId() == carId) // if the Id matches 
			{
				System.out.println(c); // car prints 

			}
			return;
		}

	}

}
