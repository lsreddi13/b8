package com.selenium.testng;

import org.testng.annotations.DataProvider;

public class DemoDumpDataProvider {

	@DataProvider(name = "testdata2")
	public Object[][] test123() {
		Object[][] ss = new Object[][] { 
			{ "karthik", 5, "777676666", "hyd" }, 
			{ "divtya", 6, "888788776", "blr" },
			{ "suseela", 4, "234354544", "Chennai" } };
		return ss;
	}

}
