package com.java.datatypes;

public class DemoVars {
	
	//global
	String college = "Annammaya";
	public static int passedOutYear;

	
	public static void main(String[] args) {
		DemoVars obj = new DemoVars();
		
//		System.out.println(obj.stu1data());
		
		int yy = obj.stu1data();
		System.out.println(yy);
		obj.stu2data();
		
		
	}
	
	
	public int stu1data() {
		//local
		String stu ="karthik";
		passedOutYear = 2022;
		
		return passedOutYear;
	}
	
	public void stu2data() {
		//local
		String stu = "Suseela";
		passedOutYear = 2019;
		
	}

}
