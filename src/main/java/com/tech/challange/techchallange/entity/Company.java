package com.tech.challange.techchallange.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column
	(name="created_on")
	Date createdOn;
	
	@Column(name="last_modified")
	Date LastModified;
	
	@Column(name="name")
	String name;
	
	@Column(name="status")
	String status;
	
	// have to create one to one mapping with user entity
	String adminUser;
	
	

}
