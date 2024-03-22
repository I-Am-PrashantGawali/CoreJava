package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Demo {

	public static void main(String[] args) {
		PhoneSim sim;
		sim=SimFactory.getSim("Jio");
		sim.calling();
		sim.messaging();
		
		System.out.println("-----------------------------");
		sim=SimFactory.getSim("Idea");
		sim.calling();
		sim.messaging();
		

	}

}
