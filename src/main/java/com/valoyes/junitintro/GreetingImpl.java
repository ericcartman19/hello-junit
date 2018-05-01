package com.valoyes.junitintro;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {
		return "Hello " + name;
	}
	
}
