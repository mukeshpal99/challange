package com.tech.challange.techchallange.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="created_on")
	Date createdOn;
	
	@Column(name="last_modified")
	Date lastModified;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="email_address")
	String email;
	
	@Column(name="status")
	String status;
	
	//have to create one to one mapping with user company entity
	int company_id;
	

}
