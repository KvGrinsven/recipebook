package com.grublub.model;

import javax.persistence.*;

@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@GeneratedValue
	int id;
	
	@Column(name = "name")
	String name;
	
	public Recipe(String name) {
		this.name = name;
	}
	
	public Recipe() {}
	
	public String getName() {
		return name;
	}

}
