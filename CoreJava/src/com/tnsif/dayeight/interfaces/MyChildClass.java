//Program to define Child class from interface
package com.tnsif.dayeight.interfaces;
//Implemented class
public class MyChildClass implements MyFirstInterface {

	@Override
	public void display() {
		System.out.println("Implementing Interface Method");
		
	}

	@Override
	public String greet(String name) {
		return "Hello "+ name +"!";
	}

}
