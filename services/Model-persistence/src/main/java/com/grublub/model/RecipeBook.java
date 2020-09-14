package com.grublub.model;

import com.grublub.persistence.Repository;

//This is intended as a facade.

public class RecipeBook {
	
	Repository r = new Repository();
	
	public Recipe getRecipe(int id) {
		return r.getRecipe(id);
	}
	
	public String toString() {
		return "I'm a recipebook!";
	}

}
