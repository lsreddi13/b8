package com.java.oops.poly;

import org.testng.annotations.Test;

public class DemoOverloading {
	
	//method overloading or compile time polymorphism
	
@Test
public void testSum() {
	add();
	add(7);
	add("sss");
	add(3,2);
	add("autoamtion", "testing");
}
	
	public void add() {
	
		System.out.println("Sum ");
	}
	
	public void add(int a) {
		System.out.println("Sum "+a);
	}
	
	public void add(String b) {
		System.out.println("Sum "+b);
	}
	
	public void add(int a, int b)
	{
		System.out.println(a + b);
	}
	
	public void add(String s1, String s2) {
		System.out.println(s1 +" "+ s2);
	}
	
	
}
