//Program to define class with Method overloading  
package com.tnsif.dayseven;

public class MethodOverloading {
	int a, b, c;
	public void add()
	{
		a=10; b=20;
		c=a+b;
		System.out.println("Additon : "+c);
	}
	public void add(int value)
	{
		a=value;
		b=value;
		c=a+b;
		System.out.println("Additon : "+c);
	}
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("Additon : "+c);
	}
	public void add(int a, float b)
	{
		this.a=a;
		this.b=(int) b;
		c=(int) (a+b);
		System.out.println("Additon : "+c);
	}
}
