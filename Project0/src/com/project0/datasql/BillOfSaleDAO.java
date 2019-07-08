package com.project0.datasql;

import java.sql.SQLException;

import com.project0.finances.Payments;

public interface BillOfSaleDAO
{
	public static ConnFactory cf = ConnFactory.getInstance();

	public void createNewTransSQL(Payments pb) throws SQLException;

	public void returnBillofSaleSQL() throws SQLException;
}
