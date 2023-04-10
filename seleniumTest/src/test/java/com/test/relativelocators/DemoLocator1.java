package com.test.relativelocators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class DemoLocator1 {

	@Test
	public void testRelativeLocator1() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		WebElement user_name_ele= driver.findElement(By.name("username"));

		driver.findElement(RelativeLocator.with(By.name("password")).below(user_name_ele)).sendKeys("ddd");
//	    txtEmailLabel.sendKeys("email@email.com");

		
		driver.findElement(By.cssSelector(".btn-primary.btn-lg.col-md-3.custom-btn-amp-events")).click();
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("dfasdf");
		driver.findElement(By.cssSelector("#email")).sendKeys("dfasdf");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("dfasdf");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("dfasdf");
		
		//ul/li[1]
		
		
//		matching attributes
//		Logged in as sasidhar
//		Logged in as karthik
//		Logged in as suseela
//		Logged in as divya
		
//		suffix - if the meatching cahracters or words at the end of the string
//		input[value$='ToGetAlert']
//		Prefix - if the meatching cahracters or words at the starting of the string
//				input[value^='ToGetAlert']
						//substring - if the matching characters or words anywhere in the string.
//						input[value*='ToGetAlert']
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
