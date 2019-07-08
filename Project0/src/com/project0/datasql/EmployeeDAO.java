package com.project0.datasql;

import java.sql.SQLException;
import com.project0.beans.Employee;

public interface EmployeeDAO
{	public static ConnFactory cf = ConnFactory.getInstance();

	public void CreateANewEmployee(Employee c) throws SQLException;

	public void returnEmployeesSQL() throws SQLException;
}
