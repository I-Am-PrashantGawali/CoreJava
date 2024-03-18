//program to demonstrate Has a relationship
package com.tnsif.daysix.hasarelationship;

public class Driver {

	public static void main(String[] args) {
			Address addrObj=new Address(13, "Nashik", 420001);
			
			Person p=new Person();
			p.setName("Akshay");
			p.setContactNo(9023454612L);
			p.setAddress(addrObj);
			System.out.println(p);
			
			Address addrObjOne=new Address(11,"Mumbai",23950);
			Person pObj=new Person("Prashant", 2335357676L, addrObjOne);
			System.out.println(pObj);
			System.out.println(addrObj);
			System.out.println(pObj);
			

	}

}
