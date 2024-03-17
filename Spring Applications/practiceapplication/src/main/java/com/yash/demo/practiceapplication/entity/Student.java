package com.yash.demo.practiceapplication.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="Student_ID")
	int stdid;
	@Column(name="Name")
	String stdName;
	@Embedded
	Address postal;
	@Column(name="Phone_No")
	long phoneNo;
	
	public Student() {
		
	}
	
	public Student(int v1, String v2, Address v3, long v4) {
		stdid=v1;
		stdName=v2;
		postal = v3;
		phoneNo= v4;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Address getPostal() {
		return postal;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
