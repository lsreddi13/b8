package com.selenium.testng.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoAddCookies {

	@Test
	public void testDemoCookies() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		
	        try {
	            driver.get("http://www.fb.com");
	            driver.manage().addCookie(new Cookie("sasi", "testqa"));

	            // Get cookie details with named cookie 'foo'
	            Cookie cookie1 = driver.manage().getCookieNamed("foo");
	            System.out.println(cookie1);
	        } finally {
//	            driver.quit();
	        	System.out.println("hello");
	        }
	}
	
	
}
