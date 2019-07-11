package com.project0.dao;

import java.sql.SQLException;

import com.project0.inventory.Car;

public interface CarDao {

	public void AddNewCar(Car c) throws SQLException;
	
	
	public void RemoveCarFromLot(Car c) throws SQLException;
}
