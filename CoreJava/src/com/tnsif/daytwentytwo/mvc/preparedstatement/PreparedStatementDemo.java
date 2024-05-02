package com.tnsif.daytwentytwo.mvc.preparedstatement;

import java.sql.SQLException;
import java.util.Scanner;

import com.tnsif.daytwentytwo.mvc.Student;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		StudentServiceImpl obj=new StudentServiceImpl();
		Student s=new Student();
	
		System.out.println("-------------Enter a Choice------------");
		System.out.println("1 : addStudent...");
		System.out.println("2 : updateStudent...");
		System.out.println("3 : deleteStudentByRollNo...");
		System.out.println("4 : deleteStudentBelowPer...");
		System.out.println("5 : deleteByName...");
		System.out.println("6 : displayAll...");
		System.out.println("7 : displayStudentsWithinPerRange...");
		System.out.println("8 : Exit");
		
		
		switch (ch) {
		case 1: 
			s.setRollNo(9);
			s.setName("Anita");
			s.setPer(80);
			obj.addStudent(s);
			System.out.println("Recored Inserted successfully.....");
			obj.displayAll();
			int ch = sc.nextInt();
			break;
		case 2: 
			int ch = sc.nextInt();
			
			break;
		case 3: 
			break;
		case 4: 
			break;
		case 5: 
			break;
		case 6: 
			break;
		case 7: 
			break;
		case 8: 
			break;
		default :
		}
		//Student s=new Student(5,"Arun",67);
		//obj.addStudent(s);
		//obj.displayAll();
		//System.out.println("Student between 70 and 80 percentage");
		//System.out.println(obj.displayStudentsWithinPerRange(70,80));
		//System.out.println("------------------------------------");
		//if (obj.deleteStudentByRollNo(1)==0)
		//if (obj.deleteStudentBelowPer(40)==0)
		//if (obj.deleteByName("%a")==0)
			//System.out.println("Student not found..");
		//else
		//	System.out.println("Record deleted successfully....");
		//System.out.println("------------------------------------");
		/*Student s=new Student();
		s.setRollNo(2);
		s.setName("Amol");
		s.setPer(90);
		int n=obj.updateStudent(s, 2);
		System.out.println(n+" record(s) updated...");
		obj.displayAll();*/
	}

}