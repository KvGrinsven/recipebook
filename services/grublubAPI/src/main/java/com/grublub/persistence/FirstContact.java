package com.grublub.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TODO Name this properly..
public class FirstContact {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Recipe recipe = new Recipe("Appliepie");
		session.save(recipe);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
