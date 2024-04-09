package com.yash.demo.SpringProjectAccount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "new_registration")
	public class Registration {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @NotEmpty(message = "Username is required")
	    @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters")
	    @Column(name = "username")
	    private String username;

	    @NotEmpty(message = "Password is required")
	    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
	    @Column(name = "password")
	    private String password;

	    @NotEmpty(message = "Retype Password is required")
	    @Column(name = "retype_password")
	    private String retypePassword;

	    @NotEmpty(message = "Date of Birth is required")
	    @Column(name = "date_of_birth")
	    private String dateOfBirth;

	    @NotEmpty(message = "Email ID is required")
	    @Email(message = "Invalid email format")
	    @Column(name = "email_id", unique = true)
	    private String emailId;

	    @NotEmpty(message = "Mobile Number is required")
	    @Pattern(regexp = "[0-9]{10}", message = "Mobile Number must be 10 digits")
	    @Column(name = "mobile_no")
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

		public String getRetypePassword() {
			return retypePassword;
		}

		public void setRetypePassword(String retypePassword) {
			this.retypePassword = retypePassword;
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
			return "Registration [id=" + id + ", username=" + username + ", password=" + password + ", retypePassword="
					+ retypePassword + ", dateOfBirth=" + dateOfBirth + ", emailId=" + emailId + ", mobileNo="
					+ mobileNo + ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getPassword()="
					+ getPassword() + ", getRetypePassword()=" + getRetypePassword() + ", getDateOfBirth()="
					+ getDateOfBirth() + ", getEmailId()=" + getEmailId() + ", getMobileNo()=" + getMobileNo()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		public Registration(Long id, String username, String password, String retypePassword, String dateOfBirth,
				String emailId, String mobileNo) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.retypePassword = retypePassword;
			this.dateOfBirth = dateOfBirth;
			this.emailId = emailId;
			this.mobileNo = mobileNo;
		}

	public Registration() {
		
	}
	
	
}
