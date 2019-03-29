package com.Evry.BankAccount_Anno_TPC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "bankAccount")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bankAccNum")
	private int bankAccNum;
	
	@Column(name="accUserId")
	private String accUserId;
	
	@Column(name="balance")
	private double balance;

	public int getBankAccNum() {
		return bankAccNum;
	}

	public void setBankAccNum(int bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

	public String getAccUserId() {
		return accUserId;
	}

	public void setAccUserId(String accUserId) {
		this.accUserId = accUserId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
