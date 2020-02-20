/**
 * 
 */
package com.barter.cart.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

/** 
 * This is many to many mapping table(Item ,RequestUser)
 * @author sureshk
 *
 */
@Embeddable
@Table(name = "request_user_detail")
@Data
public class RequestUserDetail {

	private Boolean isApproved;
	@NonNull
	private Date date;
	private String reason;
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "requestUserId", referencedColumnName = "requestId", nullable = false)
	@NonNull
	private RequestUser requestUser;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "itemId", referencedColumnName = "itemId", nullable = false)
	@NonNull
	private Item item;
}
