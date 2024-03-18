package com.tnsif.daysix.hasarelationship;

public class EmployeeDeptDemo {

	public static void main(String[] args) {
			Department deptOne=new Department("Account",2);
			Department deptTwo=new Department("IT",5);
			
			Employee empOne=new Employee(101,"Mayur",790000,deptOne);
			Employee empTwo=new Employee(102,"Akshay",300000,deptTwo);
			Employee empThree=new Employee(103,"Prashant",450000,deptOne);
			Employee empFour=new Employee(104,"Aniket",600000,deptTwo);
			Employee empFive=new Employee(105,"Harshal",500000,deptOne);

			System.out.println("------------Employee Detail----------------");
			System.out.println(empOne);
			System.out.println(empTwo);
			System.out.println(empThree);
			System.out.println(empFour);
			System.out.println(empFive);
	}

}
