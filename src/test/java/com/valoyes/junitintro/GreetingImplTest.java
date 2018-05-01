package com.valoyes.junitintro;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplTest {

	private static final String GREET_JUNIT = "Hello Junit";

	@Test
	public void casPassant_shouldReturnAValidOutput() {

		Greeting greeting = new GreetingImpl();
		String resultado = greeting.greet("Junit");
		
		// assert
		assertNotNull(resultado);
		assertEquals(GREET_JUNIT, resultado);
		
	}

}
