package com.tnsif.dayseven;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(123);
		obj.add(39, 49);
		obj.add(80, 55.4f);
		obj.add(80, 50.0f);
	}

}
