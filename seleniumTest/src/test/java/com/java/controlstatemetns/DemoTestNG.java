package com.java.controlstatemetns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {

	@Test
	public void openbrowser() {
		
		System.out.println("open browser and open applicaiton test case");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "dd");
	}

	@Test
	public void signInUser() {

		System.out.println("login user test case");

	}

	@Test
	public void signoutUser() {

		System.out.println("logout user test case");

	}

}
