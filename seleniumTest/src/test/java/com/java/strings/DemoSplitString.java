package com.java.strings;

public class DemoSplitString {
	public static void main(String[] args) {
		String s = "Java String Split Example";
		String[] str1 = s.split(" ");
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]); // output
			// Java
			// String
			// Split
			// Example
		}

		// Split with limit -
		// it will split the string based on the limit we specify
		String[] str2 = s.split(" ", 6);
		for (int i = 0; i < str2.length; i++) {
			System.out.println("***** "+str2[i]); // output
			// Java
			// String Split Example
		}
	}

}
