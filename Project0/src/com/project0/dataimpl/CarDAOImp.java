package com.project0.dataimpl;

import java.sql.SQLException;

import com.project0.beans.Car;
import com.project0.datasql.CarDAO;

public class CarDAOImp implements CarDAO
{

	@Override
	public void addNewCar(Car c) throws SQLException
	{
		// TODO Auto-generated method stub
		"{ call INSERTCAR(?, ?, ?, ?, ?, ?";
		
	}

	@Override
	public void addToCarLot() throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveCarFromLot(Car c) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

}
