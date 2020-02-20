/**
 * 
 */
package com.barter.cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;
import lombok.NonNull;

/**
 * @author sureshk
 *
 */
@Entity
@Table(name = "request_user")
@Data
public class RequestUser {
	@TableGenerator(name = "sequence_request_user", table = "ID_GEN", pkColumnName = "GEN_KEY", pkColumnValue = "ITEM_ID", valueColumnName = "LAST_VALUE", initialValue = 0, allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "sequence_request_user")
	@NonNull
	private Long requestId;
	@NonNull
	private Long refferenceId;
}
