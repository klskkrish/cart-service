package com.barter.cart.repository.dao;

import java.sql.Date;

import com.barter.cart.entity.Item;

/**
 * @author sureshk
 *
 */
public interface ItemDAO {

	Item findItem(String itemName, Boolean isAccepted);

	Item findItem(String itemName, Boolean isAccepted, Date publishedDate);
	
	

}
