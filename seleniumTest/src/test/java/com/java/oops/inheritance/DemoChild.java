package com.java.oops.inheritance;

import org.testng.annotations.Test;

public class DemoChild extends Parent1 {
	
	String spcialization = "selenium automation";
	public void logout() {
		System.out.println("this is logout method from child class");
	}

	@Test
	public void test1() {
		DemoChild dc = new DemoChild();
		dc.m1();
		System.out.println(dc.name);

		System.out.println(course);

		m1_1();
		logout();
		
		System.out.println(spcialization);
		
		m2();
		m3();
	}

}
