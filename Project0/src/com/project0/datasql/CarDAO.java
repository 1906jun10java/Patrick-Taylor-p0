package com.project0.datasql;

import java.sql.SQLException;
import com.project0.beans.Car;

public interface CarDAO
{
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void addNewCar(Car c) throws SQLException;

	public void addToCarLot() throws SQLException;

	public void RemoveCarFromLot(Car c) throws SQLException;
}
