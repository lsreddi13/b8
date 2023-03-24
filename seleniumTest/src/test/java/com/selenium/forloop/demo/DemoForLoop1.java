package com.selenium.forloop.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoForLoop1 {

	
	@Test
	public void printMonthsFromJanOCT() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[starts-with(@id,\"u_0_\")]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> li = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		System.out.println("number of monyths available in the month list : "+ li.size());
		
		//print month names from jan to oct
		for(int i=1; i<=li.size(); i++) {
			String monthName = driver.findElement(By.xpath("//select[@id=\"month\"]/option["+i+"]")).getText();
		
			System.out.println(monthName);
			
			if(monthName.equalsIgnoreCase("Oct")) {
				break;
			}
		}
		System.out.println("print month names from oct to dec ");
		
		for(int i=1; i<=li.size(); i++) {
			String monthName = driver.findElement(By.xpath("//select[@id=\"month\"]/option["+i+"]")).getText();
		
//			System.out.println(monthName);
			if(monthName.equalsIgnoreCase("Feb")) {
				String monthNumber = driver.findElement(By.xpath("//select[@id=\"month\"]/option["+i+"]")).getAttribute("value");
				
				int month_number = Integer.parseInt(monthNumber);
				
				for(int j = month_number; j<=li.size(); j++) {
					String filter2 = driver.findElement(By.xpath("//select[@id=\"month\"]/option["+j+"]")).getText();
					
					System.out.println(filter2);
					if(filter2.equalsIgnoreCase("Sep")) {
						break;
					}
				}
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
