package edu.westga.cs3211.a3.model;

public class Dragon {
	
	private int wingSpan;
	private boolean breathesFire;
	
	public Dragon(int wingSpan, boolean breathesFire) {
		if (wingSpan <= 0 ) {
			throw new IllegalArgumentException("Wing Span cannot be less than 1.");
		}
		this.wingSpan = wingSpan;
		this.breathesFire = breathesFire;
	}

}
