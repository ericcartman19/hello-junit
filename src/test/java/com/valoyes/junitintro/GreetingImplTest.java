package com.valoyes.junitintro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private static final String GREET_JUNIT = "Hello Junit";
	private Greeting greeting;

	@Before
	public void setup() {
		System.out.println("Setup");
		greeting = new GreetingImpl();
	}
	
	@Test
	public void casPassant_shouldReturnAValidOutput() {
		System.out.println("casPassant_shouldReturnAValidOutput");
		Greeting greeting = new GreetingImpl();
		String resultado = greeting.greet("Junit");
		
		// assert
		assertNotNull(resultado);
		assertEquals(GREET_JUNIT, resultado);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void casNonPassant_NameNullThrowsException() {
		System.out.println("casNonPassant_NameNullThrowsException");
		greeting = new GreetingImpl();
		greeting.greet(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void casNonPassant_NameBlankThrowsException() {
		System.out.println("casNonPassant_NameBlankThrowsException");
		greeting = new GreetingImpl();
		greeting.greet("");
	}
	
	@After 
	public void tearDown() {
		System.out.println("Teardown");
		greeting = null;
	}

}
