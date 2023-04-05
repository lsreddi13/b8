package com.java.superDemo;

import org.testng.annotations.Test;

public class Child1 extends Parent1 {
	
	 String color = "red";
	Child1(){
		super();
		System.out.println("this is child");
	}
	
	public void t1() {
		System.out.println("hello");
	}
	@Test
	public void testmethod1() {
		Child1 c = new Child1();
		c.t1();
		System.out.println(super.color);
		
		
		System.out.println(this.color);
	}
	

}
