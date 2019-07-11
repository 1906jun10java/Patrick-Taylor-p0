package com.project0.dao;

import java.sql.*;
//import com.project0.bean.Customer;

public class CustomerDaoImpl{
//	static final String driver ="oracle.jdbc.driver.OracleDriver";
//	static final String url="jdbc:oracle:thin:@ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com";
//	static final String usr="PS_Java_19";
//	static final String password="Revature";
	public static ConnFactory cf = ConnFactory.getInstance();

	public static void main(String[] args) throws SQLException {
		Connection conn= cf.getConnection();
//		PreparedStatement ps = null;
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");

//			conn = DriverManager.getConnection(url, usr, password);
//			(license, first_name, last_name, username, password, my_cars, offer_id, amount_left, offer_amount) 
			String sql= "INSERT INTO CUSTOMERS VALUES(CUSTOMERS_SEQUENCE.NEXTVAL,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, 123456789 );
			ps.setString(2, "Taylor" );
			ps.setString(3, "Ponce");
			ps.setString(4, "T_Talyor01");
			ps.setString(5, "Password");
			ps.setInt(6, 1001);
			ps.setInt(7, 100);
			ps.setFloat(8, 40000);
			ps.setFloat(9, 5000);
			ps.executeUpdate();
			
			/*
			 * } catch (SQLException e) { e.printStackTrace(); } catch (Exception e) {
			 * e.printStackTrace();
			 */
		}finally {
		}
	}
}

