package com.grublub.app;

import com.grublub.model.Recipe;
import com.grublub.persistence.Repository;

public class Main {

	public static void main(String[] args) {
		Repository b = new Repository();
		
		Recipe yum = new Recipe("pineapple");
		
		b.save(yum);
	}

}
