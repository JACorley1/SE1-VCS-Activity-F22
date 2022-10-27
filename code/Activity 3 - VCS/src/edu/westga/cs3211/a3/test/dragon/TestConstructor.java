package edu.westga.cs3211.a3.test.dragon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a3.model.Dragon;

class TestConstructor {

	@Test
	void nonFlyingDragon() {
		Dragon dragon = new Dragon(5, false);
		assertAll(
				() -> assertEquals(5, dragon.getWingSpan()),
				() -> assertEquals(false, dragon.isBreathesFire()),
				() -> assertEquals(false, dragon.fly())
			);
	}
	
	@Test
	void validDragon() {
		Dragon dragon = new Dragon(10, true);
		assertAll(
				() -> assertEquals(10, dragon.getWingSpan()),
				() -> assertEquals(true, dragon.isBreathesFire()),
				() -> assertEquals(true, dragon.fly())
			);
	}
	
	@Test
	void invalidDragon() {
		assertThrows(IllegalArgumentException.class, ()->{new Dragon(-1, true);});
	}

}
