package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.LogoutPage;

public class LoginTest extends Base {

	@Test
	public void testLoginLogoutFlow() throws InterruptedException {
		parentTest = extent.createTest("Test admin user login and logout user flow");
		// calling setp method from Base class - to launch the browser and applicaiton.
		setUp();
		childTest = parentTest.createNode("Applicaiton loginpage opened successfully");
		// create an object for login page pageclass
		LoginPage lp = new LoginPage();

		// calling methods from loginpage page class
		lp.enterEmail(prop.getProperty("name2"));
		childTest = parentTest.createNode("user entered username successfully");
		// enter pwd
		lp.enterPassword(prop.getProperty("pwd2"));
		
		// click login
		lp.clickLoginBtn();
		childTest = parentTest.createNode("user loggedin successfully");
		DashboardPage dp = new DashboardPage();
		// calling method from dashboard page.
		String actualPageHeaderTxt = dp.getPageHeader();
		System.out.println(actualPageHeaderTxt + "*********************");
		Assert.assertEquals(actualPageHeaderTxt, "Dashboar", "Dashboard page title does not match");
		// click logout
		dp.clickProfileIcon();
	
		LogoutPage lp2 = new LogoutPage();
		lp2.clickLogout();

	}
	@Test
	public void testNewUserLogin() throws InterruptedException {
		parentTest = extent.createTest("Test testNewUserLogin");
		// calling setp method from Base class - to launch the browser and applicaiton.
		setUp();
		childTest = parentTest.createNode("Applicaiton loginpage opened successfully");
		// create an object for login page pageclass
		LoginPage lp = new LoginPage();

		// calling methods from loginpage page class
		lp.enterEmail(prop.getProperty("name2"));
		childTest = parentTest.createNode("user entered new username successfully");
		// enter pwd
		lp.enterPassword(prop.getProperty("pwd2"));
		
		// click login
		lp.clickLoginBtn();
		childTest = parentTest.createNode("user loggedin successfully");
		DashboardPage dp = new DashboardPage();
		// calling method from dashboard page.
		String actualPageHeaderTxt = dp.getPageHeader();
		System.out.println(actualPageHeaderTxt + "*********************");
		Assert.assertEquals(actualPageHeaderTxt, "Dashboar", "Dashboard page title does not match");
		// click logout
		dp.clickProfileIcon();
	
		LogoutPage lp2 = new LogoutPage();
		lp2.clickLogout();

	}

}
