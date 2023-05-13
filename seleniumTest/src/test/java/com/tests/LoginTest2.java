package com.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.base.Base;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.LogoutPage;

public class LoginTest2 extends Base {
	
	@Test(enabled = true, dataProvider = "getData", dataProviderClass = com.java.readDataFromXLS.DemoReadDataFromXLS.class)
	public void testLoginDATAPROVIDER(String uName, String pwd) throws InterruptedException {
		parentTest = extent.createTest("Test admin user login and logout user flow");
		// calling setp method from Base class - to launch the browser and applicaiton.
		setUp();
		childTest = parentTest.createNode("Applicaiton loginpage opened successfully");
		
		// create an object for login page pageclass
		LoginPage lp = new LoginPage();

		lp.enterEmail(uName);
		lp.enterPassword(pwd);

	}
	

}
