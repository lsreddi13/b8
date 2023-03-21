package com.methods.java;

import org.testng.annotations.Test;





public class DemoFBMethodsSameClass {

	
	@Test
	public void testcase1() {
		
		DemoMethod dm = new DemoMethod();
		dm.openBrowser();
		dm.loginTest("Asif", "pwd123");
		dm.logoutTest();
	}
	
	
	
	
}
