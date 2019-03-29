package com.Evry.BankAccount_Anno_TPC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hdfc_Bank")

@AttributeOverrides({  
    @AttributeOverride(name="bankAccNum", column=@Column(name="bankAccNum")),  
    @AttributeOverride(name="accUserId", column=@Column(name="accUserId")), 
    @AttributeOverride(name="balance", column=@Column(name="balance"))
})
public class HDFC_BankAccount extends BankAccount {
	
	@Column(name="schem")
	private String schem;
	
	@Column(name="offers")
	private String offers;

	public String getSchem() {
		return schem;
	}

	public void setSchem(String schem) {
		this.schem = schem;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}
}
