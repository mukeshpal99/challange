package com.tech.challange.techchallange.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
	
	@OneToMany(mappedBy="company",
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	@JoinColumn(name="company_id")
	List<User> users;
	
	
	@OneToMany(mappedBy="company",
			fetch=FetchType.LAZY,
			cascade=CascadeType.ALL)
	List<Subscription> subscriptions;
	
	@OneToMany(mappedBy="company")
	List<Event> events;
	
	

}
