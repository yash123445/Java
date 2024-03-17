package com.yash.demo.practiceapplication.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="Line1")
	String line1;
	@Column(name="Line2")
	String line2;
	
	public Address() {
		
	}
	public Address(String v1,String v2) {
		line1= v1;
		line2 = v2;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
}
