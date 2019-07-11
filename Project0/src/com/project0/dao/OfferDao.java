package com.project0.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OfferDao {
	public static ConnFactory cf = ConnFactory.getInstance();

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		try {
			//OFFER_ID, CUSTOMER_USERNAME, CAR_ID, OFFER_AMOUNT
			String sql= "INSERT INTO OFFERS VALUES(OFFERS_SEQUENCE.NEXTVAL,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1, 1001);
			ps.setFloat(2, 5000);
			ps.setString(3, "T_Taylor01");
			ps.executeUpdate();
		} finally {
			
		}

	}

}
