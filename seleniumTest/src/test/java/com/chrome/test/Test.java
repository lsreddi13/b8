package com.chrome.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Test {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		String url = "https:/browserstack.com";

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Locating the element 

		WebElement e = driver.findElement(By.id("signupModalButton"));

		// using getText method the retrieve the text of the element

		System.out.println("button name =" + e.getText());

		
		
		driver.quit();

	}
}
