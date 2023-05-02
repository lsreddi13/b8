package com.selenium.UploadFile;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoUploadFile {

	WebDriver driver;

	@Test
	public void printBrokenLink() throws InterruptedException, MalformedURLException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(5000);

		String filePath = "";
		WebElement uploadBtn = driver.findElement(By.id("uploadfile_0"));
		
		uploadBtn.sendKeys("C:\\Users\\Lenovo\\OneDrive\\Documents\\RTM.png");
		
//		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Lenovo\\OneDrive\\Desktop\\bug1.png");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("submitbutton")).click();

		Thread.sleep(3000);
		String outputValue = driver.findElement(By.id("res")).getText();
		System.out.println(outputValue);

	}

}
