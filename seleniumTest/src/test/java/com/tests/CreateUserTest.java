package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.LogoutPage;

public class CreateUserTest extends Base {

	@Test
	public void testCreateUserFlow() throws InterruptedException {

		// calling setp method from Base class - to launch the browser and applicaiton.
		setUp();

		// create an object for login page pageclass
		LoginPage lp = new LoginPage();

		// calling methods from loginpage page class
		lp.enterEmail(prop.getProperty("name2"));

		// enter pwd
		lp.enterPassword(prop.getProperty("pwd2"));

		// click login
		lp.clickLoginBtn();

		DashboardPage dp = new DashboardPage();
		// calling method from dashboard page.
		String actualPageHeaderTxt = dp.getPageHeader();
		System.out.println(actualPageHeaderTxt + "*********************");
		Assert.assertEquals(actualPageHeaderTxt, "Dashboard", "Dashboard page title does not match");
		
		
		//admin tab
		
		//add user
		
		
		
		
		// click logout
		dp.clickProfileIcon();
	
		LogoutPage lp2 = new LogoutPage();
		lp2.clickLogout();

	}

}
