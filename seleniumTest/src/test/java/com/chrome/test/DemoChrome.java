package com.chrome.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DemoChrome {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement searchBox_ele = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		searchBox_ele.sendKeys("Sandya");
		
		//maximize the browser
		driver.manage().window().maximize();
		//minimize the browser
		driver.manage().window().minimize();
		
		
		
		
//		driver.close();
		
		

	}

}
