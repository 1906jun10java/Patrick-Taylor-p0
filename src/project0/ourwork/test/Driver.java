package project0.ourwork.test;

import java.util.ArrayList;
import java.util.List;

import project0.ourwork.CarLot;

public class Driver {

	public static void main(String[] args) {
		//List of Cars on the Lot for the customer to view from
		List<CarLot> inventoryList = new ArrayList<>();
		// CarLot(String make, String model, String color, int year, double milage, String transmission)
		inventoryList.add(new CarLot("Subaru", "Impreza WRX", "Black", 2012, 101850.00, "Manual" ));
		inventoryList.add(new CarLot("Ford", "Mustang", "Red", 2006, 54764.00, "Automatic"));
		inventoryList.add(new CarLot("Cadillac", "CTS-V", "Black", 2013, 51760.00, "Automatic" ));
		inventoryList.add(new CarLot("BMW", "M4", "Blue", 2016, 52860.00, "Automatic" ));
		inventoryList.add(new CarLot("Jeep", "Grand Cherokee - STR8", "White", 2017, 37200.00, "Automatic" ));
		inventoryList.add(new CarLot("Chevrolet", "SS", "Black", 2017, 10200.00, "Automatic" ));
	}

}
