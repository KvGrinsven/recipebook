package com.grublub.app;

import com.grublub.model.Ingredient;
import com.grublub.model.Measure;
import com.grublub.model.Recipe;
import com.grublub.persistence.Repository;

public class Main {

	public static void main(String[] args) {
		Repository rep = new Repository();
		
		Ingredient i = new Ingredient("Tomato", Measure.GRAM);
		Recipe r = new Recipe("Tomatensoep");
		
		rep.save(i);
		rep.save(r);
		
	}

}
