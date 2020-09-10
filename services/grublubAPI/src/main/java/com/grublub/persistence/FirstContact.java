package com.grublub.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.grublub.model.Recipe;

//TODO Name this properly..
public class FirstContact {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Recipe recipe = new Recipe("Pizza");
//		Recipe r2 = new Recipe("Taart");
		session.save(recipe);
//		session.save(r2);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
