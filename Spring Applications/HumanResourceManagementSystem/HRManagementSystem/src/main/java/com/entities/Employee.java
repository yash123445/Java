package com.entities;

import java.sql.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Employee")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Employee() {
    }

    public Employee(int emp_id, String first_name, String last_name, String mobile_no, String email_id, long salary,
            Date joining_Date, Department dept_id, String address) {
        super();
        this.emp_id = emp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mobile_no = mobile_no;
        this.email_id = email_id;
        this.salary = salary;
        this.joining_Date = joining_Date;
        this.dept_id = dept_id;
        this.address = address;
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
}
