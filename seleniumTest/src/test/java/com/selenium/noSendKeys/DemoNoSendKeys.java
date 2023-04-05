package com.selenium.noSendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoNoSendKeys {

	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://www.fb.com");
		
		
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("sasidhar");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		js.executeAsyncScript("arguments[0].value='Selenium'", name);
		
		//how to enter text into the input box without using sendkeys in selenium

	}
}
