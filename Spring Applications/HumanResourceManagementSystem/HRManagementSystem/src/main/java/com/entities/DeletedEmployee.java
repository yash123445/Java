package com.entities;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "Deleted_Employee")
public class DeletedEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_id")
    private int emp_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "mobile_no")
    private String mobile_no;

    @Column(name = "email_id")
    private String email_id;

    @Column(name = "salary")
    private long salary;

    @Column(name = "joining_date")
    private Date joining_Date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department dept_id;

    @Column(name = "address")
    private String address;

    @Column(name = "deletion_date")
    private Date deletion_date;

    // Constructors, getters, and setters
    public DeletedEmployee() {}

    // Constructor without deletion_date (useful for initial entry)
    public DeletedEmployee(Employee employee) {
        this.emp_id = employee.getEmp_id();
        this.first_name = employee.getFirst_name();
        this.last_name = employee.getLast_name();
        this.mobile_no = employee.getMobile_no();
        this.email_id = employee.getEmail_id();
        this.salary = employee.getSalary();
        this.joining_Date = employee.getJoining_Date();
        this.dept_id = employee.getDept_id();
        this.address = employee.getAddress();
        this.deletion_date = new Date(System.currentTimeMillis()); // Set current date as deletion date
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Date getJoining_Date() {
		return joining_Date;
	}

	public void setJoining_Date(Date joining_Date) {
		this.joining_Date = joining_Date;
	}

	public Department getDept_id() {
		return dept_id;
	}

	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDeletion_date() {
		return deletion_date;
	}

	public void setDeletion_date(Date deletion_date) {
		this.deletion_date = deletion_date;
	}

    
    
}
