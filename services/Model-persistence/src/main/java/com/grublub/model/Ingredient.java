package com.grublub.model;

import javax.persistence.*;

@Entity(name = "Ingredient")
@Table(name = "ingredient")
@Embeddable
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Ingredient ingredient = (Ingredient) o;
		
		if(!description.equals(ingredient.getDescription())) return false;
		if(!(measure == ingredient.getMeasure())) return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = description.hashCode();
		result *= 31;
		return result;
	}
	
	@Override
	public String toString() {
		return description;
	}

}
