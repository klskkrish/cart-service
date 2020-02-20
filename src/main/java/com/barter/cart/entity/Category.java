/**
 * 
 */
package com.barter.cart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Data;
import lombok.NonNull;

/**
 * @author sureshk
 *
 */
@Entity
@Data
@Table(name="category")
public class Category {
	
	@Id
	private Long categoryId;
	
	@UniqueElements
	@NonNull
	private String categoryName;
	

}
