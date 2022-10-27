package edu.westga.cs3211.a3.model;

public class Pig {
	
	private String color;
	
	private int age;
	
	
	public Pig(String color, int age) {
		this.setColor(color);
		this.setAge(age);
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		if(color.isEmpty()) {
			throw new IllegalArgumentException("Color cannot be blank");
		}
		this.color = color;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age < 0 || age > 23) {
			throw new IllegalArgumentException();
		}
		this.age = age;
	}

}
