package com.tnsif.dayfive;

public class FinalDemo {

	public static void main(String[] args) {
			//used to declare local constant
			final int number;
			//System.out.println(number);
			number = 10;
			System.out.println(number);
			//number=78;
			
			UsingFinal obj = new UsingFinal();
			
			System.out.println(obj);
			
			UsingFinal ObjThree=new UsingFinal();
			
			System.out.println(ObjThree);
			
			System.out.println("---------------------------");
			UsingFinalMethod parent=new UsingFinalMethod();
			parent.normalMethod();
			parent.finalMethod();
			
			Child child = new Child();
			child.normalMethod();
			child.finalMethod();
	}

}
