package com.grublub.persistence;

import javax.persistence.*;

@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@Column(name = "name")
	String name;
	
	public Recipe(String name) {
		this.name = name;
	}

}
