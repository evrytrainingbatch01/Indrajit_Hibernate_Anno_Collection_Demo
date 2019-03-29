package com.Evry.Hibernate_Anno_TPC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="regularCustomer_02")

@AttributeOverrides({  
    @AttributeOverride(name="customerId", column=@Column(name="customerId")),  
    @AttributeOverride(name="customerName", column=@Column(name="customerName"))  
})  
public class RegularCustomer extends Customer {
	
	@Column(name="price")
	private float price;
	
	@Column(name="amount")
	private int amount;
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
