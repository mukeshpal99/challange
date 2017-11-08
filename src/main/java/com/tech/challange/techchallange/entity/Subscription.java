package com.tech.challange.techchallange.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Subscription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="created_on")
	Date createdOn;
	
	@Column(name="last_modified")
	Date lastModified;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="company_id")
	Company company;
	
	@Column(name="status")
	String status;
	

}
