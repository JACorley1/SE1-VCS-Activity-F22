package edu.westga.cs3211.a3.test.pig;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a3.model.Pig;

class TestConstructor {

	@Test
	void testEmptyColor() {
		assertThrows(IllegalArgumentException.class, ()->{
				new Pig("", 7);
		});
	}
	
	@Test
	void testNegativeAge() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Pig("Pink", -5);
	});
	}
	
	@Test
	void testInvalidAge() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Pig("Pink", 50);
	});


}

	
	
	@Test
	void testSuccessfulPig() {
		Pig newPig = new Pig("Pink", 12);
		String pigColor = newPig.getColor();
		int pigAge = newPig.getAge();
		
		assertEquals(pigColor, newPig.getColor());
		assertEquals(pigAge, newPig.getAge());
	}}

