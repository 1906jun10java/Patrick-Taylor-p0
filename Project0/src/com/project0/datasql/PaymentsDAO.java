package com.project0.datasql;

import java.sql.SQLException;

import com.project0.finances.PaymentsLog;

public interface PaymentsDAO
{
	public static ConnFactory cf = ConnFactory.getInstance();

	public void addNewAccount(PaymentsLog p) throws SQLException;

	public void addPaymentsSQL() throws SQLException;

	public void removeFromPayments(PaymentsLog payMyCar) throws SQLException;

}
