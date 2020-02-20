package com.barter.cart.repository;

import org.springframework.data.repository.CrudRepository;

import com.barter.cart.entity.Item;
import com.barter.cart.repository.dao.ItemDAO;

public interface ItemRepository extends CrudRepository<Item, Long>,ItemDAO{
}
