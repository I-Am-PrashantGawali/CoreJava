//Program to define abstract class shape
package com.tnsif.dayeight.abstraction;

public abstract class Shape {
	protected String name;
	protected double area;
	
	//abstract method
	abstract void calculateArea();
	
	//concrete method
	void show() {
		System.out.println("Area of "+name+" is "+area);
	}
}
