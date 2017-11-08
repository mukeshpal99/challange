package com.tech.challange.techchallange.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="type")
	String type;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	Company company;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	User user;
	
	@Column(name="consumed")
	boolean isConsumed;

}
