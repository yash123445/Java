package com.bankapp.bankApp.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long actNo;

    @Column(name = "holder_name")
    String holderName;

    @Column(name = "age")
    int age;

    @Column(name = "gender")
    String gender;
    
    @Column(name="email")
    String email;

    @Column(name = "mobile_No")
    String mobileNo;

    @Column(name = "aadhar_No")
    String aadharNo;

    @Column(name = "address")
    String address;

    @ManyToOne
    @JoinColumn(name ="branch_name", referencedColumnName ="branch_name")
    Branch branch;
    
    @Column(name="balance")
    BigDecimal balance;

    public Account() {

    }

    

    public Account(int actNo, String holderName, int age, String gender, String email, String mobileNo, String aadharNo,
			String address, Branch branch, BigDecimal balance) {
		super();
		this.actNo = actNo;
		this.holderName = holderName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.mobileNo = mobileNo;
		this.aadharNo = aadharNo;
		this.address = address;
		this.branch = branch;
		this.balance = balance;
	}



	public long getActNo() {
        return actNo;
    }

    public void setActNo(int actNo) {
        this.actNo = actNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    
    public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Account [actNo=" + actNo + ", holderName=" + holderName + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + ", mobileNo=" + mobileNo + ", aadharNo=" + aadharNo + ", address=" + address
				+ ", branch=" + branch + ", balance=" + balance + ", getActNo()=" + getActNo() + ", getHolderName()="
				+ getHolderName() + ", getAge()=" + getAge() + ", getMobileNo()=" + getMobileNo() + ", getAadharNo()="
				+ getAadharNo() + ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + ", getBranch()="
				+ getBranch() + ", getBalance()=" + getBalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	

	
}