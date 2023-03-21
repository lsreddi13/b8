package com.java.strings;

import java.util.Arrays;

public class DemoStringClass {

	public static void main(String[] args) {
		
		int sal;
		int age = 34;
		
		int age2 = 34;
		
		
		
		String Str;
		String name = "selenium";
		String name3 = "selenium";
		
		String course = "Selenium Automation" ;
		String result = "1-16 of 17 results for iphone";
		String[] str = result.split(" ");
		
		System.out.println("string array : " +Arrays.toString(str));
		
		String result_vlaue = str[2];
		
		System.out.println("finally : "+result_vlaue);
		
		System.out.println(result.charAt(8));
		System.out.println("print the total number of results : "+result.substring(8, 11));
		String s= new String("Selenium"); 
		String s1; 
		s1=s.concat("Java"); 
		
		System.out.println(s.concat("Java"));
		
		String s3= new String("Apple"); // ref id same in the heap
		String s4= new String("APPLE");
		
		
//		System.out.println(s.equals(s1));// returns true
//		System.out.println(s==s1);// returns false
//		System.out.println(s3.equals(s4));// returns false	
		System.out.println("check with equalsIgnoreCase :  "+s3.equalsIgnoreCase(s4));// returns true
		System.out.println("check with equals :  "+s3.equals(s4));// returns true
		
//		course.charAt(age2) // 
//		course.contains(course)
//		course.endsWith(course)
//		course.trim()
//		course.isEmpty()
//		course.split(course)
//		course.lastIndexOf(age2)
//		course.equalsIgnoreCase(Str)
		
		System.out.println("String length : "+name.length());
		
		
		String name2 = new String("selenium");
		
		System.out.println("age : " + age);
		
		System.out.println("name : " + name);
		System.out.println("name2 : "+ name2);
		
		
		if(age == age2) {
			System.out.println("matched");
		}else {
			System.out.println(" not matched");
		}
		
		if(name == name2) {
			System.out.println("using == matched");
		}else {
			System.out.println("using == not matched");
		}
		

		if(name.equals(name2) ){
			System.out.println(" using equal operator matched");
		}else {
			System.out.println(" not matched");
		}
		
	}
	
}
