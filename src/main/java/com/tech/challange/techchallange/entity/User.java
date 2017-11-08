package com.tech.challange.techchallange.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="company_id")
	Company company;
	
	@Column(name="company_admin")
	boolean isCompanyAdmin;
	
	@OneToMany(mappedBy="user")
	List<Event> events;
	

}
