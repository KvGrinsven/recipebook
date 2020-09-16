package com.grublub.model;

import java.util.List;

import com.grublub.persistence.Repository;

public class RecipeBook {
	
	Repository r = new Repository();
	
	public void addRecipe(Recipe recipe) {
		r.save(recipe);
	}
	
	public Recipe getRecipe(int id) {
		return r.getRecipe(id);
	}
	
	public List<Recipe> getAllRecipes() {
		return r.getAllRecipes();
	}
	
	public String toString() {
		return "I'm a recipebook!";
	}

}
