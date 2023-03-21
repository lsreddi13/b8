package com.java.datatypes;

public class DemoVoid {
	
	String str1="java";
	String str2 = "selenium";
	String str3 = "testing";
	public static void main(String[] args) {
		DemoVoid dv = new DemoVoid();
		dv.test1();
		dv.test2();
		dv.test3();
	}
	
	
	public void test1() {
		
		String str1_1 = "testing tools";
		
		System.out.println(str1_1);
		System.out.println(str1);
		
	}
	
	public void test2() {
		String str2_2 = "java methods";
		
		System.out.println(str2_2);
		
		System.out.println(str2);
		
	}
	
	public void test3() {
		
		String str3_3 = "java functions";
		System.out.println(str3_3);
		System.out.println(str3);
		
	}

}
