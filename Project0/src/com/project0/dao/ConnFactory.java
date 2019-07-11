package com.project0.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory
{ // singleton ConnFactory
	private static ConnFactory cf = new ConnFactory();

	// our constructor
	private ConnFactory()
	{
		super();

	}

	// creates a synchronized instance of the ConnFactory if none exsits and returns
	// an instance of itself
	public static synchronized ConnFactory getInstance()
	{
		if (cf == null)
		{
			cf = new ConnFactory(); // creates a new instance of our ConnFactory
		}
		return cf;
	}

	// attempts a connection with our SQL DB
	public Connection getConnection()
	{
		Connection conn = null; // sets up our connection
		Properties prop = new Properties(); // creates a new properties field
		// our try catch blocks to throw an exception just in case connection fails

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com:1521:ORCL","PS_Java_19","Revature");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

}