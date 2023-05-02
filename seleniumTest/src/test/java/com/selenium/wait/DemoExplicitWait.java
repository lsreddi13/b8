package com.selenium.wait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoExplicitWait {
	@Test
	public void testExplicitWait() throws IOException, InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); -- this is for old version of selenium syntax

		driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(1)>div>div:nth-of-type(2)>input"))
				.sendKeys("Admin");
		driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(2)>div>div:nth-of-type(2)>input"))
				.sendKeys("admin123");
	
		
		
		WebElement el = driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(3)>button"));
		wait.until(ExpectedConditions.visibilityOf(el));
		
		el.click();
		//recruitment from the left navigation links
		WebElement req = driver.findElement(By.cssSelector("ul > li:nth-of-type(5) >a > span"));
		
		wait.until(ExpectedConditions.elementToBeClickable(req));
		
		
		boolean val = req.isDisplayed();
		if (val = true) {
			req.click();
		}
		
		//
		WebElement el2= driver.findElement(By.xpath("//label[contains(text(), 'Job Title')]/../following-sibling::div"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'Job Title')]/../following-sibling::div")));
		
		el2.click();

		
		WebElement el3 = 	driver.findElement(By.cssSelector("div[role='listbox'] > div:nth-of-type(25)"));
		wait.until(ExpectedConditions.elementToBeClickable(el3));
		el3.click();

		driver.navigate().to("http://omayo.blogspot.com/");
		
		WebDriverWait waitForAlert = new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.findElement(By.id("alert1")).click();
		waitForAlert.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

}
