package com.project0.dao;

import java.sql.SQLException;

import com.project0.bean.Employee;

public interface EmployeeDao {

	public void CreateANewEmployee(Employee e) throws SQLException;
	
}
