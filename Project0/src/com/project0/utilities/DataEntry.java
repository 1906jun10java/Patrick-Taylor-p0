package com.project0.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEntry {
// heres the scanner we made in our ScannerUse Class 
	ScannerUse su = ScannerUse.getInstance();
	Scanner cs = su.returnScanner();

// this is where we'll define our methods,  
// since our users always like to break things
// our first will be if someone tires to use String
//input in an int . 

	public static boolean parseThisInt(String userInput) {
		try {
			Integer.parseInt(userInput);
		} catch (InputMismatchException x) {
			System.out.println("numbers only , try again");
			return false;
		}
		return true;
	}

	public int thisInt() {
		boolean fact = false;
		int result = -1;
		while (fact == false) {
			String userInput = cs.nextLine();
			fact = DataEntry.parseThisInt(userInput);
			if (fact == true) {
				result = Integer.parseInt(userInput);
			}

		}
		return result;
	}

// Now what if the wanted to go the same with a String in a double ?

	public static boolean parseThisDouble(String userInput) {
		try {
			Double.parseDouble(userInput); // our wrapper class
		} catch (InputMismatchException x) {
			System.out.println("Numbers only in this field please try again ");
			return false;
		}
		return true;

	}

	public double parseDouble() {
		boolean fact = false;
		double result = -1;
		while (fact == false) {
			String userInput = cs.nextLine();
			fact = DataEntry.parseThisDouble(userInput);
			if (fact == true) {
				result = Double.parseDouble(userInput);
			}
		}	return result;
	}

	
	}	

