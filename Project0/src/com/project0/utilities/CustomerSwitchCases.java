package com.project0.utilities;

import java.util.Scanner;

import com.project0.beans.Customer;
import com.project0.car.CarLot;
import com.project0.finances.OfferLog;
import com.project0.finances.Payments;
import com.project0.finances.PaymentsLog;

public class CustomerSwitchCases
{
	public static void CustomerMenus(Customer customer)
	{

	}

// using Scanner.. or rather not sure if we need it for now  
	static ScannerUse su = ScannerUse.getInstance();
	static Scanner cs = su.returnScanner();

	// But ! we will use our DataEntry!
	DataEntry de = new DataEntry();

	// exit but only will exit when statement is true
	boolean exitTomenu = false;
	// our switch case variable
	int customerSwitchCase = 0;

	private Customer customer;
	{

		while (exitTomenu != true)
		{
			// our print lines for customer menu
			System.out.println(
					"Hey" + customer.getFirstname() + ",Thanks for logging in ! What can we do for you today?");

			System.out.println("1) Make a payment");
			System.out.println("2) Make an Offer on a car");
			System.out.println("3) View my cars");
			System.out.println("4) View cars in the Lot");
			System.out.println("5) Logout");

			// this is where our parsed int comes int
			customerSwitchCase = de.thisInt();
			cs.nextInt();

			switch (customerSwitchCase)
				{

				case 1: // Make a payment
					Payments payMycar = PaymentsLog.returnAccounts(customer.getUsername());
					// shows user what their monthly payment is
					System.out.println(
							customer.getFirstname() + "Your monthly payment is:" + payMycar.getMonthlyPayments());
					// if they want to make a payment then they can press "1" on the console
					System.out.println("Make a Payment??");
					System.out.println("press 1 if you want to make a payment");

					// this will make the int selection run as a string
					int paymentSelection = de.thisInt();
					// if the user presses 1 then the system will get use the equation to subtract
					// monthly payment from the cars remaining balance
					if (paymentSelection == 1)
					{
						payMycar.setMonthlyPayments(payMycar.getPayOffbalance() - payMycar.getMonthlyPayments()); // equation
																													// for
																													// how
																													// much
																													// you
																													// still
																													// owe
						BillofSale.addToBill(payMycar);
						System.out.println(
								"Thank you for your payment ! we'll get back to you on your remaining balance");
						System.out.println("HEY ! your new remaning balance is $" + payMycar.getPayOffbalance());
					}

					else
					{
						System.out.println("No payment printed ");
					}
					System.out.println("Taking you back to the main menu");
					break;

				case 2: // making an offer on the car
					OfferLog.newOffer(customer);

					break;

				case 3:// view my cars
					if (!PaymentsLog.accountHere(customer.getUsername()))
					{
						;
						System.out.println("You have no cars .. Lets fix that !");
						break;
					}

					Payments payCar = PaymentsLog.returnAccounts(customer.getUsername());
					OwnedCars.printSoldOnes(payCar.getCarId());
					break;

				case 4:
					CarLot.printLot();
					break;
				case 0:
					System.out.println("Logging out");
					exitTomenu = true;
					break;

				default:
					System.out.println("Mistakes were made . Try again");
					break;

				}
		}
	}
}
