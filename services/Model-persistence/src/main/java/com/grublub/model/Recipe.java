package com.grublub.model;

import javax.persistence.*;

@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "title")
	private String title;
	
	public Recipe(String title) {
		this.title = title;
	}
	
	public Recipe() {}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getId() {
		return this.id;
	}

}
