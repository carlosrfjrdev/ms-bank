package com.thinkhack.geopolis.msbank.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.thinkhack.geopolis.msbank.enums.WalletType;

@Entity
@Table(name="wallets")
public class WalletModel implements Serializable {

	private static final long serialVersionUID = 4267504233512443887L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type="org.hibernate.type.UUIDCharType")
	private UUID id;

	@Type(type="org.hibernate.type.UUIDCharType")
	private UUID ownerId;
	
	
	private WalletType walletType;
	
	@OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL)
	private List<TransactionModel> userTransactions;
	
	//Datas
	private LocalDateTime created;
	
	private boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(UUID ownerId) {
		this.ownerId = ownerId;
	}

	public WalletType getWalletType() {
		return walletType;
	}

	public void setWalletType(WalletType walletType) {
		this.walletType = walletType;
	}

	public List<TransactionModel> getUserTransactions() {
		return userTransactions;
	}

	public void setUserTransactions(List<TransactionModel> userTransactions) {
		this.userTransactions = userTransactions;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	


}
