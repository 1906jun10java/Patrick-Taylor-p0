package com.project0.dao;

import java.sql.*;
//import com.project0.bean.Employee;

public class EmployeeDaoImpl{
//	static final String Driver = "oracle.jdbc.driver.OracleDriver";
//	static final String Url= "jdbc:oracle:thin:@ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com";
//	static final String Usr= "PS_Java_19";
//	static final String Password= "Revature";
	public static ConnFactory cf = ConnFactory.getInstance();

	public static void main(String[] args) throws SQLException {
		Connection conn = cf.getConnection();
//		PreparedStatement ps = null;
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");

//			conn = DriverManager.getConnection(Url, Usr, Password);
//			FIRST_NAME, LAST_NAME, USERNAME, PASSWORD, OFFERS, PAYMENTS
			String sql= "INSERT INTO EMPLOYEES VALUES(EMPLOYEES_SEQUENCE.NEXTVAL,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setString(1, "Patrick");
			ps.setString(2, "Spence");
			ps.setString(3, "Da_Archit3ct");
			ps.setString(4, "P@ssword");
			ps.setInt(5, 100);
			ps.setFloat(6, 6000);
			ps.executeUpdate();

//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
		}
	}
}


