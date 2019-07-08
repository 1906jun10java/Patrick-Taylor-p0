package com.project0.utilities;
import java.util.ArrayList;
import java.util.List;
import com.project0.finances.*;
public class BillofSale
{
static List <Payments> billofsale = new ArrayList<>();

// adds to the bill of sale 
public static void addToBill (Payments p)
{
	billofsale.add(p);
	return;
}
// prints all bills 
public static void viewAllBills()
{
	int iterator = 1;
	for(Payments p :billofsale)
	{
		System.out.println(iterator+")" +p);
		iterator++;
	}
}
}