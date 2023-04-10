package com.test.relativelocators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class Test1RelativeLocators {
	@Test
	public void testRelativeLocator1() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		String url = "http://omayo.blogspot.com/";
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(url);

		WebElement pwdEle = driver.findElement(By.xpath("//form[@name='form1']//input[@type='password']"));
		
		
		By buttonEle = RelativeLocator.with(By.tagName("button")).near(pwdEle);
		
		By buttonEle2 = RelativeLocator.with(By.tagName("a")).near(pwdEle);
		
		String buttonValue = driver.findElement(buttonEle).getAttribute("value");
		
		String buttonValue2 = driver.findElement(buttonEle2).getAttribute("href");
		System.out.println(buttonValue + " ----  this is button value text");
		System.out.println(buttonValue2 + " ----  this is button value text");
		
		/*
		 * WebElement loginBtn =
		 * driver.findElement(By.xpath("//input[@value='Login']"));
		 * 
		 * By cancelBtn = RelativeLocator.with(By.tagName("input")).toRightOf(loginBtn);
		 * 
		 * driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("sasidhar");
		 * Thread.sleep(5000);
		 * 
		 * // driver.findElement(cancelBtn).click();
		 * 
		 * driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(
		 * loginBtn)).click();
		 */
	}

}
