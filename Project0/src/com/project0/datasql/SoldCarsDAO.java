package com.project0.datasql;

import java.sql.SQLException;

import com.project0.beans.Car;

public interface SoldCarsDAO
{	public static ConnFactory cf = ConnFactory.getInstance();
	public void AddNewCarsSQL(Car c) throws SQLException;
	
	public void populateSoldCarsSQL()
		throws SQLException;

}
