package com.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Appraisal")
public class Appraisal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;

    @Column(name = "self_rating")
    private String selfRating;
    
    @Column(name="self_remark")
    private String selfRemark;

    @Column(name = "reviewer_rating")
    private String reviewerRating;

    @Column(name = "reviewer_remarks")
    private String reviewerRemarks;

    @Column(name = "is_submitted")
    private boolean isSubmitted;

    @Column(name = "appraisal_date")
    private Date appraisalDate;

    public Appraisal() {}

    

    public Appraisal(Long id, Employee employee, String selfRating, String selfRemark, String reviewerRating,
			String reviewerRemarks, boolean isSubmitted, Date appraisalDate) {
		super();
		this.id = id;
		this.employee = employee;
		this.selfRating = selfRating;
		this.selfRemark = selfRemark;
		this.reviewerRating = reviewerRating;
		this.reviewerRemarks = reviewerRemarks;
		this.isSubmitted = isSubmitted;
		this.appraisalDate = appraisalDate;
	}



	// Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getSelfRating() {
        return selfRating;
    }

    public void setSelfRating(String selfRating) {
        this.selfRating = selfRating;
    }

    public String getReviewerRating() {
        return reviewerRating;
    }

    public void setReviewerRating(String reviewerRating) {
        this.reviewerRating = reviewerRating;
    }

    public String getReviewerRemarks() {
        return reviewerRemarks;
    }

    public void setReviewerRemarks(String reviewerRemarks) {
        this.reviewerRemarks = reviewerRemarks;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }

    public Date getAppraisalDate() {
        return appraisalDate;
    }

    public void setAppraisalDate(Date appraisalDate) {
        this.appraisalDate = appraisalDate;
    }



	public String getSelfRemark() {
		return selfRemark;
	}



	public void setSelfRemark(String selfRemark) {
		this.selfRemark = selfRemark;
	}
    
}

