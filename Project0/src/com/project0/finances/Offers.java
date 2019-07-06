package com.project0.finances; 

import java.util.HashMap;
import java.util.Scanner;


public class Offers {
	/*
	 * using switch cases to setup offers and deals
	 */
	
	Scanner sc = new Scanner(System.in);
	public HashMap<String, Double> carlist;
	public String vehicleSelect;
	public int offerAmt;
	
	public int carLot(){
		
		HashMap<String, Double> carList = null;
		carList.put("Subaru", 29095.00);
		carList.put("Ford", 29965.00);
		carList.put("Cadillac", 63215.00);
		carList.put("BMW", 40499.00);
		carList.put("Jeep", 50317.00);
		carList.put("Chevrolet", 49000.00);
		System.out.println(carList);
	return carList.size();
	}
	
	public String MakeOffer(String vehicleSelect) {
		System.out.println("Select vehicle to place an offer: "+carlist.entrySet());
		vehicleSelect = sc.nextLine(); 
		System.out.println("You've selected to make an offer on: "+vehicleSelect);
		//System.out.println("Place an offer on "+vehicleSelect+" to being the process");
		//double offer = sc.nextDouble();
		//System.out.println("You have placed "+offer+" on"+vehicleSelect+" .");
		System.out.println("Is this correct?");
		String ans = sc.nextLine(); 
		if(ans == "yes") {
			System.out.println("Then lets begin.");
		}else if(ans == "no"){
			System.out.println("Please re-select vehicle "+carlist.entrySet()+" ,and make an offer.");
		}
		return vehicleSelect;
	}
	public int StartingOffer(double offerAmt) {
		System.out.println("Place an offer on "+vehicleSelect+" to begin the process");
		offerAmt= sc.nextInt();
		System.out.println("You elected to place "+offerAmt+" on your"+vehicleSelect);
		
		int offer= 1;
		switch(offer)
		{
		case 1:
			if(offerAmt <= 999.99) {
				System.out.println("Your offer is too low for the "+vehicleSelect);
			} else if(offerAmt >= 1000.00) {
				System.out.println("Your offer can't be beat for "+vehicleSelect+" lets start the negotiation process.");
			}	
				break;
		case 2: 
			if(offerAmt < 0)
			System.out.println("Please make an offer greater than 0.");
		}
		return offer;
		
	}
}
