package com.java.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoMapFB {
	WebDriver driver;

	@Test
	public void testCompareListMonths() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		try {

			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(4000);

			List<WebElement> li = driver.findElements(By.xpath("//select[@id='month']/option"));
			HashMap<Integer, String> map_month = new HashMap<Integer, String>();

			for(int i=0; i<li.size(); i++) {
				
				map_month.put(i+1, li.get(i).getText());
			}
			
			for (Map.Entry m : map_month.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
			
			
		} catch (Exception e) {
			System.out.println("error " + e);
		}
	}

}
