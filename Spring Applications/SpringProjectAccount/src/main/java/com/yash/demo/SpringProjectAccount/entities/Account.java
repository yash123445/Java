package com.yash.demo.SpringProjectAccount.entities;

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
    int actNo;

    @Column(name = "holder_name")
    String holderName;

    @Column(name = "age")
    int age;

    @Column(name = "gender")
    String gender;

    @Column(name = "mobile_No")
    String mobileNo;

    @Column(name = "aadhar_No")
    String aadharNo;

    @Column(name = "address")
    String address;

    @ManyToOne
    @JoinColumn(name ="branch_name", referencedColumnName ="branch_name")
    Branch branch;

    public Account() {

    }

    public Account(int v1, String v2, int v3, String v6, String v4, String v5, String v7, Branch v8) {
        actNo = v1;
        holderName = v2;
        age = v3;
        mobileNo = v4;
        aadharNo = v5;
        gender = v6;
        address = v7;
        branch = v8;
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

    @Override
    public String toString() {
        return "Account [actNo=" + actNo + ", holderName=" + holderName + ", age=" + age + ", gender=" + gender
                + ", mobileNo=" + mobileNo + ", aadharNo=" + aadharNo + ", address=" + address + ", branch=" + branch
                + ", getActNo()=" + getActNo() + ", getHolderName()=" + getHolderName() + ", getAge()=" + getAge()
                + ", getMobileNo()=" + getMobileNo() + ", getAadharNo()=" + getAadharNo() + ", getGender()="
                + getGender() + ", getAddress()=" + getAddress() + ", getBranch()=" + getBranch() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}