/**
 * 
 */
package com.barter.cart.repository.dao.impl;

import java.sql.Date;

import org.springframework.stereotype.Repository;

import com.barter.cart.entity.Item;
import com.barter.cart.repository.dao.ItemDAO;

/**
 * @author sureshk
 *
 */
@Repository
public class ItemDAOImpl implements ItemDAO{

	@Override
	public Item findItem(String itemName, Boolean isAccepted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item findItem(String itemName, Boolean isAccepted, Date publishedDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
