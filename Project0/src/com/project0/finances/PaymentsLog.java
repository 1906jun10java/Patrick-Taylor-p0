package com.project0.finances;

import java.util.HashMap;
import java.util.Scanner;
import com.project0.beans.*;
import com.project0.finances.*;
import com.project0i.utilities.ScannerUse;

public class PaymentsLog {

	public static HashMap<String, Payments> paymentAccounts = new HashMap<>();

	public static void createNewPaymentAccount(OfferLog oc) {
		double monthlyPayments;
		monthlyPayments = oc.getOfferAmount()/72;
		
		Payments p = new Payments(oc.getCarId() , oc.getCustomerUserName(),
	}
}