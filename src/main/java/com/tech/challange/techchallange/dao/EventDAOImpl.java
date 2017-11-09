package com.tech.challange.techchallange.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tech.challange.techchallange.entity.Event;

public class EventDAOImpl implements EventDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Event getEvent(int eventId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Event event = currentSession.get(Event.class, eventId);
		return event;
	}

}
