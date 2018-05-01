package com.valoyes.junitintro;

import org.springframework.util.StringUtils;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {
		
		if(StringUtils.isEmpty(name)) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}
	
}
