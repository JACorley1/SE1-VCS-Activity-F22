package edu.westga.cs3211.a3.test.horse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a3.model.Horse;

class TestCosntructor {
	
	
	@Test
	void testValidConstructor() {
		Horse horse = new Horse("Tacoma", "Brown");
		String breed = horse.getBreed();
		String color = horse.getColor();
		assertEquals("Tacoma", breed);
		assertEquals("Brown", color);
	}
	
	@Test
	void testInvalidBreedIsNull() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Horse(null, "Brown");
		});
	}
	
	@Test
	void testInvalidBreedIsEmpty() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Horse("", "Brown");
		});
	}
	
	@Test
	void testInvalidColorIsNull() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Horse("Tacoma", null);
		});
	}
	
	@Test
	void testInvalidColorIsEmpty() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Horse("Tacoma", "");
		});
	}
}
