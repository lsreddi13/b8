package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParameterization {

	@Parameters({ "url" })
	@Test(priority = 0)
	public void setUp(String s1) {
		System.out.println("application url   -- " + s1);

	}

	@Parameters({ "username1", "password1" })
	@Test(priority = 1)
	public void testLogin(@Optional("divya") String s1, @Optional("divya123") String s2) {
		System.out.println("user name  -- " + s1);
		System.out.println("password   -- " + s2);
		Assert.assertEquals(true, true);

	}
	
	@Parameters({ "username2", "password2" })
	@Test(priority = 1)
	public void testLogin2(@Optional("divya") String s1, @Optional("divya123") String s2) {
		System.out.println("user name  -- " + s1);
		System.out.println("password   -- " + s2);

	}

	

}
