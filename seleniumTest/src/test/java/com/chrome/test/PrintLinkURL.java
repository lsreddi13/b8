package com.chrome.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * print forgot password link url from the facebook login page
 * 
 */
public class PrintLinkURL {
	public static void main(String[] args) {
//
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		//
		driver.get("https://www.facebook.com/");

		//print forgot password link url
		WebElement forgotPwd_Link = driver.findElement(By.linkText("Forgotten password?"));
		String actual_forgotPwd_url = forgotPwd_Link.getAttribute("href");
		System.out.println(actual_forgotPwd_url);

		// print email id inputbox place holder value
		WebElement email_input = driver.findElement(By.id("email"));
		String actual_email_input_placeholder = email_input.getAttribute("placeholder");

		System.out.println(actual_email_input_placeholder);
		
		//print text value by using getText
		
		

	}
}
