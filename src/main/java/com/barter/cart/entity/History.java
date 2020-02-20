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
import lombok.NonNull;

/**
 * @author sureshk
 *
 */
@Entity
@Data
@Table(name = "history")
public class History {
	@TableGenerator(name = "sequence_history", pkColumnName = "GEN_KEY", pkColumnValue = "HISTORY_ID", table = "ID_GEN", valueColumnName = "LAST_VALUE", initialValue = 0, allocationSize = 1)
	@Id
	@GeneratedValue(generator = "sequence_history", strategy = GenerationType.TABLE)
	@NonNull
	private Long historyId;
	@NonNull
	private Long ownerId;
	private Date date;
	private String description;
	private String name;
	private String publishedDate;

	// maintain item history
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "itemId", referencedColumnName = "itemId", nullable = true)
	@NonNull
	private Item item;

}
