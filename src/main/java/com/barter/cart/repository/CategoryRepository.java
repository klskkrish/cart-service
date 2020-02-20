package com.barter.cart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.barter.cart.repository.dao.CategoryDAO;
import com.barter.cart.entity.Category;


/**
 * CategoryRepository support to access database Category table
 * @author sureshk
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long>, CategoryDAO{
	
	/**
	 * Get list of categories using using full name
	 * can't get details using part of category name 
	 * (Ex:- electronic item - should be search using  electronic item. no response for 'electronic', 'ele' etc.)
	 * @param categoryName
	 * @return
	 */
	List<Category> finByCategoryName(String categoryName);
	
}
