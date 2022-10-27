package edu.westga.cs3211.a3.model;

/**
 * Horse Class
 * 
 * @author jaxz2
 * @version 10/27/2022
 */
public class Horse {

	private String breed;
	private String color;
	
	public Horse(String breed, String color) {
		if(breed == null) {
			throw new IllegalArgumentException("Breed cannot be null");
		}	
		if (breed.isEmpty()) {
			throw new IllegalArgumentException("Breed cannot be empty");	
		}
		if(color == null) {
			throw new IllegalArgumentException("color cannot be null");
		}	
		if (color.isEmpty()) {
			throw new IllegalArgumentException("Breed cannot be empty");	
		}
		this.breed = breed;
		this.color = color;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public String getColor() {
		return this.color;
	}
}
