package com.project0.utilities;


import java.util.Scanner;

public class MenuFrameWork {
	static ScannerUse su = ScannerUse.getInstance();
	static Scanner cs = su.returnScanner();

	public static int menuSelect() {
		System.out.println("Welcome to the main menu");
		System.out.println(
				"Please Make a Selection , If you're logging in as an employee press 1 . if you're a customer , press 2. Are you new ? "
						+ "enter 3 to get to setup . 4 to check out our cars ");
		int selection = cs.nextInt();
		return selection;
	}

	public static Integer parseInt() {
		return Integer.parseInt(cs.next());

	}

	public static int customerSelection() {
		System.out.println("WELCOME VALUED CUSTOMER");
		System.out.println("Please choose an option"
				+ "1 to make a payment, press 2 to view your owned cars. Press 3 to view your offers. Press 4 to logout ");
		return cs.nextInt();

	}

	public static int employeeSelection() {
		System.out.println(" WELCOME BACK ! , HOW CAN WE HELP OUR VALUED CUSTOMERS TODAY !?");
		System.out.println(" Press 1 to view all offers on our vehicles , 2 to view the CarLot . 3 to add remove cars from CarLot" +" 4 to view all payments . 5 to logout ");
		return cs.nextInt();
	}




}


