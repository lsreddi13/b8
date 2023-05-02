package com.java.arrays;

import java.util.Arrays;

public class DemoSimpleArray {
	public static void main(String[] args) {

		
		String name[] = {"Sasi", "karthi", "Suseela", "Divya"};
		
		
		int marks[] = {12,23,23,21,34};
		
		String states[] = new String[18];
		states[13] = "AP";
		
		System.out.println(states.length);
		System.out.println(Arrays.toString(states));
		
		System.out.println(name.length);
//		System.out.println(name[4]);
		
//		arrays are fixed side
		
		//remove values from arrays
		name[0] = null;
		System.out.println(name[0]);
		System.out.println(name.length);
		
		marks[1] = 0;
		
		System.out.println(marks[1]);
		
		
		//replace value from array 
		
		//copy one array to another array
		
		
		//add one array values into another array
		
		
		//print arrays
		
		
		
	}

}
