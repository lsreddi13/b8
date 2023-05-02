package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {

	@BeforeClass
	public void setUp() {
		System.out.println("open browser ");
	}
	
	@BeforeMethod
	public void applaunch() {
		System.out.println(" launch applicaiton");
	}

	@AfterClass
	public void close() {
		System.out.println("close the browser");
	}
//user data provider from same class
	@Test(priority = 1, dataProvider = "testdata1", enabled = false)
	public void testLogin(String s1, String s2) {

		System.out.println("username  -- " + s1);
		System.out.println("password   -- " + s2);
		System.out.println("i am going to logout heere..");

	}
	//user the dataprovider from another class
	@Test(priority = 1, dataProvider = "testdata2", dataProviderClass = DemoDumpDataProvider.class)
	public void testLogin2(String s1, int s2, String s3, String s4) {

		System.out.println("username  -- " + s1);
		System.out.println("exp   -- " + s2);
		System.out.println("contact  -- " + s3);
		System.out.println("location   -- " + s4);
		System.out.println("i am going to logout heere..");

	}

	

	@DataProvider(name = "testdata1")
	public Object[][] createData1() {
		return new Object[][] { { "karthik", "karthik123" }, { "divya", "divya123" }, { "suseela", "susela123" },
				{ "sasi", "sasi123" } };
	}

}
