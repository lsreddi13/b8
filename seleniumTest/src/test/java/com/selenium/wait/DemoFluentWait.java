package com.selenium.wait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoFluentWait {
	@Test
	public void testExplicitWait() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		// fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.cssSelector(".oxd-form >div:nth-of-type(1)>div>div:nth-of-type(2)>input")));
		driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(1)>div>div:nth-of-type(2)>input"))
				.sendKeys("Admin");
		driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(2)>div>div:nth-of-type(2)>input"))
				.sendKeys("admin123");

		WebElement el = driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(3)>button"));

		wait.until(ExpectedConditions.elementToBeClickable(el));

		el.click();
		// recruitment from the left navigation links
		
		WebElement req = driver.findElement(By.cssSelector("ul > li:nth-of-type(5) >a > span"));

		wait.until(ExpectedConditions.elementToBeClickable(req));

		boolean val = req.isDisplayed();
		if (val = true) {
			req.click();
		}

		//
		WebElement el2 = driver
				.findElement(By.xpath("//label[contains(text(), 'Job Title')]/../following-sibling::div"));

		el2.click();

		WebElement el3 = driver.findElement(By.cssSelector("div[role='listbox'] > div:nth-of-type(25)"));
		el3.click();

		driver.navigate().to("http://omayo.blogspot.com/");

		driver.findElement(By.id("alert1")).click();
		driver.switchTo().alert().accept();
	}

}
