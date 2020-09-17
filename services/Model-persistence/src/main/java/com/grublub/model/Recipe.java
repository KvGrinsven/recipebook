package com.grublub.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "recipe_ingredient")
	private Map<Ingredient, Double> ingredients;
	
	@Column(name = "directions")
	private String directions;
	
	@Column(name = "servings")
	private int servings;
	
	public Recipe() {}
	
	public Recipe(String title, Map<Ingredient, Double> ingredients, String directions, int servings) {
		this.title = title;
		this.ingredients = ingredients;
		this.directions = directions;
		this.servings = servings;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Map<Ingredient, Double> getIngredients() {
		return this.ingredients;
	}
	
	public String getDirections() {
		return this.directions;
	}
	
	public int getServings() {
		return this.servings;
	}
	
	@Override
	public String toString() {
		return title;
	}

	public void ofServings(int desiredServings) {
		
		double ratio = desiredServings / (double) this.servings;
		
		for(Ingredient i : ingredients.keySet()) {
			double amount = ingredients.get(i);
			amount *= ratio;
			ingredients.put(i, amount);
		}
		
		this.servings = desiredServings;
	}
}
