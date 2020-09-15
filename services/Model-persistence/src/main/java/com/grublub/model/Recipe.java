package com.grublub.model;

import javax.persistence.*;

@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "recipe_name")
	private String name;
	
	public Recipe(String name) {
		this.name = name;
	}
	
	public Recipe() {}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}

}
