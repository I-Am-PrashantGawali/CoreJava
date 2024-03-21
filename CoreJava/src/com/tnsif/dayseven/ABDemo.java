package com.tnsif.dayseven;

public class ABDemo {

	public static void main(String[] args) {
		A a=new A();
		a.show();
		System.out.println("-------------------------");
		B b=new B();
		b.show();
		
		A Obj;
		Obj=a;
		System.out.println("-------------------------");
		Obj.show();
		
		Obj=b;
		System.out.println("-------------------------");
		Obj.show();
	}

}
