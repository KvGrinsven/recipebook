package com.grublub.app;

import java.util.HashMap;
import java.util.Map;

import com.grublub.model.Ingredient;
import com.grublub.model.Measure;
import com.grublub.model.Recipe;
import com.grublub.persistence.Repository;

public class Main {

	public static void main(String[] args) {
		Repository rep = new Repository();
		
		Ingredient i = new Ingredient("Tomato", Measure.GRAM);
		
		Map<Ingredient, Double> ingredients = new HashMap<Ingredient, Double>();
		ingredients.put(i, 500D);
		Recipe r = new Recipe("Tomatensoep", ingredients);
		
		rep.save(i);
		rep.save(r);
		
		System.out.println(rep.getRecipe(2).getIngredients());
	}

}
