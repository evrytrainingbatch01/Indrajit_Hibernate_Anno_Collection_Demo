package com.Evry.BankAccount_Anno_TPC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sbi_Bank")

@AttributeOverrides({  
    @AttributeOverride(name="bankAccNum", column=@Column(name="bankAccNum")),  
    @AttributeOverride(name="accUserId", column=@Column(name="accUserId")), 
    @AttributeOverride(name="balance", column=@Column(name="balance"))
})
public class SBI_BankAccount extends BankAccount{
	
	@Column(name="location")
	private String location;
	
	@Column(name="facility")
	private String facility;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}
}
