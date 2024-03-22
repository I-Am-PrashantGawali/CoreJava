package com.tnsif.dayeight.interfaces.instanceofinterface;

public class SimFactory {
	public static PhoneSim getSim(String type)
	{
		if (type.equals("Jio"))
			return new JioSim();
		else
		if (type.equals("Idea"))
			return new IdeaSim();
		return null;
	}
}
