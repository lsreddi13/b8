package com.selenium.testng.listeners;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class DemoApplyListeners {

	@Test(priority = 1)
	public void openBrowser() {
		System.out.println("openBrowser");
		
	}

	@Test(priority = 2)
	public void launchApplication() {

		System.out.println("launchApplication");
		Assert.assertEquals(true, false);
		System.out.println("failed test case here wantedly.");
	}

	@Test(priority = 3, dependsOnMethods = "launchApplication")
	public void loginUser() {
		System.out.println("loginUser");
	}

	@Test(priority = 4, description = "this is create user functionality")
	public void createUSer() {
		System.out.println("createUSer");
	}

	@Test(priority = 5, enabled = true, description = "verify edit user functionality")
	public void editUser() {
		System.out.println("editUser");
	}

	@Test(priority = 6)
	public void deleteUser() {
		System.out.println("deleteUser");
		Assert.assertEquals(true, false);
		System.out.println("failed test case here wantedly.");
	}

	@Test(priority = 7)
	public void logoutUser() {
		System .out.println("logoutUser");
	}
	
}
