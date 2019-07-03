package com.project0.utilities;

import java.util.Scanner;

public class ScannerUse {
// this scanner will let us use a scanner where ever it is needed in our project
	// this will set the scanner to null
	private static ScannerUse su = null;

	// Creates an instance of the scanner
	private static Scanner cs = new Scanner(System.in);

	private ScannerUse() {
		super();
	}

	// this method makes a new instance of our scanner anywhere we put su == null
	public static ScannerUse getInstance() {
		if (su == null) {
			su = new ScannerUse();
		}
		return su;
	}

	// returns the reference to the scanner in this class
	public Scanner returnScanner() {
		return cs;
	}
}
 // credit to my roommates Ben and Nick for instructing me of how to use this 