package com.grublub.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.grublub.model.Recipe;

public class Repository {
	
	private SessionFactory sf;
	
	//TODO ... why is hibernate ignoring part of my configuration?
	public Repository() {
		sf = new Configuration().configure().buildSessionFactory();
	}
	
	//TODO ... this is only a first working version, and I'd like to have a better understanding of what I'm doing!
	public void save(Object o) {
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(o);
		
		session.getTransaction().commit();
		session.close();

	}
	
	public Recipe getRecipe(int id) {
		Session session = sf.openSession();
		session.beginTransaction();
		
		Recipe rec = session.get(Recipe.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return rec;
	}

}
