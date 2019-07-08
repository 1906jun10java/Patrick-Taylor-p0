package com.project0.finances;

import java.util.HashMap;

import com.project0.beans.*;
import com.project0.finances.Payments;

public class PaymentsLog
{
	// like in our other class this will create a HashMap where all our values will
	// be stored
	public static HashMap<String, Payments> paymentAccounts = new HashMap<>();

	// this will create a new account for the employee side
	public static void createNewPaymentAccount(Offers oc)
	{
		double monthlyPayments;
		monthlyPayments = oc.getOfferAmount() / 72;

		Payments p = new Payments(oc.getCarId(), oc.getCustomerUserName(), monthlyPayments, oc.getOfferAmount());

		paymentAccounts.put(p.getCusUsername(), p);
		// sqlutil will be placed here to add a new account
	}

	// this will add to the customers account
	public static void createNewPaymentAccount(Payments p)
	{
		new Payments(p.getCarId(), p.getCusUsername(), p.getMonthlyPayments(), p.getPayOffbalance());
		paymentAccounts.put(p.getCusUsername(), p);
		return;
	}

	// will return account if one has already been set up. if not , will return null
	public static Payments returnAccounts(String userName)
	{

		if (!paymentAccounts.containsKey(userName))
		{
			return null;
		}
		Payments ps = paymentAccounts.get(userName);
		return ps;
	}

	public static boolean accountHere(String key)
	{
		if (!paymentAccounts.containsKey(key))
		{
			return false;
		}
		return true;
	}
}