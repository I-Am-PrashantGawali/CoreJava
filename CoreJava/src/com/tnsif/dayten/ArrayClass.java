package com.tnsif.dayten;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int a[]= {46,74,12,34,56,78};
		for(int ele:a)
			System.out.println(ele);
		System.out.println("-------------------------");
		
		
	System.out.println(Arrays.binarySearch(a, 12));
	Arrays.sort(a);
	for(int ele:a)
		System.out.println(ele);
	System.out.println();
	
	}

}
