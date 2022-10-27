package edu.westga.cs3211.a3.model;

public class Rabbit {

	private String name;
	private String color;

	public Rabbit(String name, String color) {
		if (name == null || color == null || name.isBlank() || color.isBlank()) {
			throw new IllegalArgumentException("Rabbit must have a name and color");

		}
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

}
