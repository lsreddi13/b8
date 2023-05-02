package com.java.arrays;

import java.util.Arrays;

public class DemoCompareArrays {
	public static void main(String[] args) {

		/*
		 * String a = "sasi"; String b = "sasi"; if(a==b) { System.out.println("Same");
		 * }else { System.out.println("not same"); }
		 * 
		 * 
		 * if(a.equals(b)) { System.out.println("Same"); }else {
		 * System.out.println("not same"); }
		 */
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 1, 2, 3 };
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] == a2[i]) {
					System.out.println("both the array value is same");
				} else {
					System.out.println("value is not same in the both the arrays -- " + a1[i] + " and " + a2[i]);
				}
			}
		}

		boolean x = a1.equals(a2);
		System.out.println(x);
		if(a1.equals(a2)) {
			System.out.println("Same");
		}else {
			System.out.println("not same");
		}

		if (Arrays.equals(a1, a2))

		{
			System.out.println("both are same");
		} else {
			System.out.println("Both are diff");
		}

		/*
		 * int[] array = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 }; int[] array2 =
		 * new int[] { 90, 23, 5, 109, 12, 22, 67, 34 }; // int[] array2 = new int[] {
		 * 90, 23, 109, 5, 12, 67, 22, 34 }; // invoking sort() method of the Arrays
		 * class
		 * 
		 * // Arrays.sort(array); // Arrays.sort(array2); if (Arrays.equals(array,
		 * array2)) { System.out.println("arrays are equal"); } else {
		 * System.out.println("arrays are not equal"); }
		 */
		/*
		 * System.out.println("Elements of array sorted in ascending order: "); //
		 * prints array using the for loop for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */

		/*
		 * String[] inarray1 = new String[] { "mango", "grapes", "plum", "watermelon",
		 * "apple" }; String[] inarray2 = new String[] { "grapes", "mango", "plum",
		 * "watermelon", "apple" }; Object[] array1 = { inarray1 }; // array1 have only
		 * one element Object[] array2 = { inarray2 }; Arrays.sort(array1);
		 * 
		 * Arrays.sort(array2); for (int i = 0; i < array2.length; i++) {
		 * System.out.println(array2[i].toString()); }
		 * 
		 * if (Arrays.deepEquals(array1, array2)) {
		 * System.out.println("Arrays are equal."); } else {
		 * System.out.println("Arrays are not equal."); }
		 */
	}
}
