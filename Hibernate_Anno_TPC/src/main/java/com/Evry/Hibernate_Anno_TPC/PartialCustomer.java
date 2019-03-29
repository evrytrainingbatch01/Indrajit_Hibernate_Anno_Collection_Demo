package com.Evry.Hibernate_Anno_TPC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="partialCustomer_02")

@AttributeOverrides({  
    @AttributeOverride(name="customerId", column=@Column(name="customerId")),  
    @AttributeOverride(name="customerName", column=@Column(name="customerName"))  
})
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
