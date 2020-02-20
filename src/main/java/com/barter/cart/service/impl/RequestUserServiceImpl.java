/**
 * 
 */
package com.barter.cart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barter.cart.repository.RequestUserRepository;
import com.barter.cart.service.RequestUserService;

/**
 * @author sureshk
 *
 */
@Repository
public class RequestUserServiceImpl implements RequestUserService {
	
	/**
	 * 
	 */
	@Autowired
	RequestUserRepository requestUserRepository;
	
}
