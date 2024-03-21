package com.tnsif.dayeight.abstraction;

public class Demo {
	public static void main(String[] args) {
		//abstract class cannot instantiated
		//Shape s=new Shape();
		Shape s;
		
		Circle c=new Circle(4.5f);
		s=c;
		s.calculateArea();
		s.show();
		
		System.out.println("--------------------");
		Rectangle r=new Rectangle(2.4f,3.6f);
		s=r;
		s.calculateArea();
		s.show();
		
	}

}
