package com.AarrayList;

import java.util.Objects;

public class Student{

	@Override
	public int hashCode() {
		return Objects.hash(name, percentage, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false; 
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name)
				&& Float.floatToIntBits(percentage) == Float.floatToIntBits(other.percentage) && rollNo == other.rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", percentage=" + percentage + "]";
	}
	String name;
	int rollNo;
	float percentage;
	public Student() {
		
	}
	public Student(String name, int rollNo, float percentage) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getRollNo() {
//		return rollNo;
//	}
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//	public float getPercentage() {
//		return percentage;
//	}
//	public void setPercentage(float percentage) {
//		this.percentage = percentage;
//	}
		
}
