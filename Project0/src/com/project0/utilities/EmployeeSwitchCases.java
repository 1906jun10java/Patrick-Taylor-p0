package com.project0.utilities;

import com.project0.beans.Car;
import java.util.Scanner;
import com.project0.car.*;
import com.project0.finances.*;

class EmployeeSwitchCases
{

	public static void employeeMenus(String empUsername)
	{

// this will create the instance  of the static scanner in our menu 
		ScannerUse su = ScannerUse.getInstance();
		Scanner cs = su.returnScanner();

// this will create our DataEntry instance for our non static methods 
		DataEntry de = new DataEntry();

// exit back to the main menu 
		boolean exitTomain = false;
// our condition for the main menu 
		while (exitTomain != true)
		{
// using switch cases to navigate thru our menus
			int switchCase;

			// our prompts
			System.out.println("Welcome" + empUsername + "! Enter the input for what you need to do today ");
			System.out.println("1) View all payments");
			System.out.println("2) View customer offers");
			System.out.println("3) Add a Car");
			System.out.println("4) Remove a car");
			System.out.println("5) Exit to Main Menu");
			switchCase = de.thisInt();

			switch (switchCase)
				{

				case 1: // view all payments
					BillofSale.viewAllBills();
					break;

				case 2:// view our customer offers
					OfferLog.printOffers(); // this option lets us see all offers
					OfferLog.selectOffer(); // this options lets us see selected offers on our cars
					break;

				case 3:// adding a car to our CarLot
					String make; // all of these are from our Car class in the beans
					String model;
					String color;
					int year;
					double milage;
					String transmission;
					// takes user input and stores them in the fields above
					System.out.println("What make is the car ?: ");
					make = cs.nextLine();

					System.out.println("What's the model of our car?: ");
					model = cs.nextLine();

					System.out.println("What's the color of our new addition?: ");
					color = cs.nextLine();

					System.out.println("What year is the new addition?: ");
					year = de.thisInt();

					System.out.println("How many miles on our new addition?: ");
					milage = de.parseDouble();

					System.out.println("Automatic or manual transmission ?: ");
					transmission = cs.nextLine();

					// constructs a new car and stores it in the CarLot
					CarLot.addCars(make, model, color, year, milage, transmission);

					// will print if car was succesfully added
					System.out.println("Car added !");
					break;

				case 4: // remove a car from our lot
					System.out.println("Select Cars Id #");
					// prints out our CarLot
					CarLot.printLot();
					// user will input which car they want to remove
					int carsId = de.thisInt();

					// takes the parsed Id and returns a car object
					Car car = CarLot.returnCarByiD(--carsId);
					CarLot.removeCars(car);

					// SQL to remove car goes here

					System.out.println("Car has been removed with great success!");
					break;

				case 5:
					exitTomain = true;
					break;
				default:
					System.out.println("whoops something went wrong .. try again!");
					break;

				}

		}
	}
}