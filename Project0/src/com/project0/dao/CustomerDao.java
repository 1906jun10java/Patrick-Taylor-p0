package com.project0.dao;

import java.sql.SQLException;

import com.project0.bean.Customer;

public interface CustomerDao {

	public void CreateNewCustomer(Customer c) throws SQLException;
	
}
