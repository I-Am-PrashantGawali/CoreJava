package com.tnsif.dayeight.interfaces.markerinterface;

public class Demo {

	public static void main(String[] args) {
		Student sOne=new Student("Prithvi", 7070707070L);
		RegisteredStudent sTwo=new RegisteredStudent("Meet", 8989907070L);
		if (sOne instanceof Registrable)
			System.out.println("Welcome "+sOne.getName()+" for the C2TC training program");
		else
			System.out.println("Sorry "+sOne.getName()+", you are not registrered for the C2TC training program");
		
		if (sTwo instanceof Registrable)
			System.out.println("Welcome "+sTwo.getName()+" for the C2TC training program");
		else
			System.out.println("Sorry "+sTwo.getName()+", you are not registrered for the C2TC training program");
	}

}


