package com.project0.dataimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project0.datasql.BillOfSaleDAO;
import com.project0.finances.Payments;

public class BillOfSaleDAOImpl implements BillOfSaleDAO
{

	@Override
	public void createNewTransSQL(Payments pb) throws SQLException
	{
		Connection conn = cf.getConnection();

		String sql = "{ call INSERTSUPERHERO(?)";

		PreparedStatement call = conn.prepareCall(sql);

		call.setString(1, heroName);

		call.execute();

	}

	@Override
	public void returnBillofSaleSQL() throws SQLException
	{
		// Statement- compiled on SQL side, generally not safe

		// bad for sql injection

		List<SuperHero> superHeroList = new ArrayList<SuperHero>();

		Connection conn = cf.getConnection();

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM SUPERHERO");

		SuperHero s = null;

		while (rs.next())
		{

			s = new SuperHero(rs.getInt(1), rs.getString(2));

			superHeroList.add(s);

		}

		return superHeroList;

	}

}
