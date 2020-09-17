package com.grublub.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class RecipeTest {

	@Test
	void givenARecipeWith1Serving_whenOfServings2_servingsIs2() {
		Ingredient i = new Ingredient("Carrot", Measure.UNIT);
		HashMap<Ingredient, Double> ings = new HashMap<>();
		ings.put(i, 1D);
		Recipe r = new Recipe("Test", ings, "Bla", 1);
		
		r.ofServings(2);
		
		assertEquals(2, r.getServings());
	}
	
	@Test
	void givenARecipeWith1ServingOf1Carrot_whenOfServings2_servingsIs2() {
		Ingredient i = new Ingredient("Carrot", Measure.UNIT);
		HashMap<Ingredient, Double> ings = new HashMap<>();
		ings.put(i, 1D);
		Recipe r = new Recipe("Test", ings, "Bla", 1);
		
		r.ofServings(2);
		double carrots = r.getIngredients().get(i);
		
		assertEquals(2, carrots);
	}

}
