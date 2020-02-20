/**
 * 
 */
package com.barter.cart.repository;

import org.springframework.data.repository.CrudRepository;

import com.barter.cart.entity.History;
import com.barter.cart.repository.dao.HistoryDAO;

/**
 * @author sureshk
 *
 */
public interface HistoryRepository extends CrudRepository<History, Long>, HistoryDAO{
	
}
