/**
 * 
 */
package com.barter.cart.repository;

import org.springframework.data.repository.CrudRepository;

import com.barter.cart.entity.RequestUser;
import com.barter.cart.repository.dao.RequestUserDAO;

/**
 * @author sureshk
 *
 */
public interface RequestUserRepository extends CrudRepository<RequestUser, Long>,RequestUserDAO{

}
