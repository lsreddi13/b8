package com.java.strings;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCompareStringList {
	@Test
	public void test() throws InterruptedException {
		
		String str;
	
			
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to Url
		driver.get("https://fb.com");
		int count = 0;
		// Expected values in dropdown
		String[] values = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
		
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);

		WebElement dropdownElement = driver.findElement(By.id("month"));
		Select select = new Select(dropdownElement);
		// select.getoptions() returns all options belonging to select tag
		List<WebElement> options = select.getOptions();
		
		
		
		System.out.println("values.length " + values.length);
		System.out.println("options length " + options.size());

		for (WebElement option : options) {
			System.out.println("options : " + option.getText());
			for (int i = 0; i < values.length; i++) {
//				System.out.println("values[i]" +values[i]);
				if (option.getText().equals(values[i])) {
					count++;
				}
			}
		}
		if (count == values.length) {
			System.out.println("values matched..");
		} else {
			System.out.println("values not matched");
		}
	}

}
