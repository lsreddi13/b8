package com.selenium.mousehover;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoTooltip {
	@Test
	public void testTooltip() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		String baseUrl = "https://demo.guru99.com/test/social-icon.html";

		driver.get(baseUrl);
		Thread.sleep(5000);
		Actions ac = new Actions(driver);

		WebElement github = driver.findElement(By.xpath("//*[@class='socialbtns']/div/a[4]"));
		ac.moveToElement(github).build().perform();
		String actualTooltip = github.getAttribute("title");
		System.out.println( actualTooltip);

	}
}