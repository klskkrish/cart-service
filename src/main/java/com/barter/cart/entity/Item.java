/**
 * 
 */
package com.barter.cart.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author sureshk
 *
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "item")

public class Item {

	@TableGenerator(name = "sequence_item", table = "ID_GEN", pkColumnName = "GEN_KEY", pkColumnValue = "ITEM_ID", valueColumnName = "LAST_VALUE", initialValue = 0, allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "sequence_item")
	@NonNull
	private Long itemId;
	@NonNull
	private Long ownerId;
	@NonNull
	private Long refferenceId;
	private Long acceptedUserId;
	@NonNull
	private Boolean isAccepted;
	private String itemName;
	private String description;
	private Date publishedDate;
	@NonNull
	private Boolean isActive;

	// Every item should have category
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "categoryId", referencedColumnName = "categoryId", nullable = false)
	@NonNull
	private Category category;

}
