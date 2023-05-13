package com.selenium.CalendarDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoCalendarDate {
	WebDriver driver;

	@Test(enabled = true, description = "select date from Calendar widget")
	public void testSelectCalendarDate() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("return document.readyState").toString().equals("complete");

		driver.findElement(By.xpath("//div[contains(text(), 'Departure Date')]")).click();

		selectDate("May", "20");
		
		driver.findElement(By.xpath("//div[contains(text(), 'Return Date')]")).click();
		
		selectDate("May", "21");

	}

	public void selectDate(String month, String date) {
		String date_xpath = "//div[@class='css-1dbjc4n r-1euycsn']//div[@data-testid='undefined-month-" + month
				+ "-2023']//div[@data-testid='undefined-calendar-day-" + date + "']";
		driver.findElement(By.xpath(date_xpath)).click();

	}

}
