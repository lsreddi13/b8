package com.java.accessSpecifiers;

public class DemoFinal {

	final int weekdays =7; //can you use static for final
	public static int hours = 24;
	
	private int month;
	
	final void testFinal() {
		System.out.println("this is final method.");
		
//		weekdays = 8;
		
		hours = 30;
	}
	
	public static void testnonFinal() {
		System.out.println("this is non final method.");
		
		
	}
	
	
	public static void main(String[] args) {
		
		DemoFinal df = new DemoFinal();
		System.out.println(df.weekdays);
		df.testFinal();
	}
}
