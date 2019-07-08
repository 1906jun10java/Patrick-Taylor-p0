package com.project0.datasql;

import java.sql.SQLException;
import com.project0.beans.Customer;

public interface CustomerDAO
{
	public static ConnFactory cf = ConnFactory.getInstance();

	public void createNewCustomer(Customer c) throws SQLException;

	public void returnCustomersSQL() throws SQLException;
}
