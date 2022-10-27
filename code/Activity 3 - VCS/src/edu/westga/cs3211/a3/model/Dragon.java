package edu.westga.cs3211.a3.model;

public class Dragon {
	
	private int wingSpan;
	private boolean breathesFire;
	
	public final int MIN_WING_SPAN = 10;
	
	public Dragon(int wingSpan, boolean breathesFire) {
		if (wingSpan <= 0 ) {
			throw new IllegalArgumentException("Wing Span cannot be less than 1.");
		}
		this.wingSpan = wingSpan;
		this.breathesFire = breathesFire;
	}
	
	public int getWingSpan() {
		return this.wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		if (wingSpan <= 0 ) {
			throw new IllegalArgumentException("Wing Span cannot be less than 1.");
		}
		this.wingSpan = wingSpan;
	}

	public boolean isBreathesFire() {
		return this.breathesFire;
	}

	public void setBreathesFire(boolean breathesFire) {
		this.breathesFire = breathesFire;
	}
	
	public boolean fly() {
		boolean result;
		if (this.wingSpan >= this.MIN_WING_SPAN) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}

}
