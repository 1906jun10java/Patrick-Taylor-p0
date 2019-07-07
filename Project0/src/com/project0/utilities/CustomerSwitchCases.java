package com.project0.utilities;
import com.project0.finances.*;
import java.util.Scanner;

public class CustomerSwitchCases {

	static ScannerUse su = ScannerUse.getInstance();
	static Scanner cs = su.returnScanner();

	public static void CustomerMenu() {
		boolean Exit = false;
		while (Exit != true) {
			int custop = MenuFrameWork.customerSelection();
			switch (custop) {

			case 1:
				System.out.println("select terms for loan service , (ex. 72 months ) ");
				while (!cs.hasNextInt()) {
					System.out.println("enter the months using integers ");
					cs.next();
					break;
				}
			case 2:
				System.out.println("View My Cars");
				
				break;
			case 3:
				System.out.println("Counter offers from dealer");
				break;
			case 4: // logout
				Exit = true;
				break;
			}
		}
	}
}
