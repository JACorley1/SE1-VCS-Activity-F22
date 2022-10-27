package edu.westga.cs3211.a3.test.ox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a3.model.Ox;

class TestConstructor {

	@Test
	void testConstructorInvalidYear() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Ox(0, "pizza");
		});
	}
	
	@Test
	void testConstructorEmptyFood() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Ox(1997, "");
		});
	}

	@Test
	void testConstructorNullFood() {
		assertThrows(NullPointerException.class, () -> {
			new Ox(1997, null);
		});
	}
	
	@Test
	void testConstructorLowerYear() {
		Ox test = new Ox(1, "pizza");
		
		assertEquals(1, test.getYear());
		assertEquals("pizza", test.getFavoriteFood());
	}
	
	@Test
	void testConstructorMidYear() {
		Ox test = new Ox(1997, "pizza");
		
		assertEquals(1997, test.getYear());
		assertEquals("pizza", test.getFavoriteFood());
	}

}
