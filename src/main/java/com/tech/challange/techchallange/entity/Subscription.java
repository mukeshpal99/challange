package com.tech.challange.techchallange.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Subscription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="created_on")
	Date createdOn;
	
	@Column(name="last_modified")
	Date lastModified;
	
	//have to create many to one mapping with user company entity
	int company_id;
	
	@Column(name="status")
	String status;
	

}
