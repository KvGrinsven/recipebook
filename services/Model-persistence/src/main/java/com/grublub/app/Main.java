package com.grublub.app;

import com.grublub.persistence.Repository;

public class Main {

	public static void main(String[] args) {
		Repository b = new Repository();
		
		System.out.println(b.getRecipe(1).getName());
	}

}
