package com.project0.test;

public class JunitTest1 {
	public int StartingOffer(double offerAmt) {

		int offer = 1;

		switch (offer)

		{

		case 1:

			offerAmt = 1500.00;

			if (offerAmt <= 999.99) {

				System.out.println("Your offer is too low for the vehicle");

			} else if (offerAmt >= 1000.00)

				System.out.println("Your offer can't be beat.");

			break;

		case 2:

			offerAmt = -500.00;

			if (offerAmt < 0)

				System.out.println("Please make an offer greater than 0.");

			break;

		}

		return offer;
	}
}
