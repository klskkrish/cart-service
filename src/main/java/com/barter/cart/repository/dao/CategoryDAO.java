package com.barter.cart.repository.dao;

import java.util.List;

import com.barter.cart.entity.Category;

/**
 * This class support to the call more complex database queries.
 * @author sureshk
 *
 */
public interface CategoryDAO {

	/**
	 * input parameter can be full name or part of the category name
	 * @param categoryName
	 * @return
	 */
	List<Category> finByCategoryName(String categoryName);

}
