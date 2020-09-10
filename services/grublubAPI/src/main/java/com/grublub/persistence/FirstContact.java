package com.grublub.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.grublub.model.Ingredient;
import com.grublub.model.Recipe;

//TODO Name this properly..
public class FirstContact {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Recipe recipe = new Recipe("Pizza");
		Ingredient ing = new Ingredient("Tomato");
		session.save(recipe);
		session.save(ing);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
