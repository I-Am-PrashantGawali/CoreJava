package com.tnsif.dayfour;

public class StudentDemo {

	public static void main(String[] args) {
			Student studentObjOne=new Student();
			System.out.println("Roll Number "+studentObjOne.getRollNo());
			System.out.println("Student Name "+studentObjOne.getName());
			System.out.println("Brach "+studentObjOne.getBranch());
			
			studentObjOne.setRollNo(1);
			studentObjOne.setName("Prashant");
			studentObjOne.setBranch("IT");
			
			System.out.println("------------------------------------------");
			System.out.println("Roll Number "+studentObjOne.getRollNo());
			System.out.println("Student Name "+studentObjOne.getName());
			System.out.println("Brach "+studentObjOne.getBranch());
			
			Student studentObjTwo=new Student(2,"Akshay", "IT");
			System.out.println("------------------------------------------");
			System.out.println("Roll Number "+studentObjTwo.getRollNo());
			System.out.println("Student Name "+studentObjTwo.getName());
			System.out.println("Brach "+studentObjTwo.getBranch());
			
			Student student;
			student=studentObjOne.getStudent();
			System.out.println("-------------------------------------------");
			System.out.println("Roll Number "+student.getRollNo());
			System.out.println("Student Name "+student.getName());
			System.out.println("Branch "+student.getBranch());

	}

}
