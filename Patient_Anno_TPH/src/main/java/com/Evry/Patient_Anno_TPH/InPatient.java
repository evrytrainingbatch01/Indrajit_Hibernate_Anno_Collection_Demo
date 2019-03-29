package com.Evry.Patient_Anno_TPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("inPatient")
public class InPatient extends Patient {
	
	@Column(name="cabinNo")
	private String cabinNo;
	
	@Column(name="condition")
	private String condition;

	public String getCabinNo() {
		return cabinNo;
	}

	public void setCabinNo(String cabinNo) {
		this.cabinNo = cabinNo;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
