package com.methods.java;

public class DemoMethod {

	public static void main(String[] args) {
		//asif1, asif2, asif3, asif4
		
		for( int i=1; i<5; i++) {
		
		loginTest("Asif"+i, "pwd123");
		logoutTest();
	
		}
	}
	
	public void openBrowser() {
		System.out.println("openbrowser");
	}
	
	//create static void method
	public static void loginTest(String uname, String pwd ) {
		System.out.println("Enter user name : "+uname);
		System.out.println("Enter password : "+pwd);
		System.out.println("Click Login button");
		System.out.println("Check the home page - Loggedin as : "+uname);
	}
	
	public static void logoutTest() {
		System.out.println("Click Logout Link");
		System.out.println("Check Login page");
	}
	
	
}
