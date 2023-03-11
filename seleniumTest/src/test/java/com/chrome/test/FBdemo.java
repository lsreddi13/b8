package com.chrome.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBdemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		
		
		WebElement email_ele   = driver.findElement(By.id("email"));
		
		WebElement pwd_ele   = driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi"));
		
		WebElement loginBtn_ele = driver.findElement(By.name("login"));
		
		WebElement btn_ele = driver.findElement(By.tagName("button")); 
		
		
		
//		WebElement forgotPasswordLink_ele2 = driver.findElement(By.partialLinkText("Forgotten"));
		
		
		Thread.sleep(3000);
		
		email_ele.clear();
		email_ele.sendKeys("dd");
		pwd_ele.clear();
		pwd_ele.sendKeys("mypwd");
		btn_ele.click();
//		loginBtn_ele.click();
		WebElement forgotPasswordLink_ele = driver.findElement(By.linkText("Forgotten password ?"));
		
//		forgotPasswordLink_ele.click();
//		forgotPasswordLink_ele2.click();
		
		
	}
	
	
	
}
