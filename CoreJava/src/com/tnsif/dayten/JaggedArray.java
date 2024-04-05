package com.tnsif.dayten;

public class JaggedArray {

	public static void main(String[] args) {
		int m[][]= {{12},{23,45,34},{65,54,2},{23}};
		for(int i=0; i<m.length; i++)
		{
			for(int j=0;j<m[i].length; j++)
				System.out.print(m[i][j]+"\t");
			System.out.println();
		}
	}

}
