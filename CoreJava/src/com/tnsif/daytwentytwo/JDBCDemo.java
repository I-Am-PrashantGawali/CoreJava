package com.tnsif.daytwentytwo;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC Driver is loaded....");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/c2tc","root", "prashant");
		System.out.println("Connection eshtablished successfully.....");
		Statement st=cn.createStatement();
		int rno;
		String name;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno, name & per");
		rno=sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();
		per=sc.nextFloat();
		int n=st.executeUpdate("insert into student values("+rno+",'"+name+"',"+per+")");
		System.out.println(n+"row inserted.....");
		cn.close();
	}

}
