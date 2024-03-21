//Program to implements child class from more than one interface
package com.tnsif.dayeight.interfaces.multipleinterface;

public class Child implements InterfaceOne, InterfaceTwo {

	@Override
	public void display() {
		System.out.println("Display");
		
	}

	@Override
	public void show() {
		System.out.println("Show");
	
	}

}
