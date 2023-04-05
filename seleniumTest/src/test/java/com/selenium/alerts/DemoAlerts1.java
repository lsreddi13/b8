package com.selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoAlerts1 {

	WebDriver driver;

	@Test(enabled = false)
	public void testSimpleAlert() throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

//			 
//			Alert a = driver.switchTo().alert();
//			a.accept();
//			a.dismiss();
//			a.sendKeys("dfasdF");
//			a.getText();

	}

	@Test
	public void testPromptAlert() throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Thread.sleep(3000);
		String text_PrmoptAlert = getTextFromPromptAlert();

		System.out.println(text_PrmoptAlert);
		Thread.sleep(3000);
		promtAlertSendText("sss");
		Thread.sleep(3000);
		clickAcceptAlert();

	}

	public void promtAlertSendText(String s) {
		driver.switchTo().alert().sendKeys(s);
	}

	public String getTextFromPromptAlert() {
		return driver.switchTo().alert().getText();

	}
	
	public void clickAcceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void clickDismissAlert() {
		driver.switchTo().alert().dismiss();
	}

}
