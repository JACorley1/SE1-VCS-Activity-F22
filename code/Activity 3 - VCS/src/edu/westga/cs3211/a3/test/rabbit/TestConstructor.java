package edu.westga.cs3211.a3.test.rabbit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.westga.cs3211.a3.model.Rabbit;

class TestConstructor {

	@Test
	void testColorForRabbit() {
		Rabbit rabbit = new Rabbit("Rab", "Green");
		assertEquals("Rab", rabbit.getName());
	}

	@Test
	void testNameForRabbit() {
		Rabbit rabbit = new Rabbit("Rab", "Green");
		assertEquals("Green", rabbit.getColor());
	}

	@ParameterizedTest
	@CsvSource({ "Rab,", ", Green", " , Green", "Rab, " })
	void testNullValues(String name, String color) {
		assertThrows((IllegalArgumentException.class), () -> {
			new Rabbit(name, color);
		});
	}
}
