package com.project0.dao;

import java.sql.*;

//import com.project0.inventory.Car;

public class CarDaoImpl {
//	static final String Driver = "oracle.jdbc.driver.OracleDriver";
//	static final String Url= "jdbc:oracle:thin:@ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com";
//	static final String Usr= "PS_Java_19";
//	static final String Password= "Revature";
	public static ConnFactory cf = ConnFactory.getInstance();

	public static void main(String[] args) throws SQLException {
		Connection conn = cf.getConnection();
//		PreparedStatement ps = null;
		try {
			/* Class.forName("oracle.jdbc.driver.OracleDriver"); */

			/* conn = DriverManager.getConnection(Url, Usr, Password); */
//			MAKE, MODEL, COLOR, YEAR, MILAGE, TRANSMISSION, CAR_ID
			String sql = "INSERT INTO CARLOT VALUES(CARLOT_SEQUENCE.NEXTVAL,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			// user will insert the information of that particular car...
			ps.setString(1, "Mercedes");
			ps.setString(2, "AMG E53");
			ps.setString(3, "Black");
			ps.setFloat(4, 2019);
			ps.setFloat(5, 3789);
			ps.setString(6, "Automatic");
			//ps.setFloat(7, 80325);
			ps.executeUpdate();

		} finally {
		}
	}

	/*
	 * Class.forName("oracle.jdbc.driver.OracleDriver");
	 * 
	 * conn = DriverManager.getConnection(Url, Usr, Password);
	 * 
	 * String sql= "DELETE FROM CARLOT WHERE CAR_ID VALUE(?)"; ps=
	 * conn.prepareStatement(sql); ps.setFloat(1, 5); ps.execute();
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } catch (Exception e) {
	 * e.printStackTrace(); } finally {
	 * 
	 * } }
	 */

}
