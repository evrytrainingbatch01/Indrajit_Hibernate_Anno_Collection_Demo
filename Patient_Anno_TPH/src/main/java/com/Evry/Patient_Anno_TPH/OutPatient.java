package com.Evry.Patient_Anno_TPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("outPatient")
public class OutPatient extends Patient {
	
	@Column(name="department")
	private String department;
	
	@Column(name="test")
	private String test;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}