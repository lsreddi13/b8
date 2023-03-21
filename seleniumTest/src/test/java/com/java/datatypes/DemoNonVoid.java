package com.java.datatypes;

public class DemoNonVoid {

	String str1 = "java";
	String str2 = "selenium";
	String str3 = "testing";

	public static void main(String[] args) {
		DemoNonVoid dnv = new DemoNonVoid();
//		String ss = dnv.test1();
		
		System.out.println(dnv.test1());
//		System.out.println(ss);
//		dnv.test2();
//		dnv.test3();
	}

	public String test1() {

		String str1_1 = "testing tools";

		String sss = str1_1 + str1;
		return sss;
		
	}

}
