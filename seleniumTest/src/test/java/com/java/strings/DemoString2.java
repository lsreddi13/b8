package com.java.strings;

public class DemoString2 {

	public static void main(String[] args) {
		String s = "Hello Java selenium";
//		System.out.println(s.contains("Hello "));// returns true
//		System.out.println(s.contains("selenium"));

		
		String s1 = "Java Programming Language";
		System.out.println(s1.startsWith("Java", 5));// false
		System.out.println(s.startsWith("Java", 6));// true
		
		
		String str="Hello Java   ";
		
		String S3 = str.substring(6).trim();
		System.out.println(S3.length());
		
	}
}
