package com.tnsif.dayeight.abstraction;

public class Circle extends Shape {
	float radius;
	float diameter;
	double circumferance;
	
	
	public Circle() {
		super();
		name="Circle";	
	}
	public Circle(float radius) {
		super();
		name="Circle";
		this.radius = radius;
		this.diameter=2* radius;
		this.circumferance=Math.PI*this.diameter;
	}


	@Override
	void calculateArea() {
		area=Math.PI*this.diameter;
		
	}
	@Override
	public void show() {
		super.show();
		System.out.println("Diameter of circle is "+ diameter);
		System.out.println("Circumference of circle is "+ circumferance);
	}
	
	
}
