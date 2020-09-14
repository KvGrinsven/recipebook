package com.grublub.app;

import com.grublub.model.Recipe;
import com.grublub.persistence.Repository;

public class Main {

	public static void main(String[] args) {
		Repository r = new Repository();
		Recipe rec = new Recipe("Pancakes");
		
		r.save(rec);
	}

}
