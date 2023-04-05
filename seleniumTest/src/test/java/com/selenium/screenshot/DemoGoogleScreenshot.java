package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoGoogleScreenshot {

	@Test
	public void testScreenshots() throws IOException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		File pagescreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pagescreen, new File(".//screenshots//page1.png"));
		
		
		WebElement googleInput = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		
		
		File s2 = googleInput.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s2, new File(".//screnshots//s2.png"));
		
		
	}

}
