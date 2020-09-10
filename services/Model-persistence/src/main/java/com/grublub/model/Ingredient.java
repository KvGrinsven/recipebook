package com.grublub.model;

import javax.persistence.*;

@Entity(name = "Ingredient")
@Table(name = "ingredient")
public class Ingredient {
	
	@Id
	@Column(name = "name")
	String name;
	
	public Ingredient(String name) {
		this.name = name;
	}

}
