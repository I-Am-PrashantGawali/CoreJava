package com.tnsif.dayeight.interfaces.instanceofinterface;

public class JioSim implements PhoneSim {

	@Override
	public void calling() {
		System.out.println("Calling through Jio Sim");
	}

	@Override
	public void messaging() {
		System.out.println("Messaging through Jio Sim");		
	}

}
