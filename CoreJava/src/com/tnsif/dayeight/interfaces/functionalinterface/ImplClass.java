package com.tnsif.dayeight.interfaces.functionalinterface;

public class ImplClass implements MyFunctionalInterface {

	@Override
	public String greet(String name) {
		
		return "Hello " +name;
	}

}
