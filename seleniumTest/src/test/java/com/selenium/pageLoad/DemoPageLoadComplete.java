package com.selenium.pageLoad;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoPageLoadComplete {

	@Test(enabled = true, description = "find the page is loaded or not.")
	public void fileUploadRobot() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();

		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("return document.readyState").toString().equals("complete");
		
		String t = j.executeScript("return document.readyState").toString();
		System.out.println(t);
		
		if(t.equalsIgnoreCase("complete")) {
			System.out.println("success");
		}
		else {
			System.out.println("not loaded.");
		}
		
		//how do you know 

	}

}
