package com.java.datatypes;

public class DemoStatic {
	static String str1 = "java";
	String str2 = "selenium";
	static String str3 = "testing";

	public static void main(String[] args) {
		test1();
		test3();
	}

	public static String test1() {
		String str1_1 = "testing tools";
		String sss = str1_1 + str1;
		return sss;
	}

	public static void test3() {
		String str3_3 = "java functions";
		System.out.println(str3_3);
		DemoStatic ds = new DemoStatic();
		System.out.println(ds.str2);
		System.out.println(str3);

	}

}
