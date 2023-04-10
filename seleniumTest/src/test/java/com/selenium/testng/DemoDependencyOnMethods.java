package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoDependencyOnMethods {

	
	
	@Test(priority = 1)
	public void openBrowser() {
		System.out.println("openBrowser");
	}

	@Test(priority = 2)
	public void launchApplication() {

		System.out.println("launchApplication");
	}

	@Test(priority = 3)
	public void loginUser() {
		System.out.println("loginUser");
		Assert.assertEquals(true, true, "Login user failed.");
		System.out.println("after failing the assertion.");//--it won't execute
	}

	@Test(priority = 4, description = "this is create user functionality")
	public void createUSer() {
		System.out.println("createUSer");
		Assert.assertEquals(true, true, "Login user failed.");
	}

	@Test(priority = 5, enabled = true, description = "verify edit user functionality", dependsOnMethods = "createUSer")
	public void editUser() {
		System.out.println("editUser");
	}

	@Test(priority = 6, dependsOnMethods = "createUSer")
	public void deleteUser() {
		System.out.println("deleteUser");
	}

	@Test(priority = 7)
	public void logoutUser() {
		System.out.println("logoutUser");
	}
}
