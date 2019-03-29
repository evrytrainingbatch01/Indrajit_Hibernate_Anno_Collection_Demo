package com.Evry.Hibernate_TPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regCustomer")
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
