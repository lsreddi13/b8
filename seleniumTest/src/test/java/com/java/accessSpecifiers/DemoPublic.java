package com.java.accessSpecifiers;

public class DemoPublic {
	protected void msg() {
		System.out.println("Hello");
	}

	final int weekdays = 7;
	final int hoursPerday = 24;
	
	
	final int duration=24;
	public String name2;
	public String name = "java";
	private String course = "Testing";
	protected String toolName = "Selenium";
	String platform = "Testing"; // default

	public static void main(String[] args) {
		DemoPublic dp = new DemoPublic();

		System.out.println(dp.name);
		System.out.println(dp.course);
		System.out.println(dp.toolName);
		System.out.println(dp.platform);
		System.out.println(dp.duration);
	}

	
	
}
