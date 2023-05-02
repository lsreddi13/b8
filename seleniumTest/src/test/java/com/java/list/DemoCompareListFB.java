package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoCompareListFB {
	WebDriver driver;

	@Test
	public void testCompareListMonths() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		try {

			List<String> exp_monthList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
					"Oct", "Nov", "Dec");

			List<String> act_monthList = new ArrayList<String>();
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(4000);

			List<WebElement> li = driver.findElements(By.xpath("//select[@id='month']/option"));
//			System.out.println("act ::");
			for (WebElement we : li) {
				act_monthList.add(we.getText());
//				System.out.println(we.getText());
			}

//			System.out.println("Exp::");
//			for (int i = 0; i < exp_monthList.size(); i++) {
//
//				System.out.println(exp_monthList.get(i));
//			}

			// compare two arraylist size same then it will compare valueseach one by one
			if (exp_monthList.size() == act_monthList.size()) {
				for (int i = 0; i < exp_monthList.size(); i++) {
					if (act_monthList.get(i).equals(exp_monthList.get(i))) {
						System.out.println("same");
					} else {
						System.out.println(
								"not same -- " + exp_monthList.get(i) + " and act value : " + act_monthList.get(i));
					}
				}
			}

			if (exp_monthList.equals(act_monthList)) {
				System.out.println("Correct month names displayed.");
			} else {
				System.out.println("month names are not displayed correctly.");
			}
		} catch (Exception e) {
			System.out.println("error : " + e);
		}

	}

}
