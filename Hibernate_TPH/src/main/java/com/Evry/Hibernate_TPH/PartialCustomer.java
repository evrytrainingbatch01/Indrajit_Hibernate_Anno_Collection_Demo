package com.Evry.Hibernate_TPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("partialCustomer")
public class PartialCustomer extends Customer {
	
	@Column(name="partialPrice")
	private float partialPrice;
	
	@Column(name="partialAmount")
	private int partialAmount;

	public float getPartialPrice() {
		return partialPrice;
	}

	public void setPartialPrice(float partialPrice) {
		this.partialPrice = partialPrice;
	}

	public int getPartialAmount() {
		return partialAmount;
	}

	public void setPartialAmount(int partialAmount) {
		this.partialAmount = partialAmount;
	}
}
