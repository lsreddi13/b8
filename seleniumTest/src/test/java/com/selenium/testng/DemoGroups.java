package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoGroups {

	@BeforeClass
	public void setUp() {
		System.out.println("open browser");
		System.out.println("launchapplciaiton");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	

	@Test(priority = 3, groups = "smoke")
	public void loginUser() {
		System.out.println("loginUser");
	}



	@Test(priority = 1,groups = "leaveTestcases")
	public void applyLeave() {
		System.out.println("applyLeave");
	}
	
	@Test(priority = 3,groups = "leaveTestcases")
	public void approveLeave() {
		System.out.println("approveLeave");
	}
	
	@Test(priority = 8,groups = "leaveTestcases")
	public void verifyLeaveHistory() {
		System.out.println("verifyLeaveHistory");
	}

	
	@Test(priority = 4, description = "this is create user functionality",groups = "smoke")
	public void createUSer() {
		System.out.println("createUSer");
	}

	@Test(priority = 5, enabled = true, description = "verify edit user functionality",groups = "smoke")
	public void editUser() {
		System.out.println("editUser");
	}

	@Test(priority = 6,groups = "smoke")
	public void deleteUser() {
		System.out.println("deleteUser");
	}

	@Test(priority = 7,groups = "smoke")
	public void logoutUser() {
		System.out.println("logoutUser");
	}
}
