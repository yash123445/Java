package com.yash.demo.SpringProjectAccount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Loan")
public class Loan {
	@Id
	@Column(name="loan_id")
	int loan_id;
	
	@Column(name="loan_type")
	String loan_type;
	
	@Column(name="amount")
	long amount;
	
	public Loan() {
		
	}
	public Loan(int v1,String v2, long v3) {
		loan_id=v1;
		loan_type=v2;
		amount = v3;
	}
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Loan [loan_id=" + loan_id + ", loan_type=" + loan_type + ", amount=" + amount + ", getLoan_id()="
				+ getLoan_id() + ", getLoan_type()=" + getLoan_type() + ", getAmount()=" + getAmount() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
