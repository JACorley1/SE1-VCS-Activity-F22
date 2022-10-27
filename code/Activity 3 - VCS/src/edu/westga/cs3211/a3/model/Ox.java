package edu.westga.cs3211.a3.model;

public class Ox {
	private int year;
	private String favoriteFood;
	
	public int getYear() {
		return year;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public Ox(int year, String favoriteFood) {
		if (favoriteFood.isEmpty()) {
			throw new IllegalArgumentException();
		}
		if (year <= 0) {
			throw new IllegalArgumentException();
		}
		
		this.year = year;
		this.favoriteFood = favoriteFood;
	}
}
