package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appraisal")
public class Appraisal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int apr_id;
	
}
