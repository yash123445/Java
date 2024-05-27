package com.bankapp.bankApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int branch_id;
    
    @Column(name="branch_name", unique = true)
    String branch_name;
    
    @Column(name="address")
    String address;
    
    @Column(name="pincode")
    int pincode;

    public Branch() {
        
    }

    public Branch(int v1, String v2, String v3, int v4) {
        branch_id = v1;
        branch_name = v2;
        address = v3;
        pincode = v4;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", address=" + address + ", pincode=" + pincode
                + ", getBranch_id()=" + getBranch_id() + ", getBranch_name()=" + getBranch_name() + ", getAddress()=" + getAddress()
                + ", getPincode()=" + getPincode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
}
