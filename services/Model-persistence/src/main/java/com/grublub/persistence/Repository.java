package com.grublub.persistence;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.grublub.model.Recipe;

public class Repository {
	
	private SessionFactory sf;
	
	public Repository() {
		sf = new Configuration().configure().buildSessionFactory();
	}
	
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
	
	public List<Recipe> getAllRecipes() {
		Session session = sf.openSession();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();

		CriteriaQuery<Recipe> cqs = cb.createQuery(Recipe.class);
		Root<Recipe> root = cqs.from(Recipe.class);
		cqs.select(root);

		TypedQuery<Recipe> recipeQuery = session.createQuery(cqs);
		List<Recipe> recipes = recipeQuery.getResultList();


	    return recipes;
	}

}
