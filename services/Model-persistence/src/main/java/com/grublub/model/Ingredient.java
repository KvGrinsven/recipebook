package com.grublub.model;

import javax.persistence.*;

@Entity(name = "Ingredient")
@Table(name = "ingredient")
public class Ingredient {
	
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "description")
	private String description;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "measure")
	private Measure measure;
	
	public Ingredient() { }
	
	public Ingredient(String description, Measure measure) {
		this.description = description;
		this.measure = measure;
	}
	
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Measure getMeasure() {
		return measure;
	}

}
