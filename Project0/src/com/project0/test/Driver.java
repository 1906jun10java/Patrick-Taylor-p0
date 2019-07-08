package com.project0.test;

import java.util.Scanner;

import com.project0.utilities.*;

public class Driver
{

	public static void main(String[] args)
	{
		// this is where we'll be referencing our scanner that we made in our utility
		// package
		ScannerUse su = ScannerUse.getInstance();

		// returns the reference to our static instance in the ScannerUse class
		Scanner cs = su.returnScanner();

		// scanner close
		cs.close();

	}

}
