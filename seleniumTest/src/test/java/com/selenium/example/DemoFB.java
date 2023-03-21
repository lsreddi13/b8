package com.selenium.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoFB {
	WebDriver driver;

	@Test
	public void loginFlow() throws IOException {

		FileReader fr = new FileReader(".//config2.properties");
		Properties prop = new Properties();
		prop.load(fr);
		String url = prop.getProperty("url2");
		String username = prop.getProperty("name2");
		String pwd = prop.getProperty("pwd2");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get(url);
		enterEmail(username);
		enterpassword(pwd);
		clickLogin();

	}

	@Test
	public void loginFlow2() throws IOException {

		FileReader fr = new FileReader(".//config2.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println("user name " + prop.getProperty("name2"));
		String url = prop.getProperty("url2");
		String username = prop.getProperty("name2");
		String pwd = prop.getProperty("pwd2");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get(url);
		enterEmail("sasi");
		enterpassword("sasi123");
		clickLogin();

		String expectedTtitle = "Sasidhar Facebook";
		String actualTtitle = printTitle();
		Assert.assertEquals(actualTtitle, expectedTtitle, "title mismatched");
	}

	public String printTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void enterEmail(String str1) {
		driver.findElement(By.id("email")).sendKeys(str1);
	}

	public void enterpassword(String str1) {
		driver.findElement(By.id("pass")).sendKeys(str1);
	}

	public void clickLogin() {
		WebElement el = driver.findElement(By.name("login"));
		boolean val = el.isEnabled();
		if(val == true) {
		el.click();
		}else {
			System.out.println("button is not clickable");
		}
	}

}
