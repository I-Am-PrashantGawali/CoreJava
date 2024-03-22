package com.tnsif.dayeight.interfaces.functionalinterface;

public class Demo {

	public static void main(String[] args) {
		//functional interface
		Runnable r=()->{
			System.out.println("Theread runing........");
		};
		Thread t=new Thread();
		t.start();
		
		//Old way - Using implementable Class
		ImplClass obj=new ImplClass();
		System.out.println(obj.greet("Students"));
		
		//Old way - Using anonymous class
		MyFunctionalInterface ObjOne=new MyFunctionalInterface() {

			@Override
			public String greet(String name) {
				return "Good Morning "+ name;
			}
			
		};
		System.out.println(ObjOne.greet("Students"));
		
		//Using Lambda Expression
		MyFunctionalInterface s=(name)-> "Hi "+ name;
		System.out.println(s.greet("Students"));
		
	}

}
