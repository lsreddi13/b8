package com.chrome.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Example {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		String title = driver.getTitle();
		System.out.println(title);

		WebElement textBox = driver.findElement(By.name("my-text"));
		textBox.sendKeys("Selenium");

		WebElement submitButton = driver.findElement(By.cssSelector("button"));
		submitButton.click();

		WebElement message = driver.findElement(By.id("message"));
		String value = message.getText();
		System.out.println(value);

		driver.quit();

	}
}
