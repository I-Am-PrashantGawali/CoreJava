package com.tnsif.dayten;

public class MatrixDemo {

	public static void main(String[] args) {
		int m[][]=new int[2][3];
		for(int i=0; i<m.length; i++)
		{
			for(int j=0;j<m[i].length; j++)
				System.out.print(m[i][j]+"\t");
			System.out.println();
		}
		System.out.println("------------------------------");
		m=new int[][]{{12,34},{23,56},{35,55},{33,36}}; 
		System.out.println("No of rows : "+m.length);
		for(int i=0; i<m.length; i++)
		{
			for(int j=0;j<m[i].length; j++)
				System.out.print(m[i][j]+"\t");
			System.out.println();
		}
	}

}
