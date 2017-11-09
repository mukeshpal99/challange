package com.tech.challange.techchallange.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column
	(name="created_on")
	Date createdOn;
	
	@Column(name="last_modified")
	Date lastModified;
	
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
