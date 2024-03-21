package com.tnsif.dayseven;

public class Point {
	float x,y;
	
	//Default constructor
	Point()
	{
		x=0;
		y=0;
		System.out.println("Point is set to origin : ("+x+", "+y+")");

	}
	Point(float value){
		x=value;
		y=value;
		System.out.println("Point is set to Eual Coordinate : ("+x+", "+y+")");
	}
	Point(float x, float y)
	{
		this.x=x;
		this.x=y;
		System.out.println("Poit is set to : ("+x+", "+y+")");
	}
	
}
