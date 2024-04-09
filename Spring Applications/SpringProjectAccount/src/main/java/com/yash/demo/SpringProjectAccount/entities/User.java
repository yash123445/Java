package com.yash.demo.SpringProjectAccount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Username is required")
    @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters")
    @Column(nullable = false, unique = true)
    private String username;

    @NotEmpty(message = "Password is required")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
    @Column(nullable = false)
    private String password;

    @NotEmpty(message = "Date of Birth is required")
    @Column(nullable = false)
    private String dateOfBirth;

    @NotEmpty(message = "Email ID is required")
    @Email(message = "Invalid email format")
    @Column(nullable = false, unique = true)
    private String emailId;

    @NotEmpty(message = "Mobile Number is required")
    @Pattern(regexp = "[0-9]{10}", message = "Mobile Number must be 10 digits")
    @Column(nullable = false)
    private String mobileNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", dateOfBirth=" + dateOfBirth
				+ ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", getId()=" + getId() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getEmailId()=" + getEmailId() + ", getMobileNo()=" + getMobileNo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

    

}
