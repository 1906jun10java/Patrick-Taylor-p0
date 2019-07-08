package com.project0.datasql;

import java.sql.SQLException;
import com.project0.beans.Offers;;

public interface OffersDAO
{	public static ConnFactory cf = ConnFactory.getInstance();

	public void createNewOffers(Offers o) throws SQLException;

	public void returnOffers() throws SQLException;

	public void deleteOffers(Offers o) throws SQLException;

}
