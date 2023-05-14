package com.thinkhack.geopolis.msbank.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.thinkhack.geopolis.msbank.enums.TransactionType;

@Entity
@Table(name="transactions")
public class TransactionModel implements Serializable {

	private static final long serialVersionUID = -1223824466507233791L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type="org.hibernate.type.UUIDCharType")
	private UUID id;
	
	private UUID citzen;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="wallet_id",nullable = false,referencedColumnName = "id")
	private WalletModel wallet;
	
	private String description;
	
	private BigDecimal value;
	
	private TransactionType type;
	
	private LocalDateTime date;
	
	private boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getCitzen() {
		return citzen;
	}

	public void setCitzen(UUID citzen) {
		this.citzen = citzen;
	}

	public WalletModel getWallet() {
		return wallet;
	}

	public void setWallet(WalletModel wallet) {
		this.wallet = wallet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}