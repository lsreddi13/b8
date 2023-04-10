package com.selenium.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNGAnnotations {

	// order of the testng annotations
//	@BeforeSuite
//	@BeforeTest
	
//	@BeforeClass
//	@BeforeMethod
//	@Test - method level annotation
//	@AfterMethod
//	@AfterClass
	
//	@AfterTest
//	@AfterSuite

	
	//	@Parameter
//	@DataProvider
//	@Listeners
	WebDriver driver;

	// launch orange hrm application and login as admin user
	@Test
	public void testTestAnnotation1() {
		System.out.println("I am test annotation1");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement el = driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(3)>button"));
		wait.until(ExpectedConditions.visibilityOf(el));
		// enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// click login button
		el.click();
		WebElement req = driver.findElement(By.cssSelector("ul > li:nth-of-type(5) >a > span"));

		wait.until(ExpectedConditions.elementToBeClickable(req));

	}

	// launch fb application and go to create account page then select male option
	// in gender
	@Test
	public void testTestAnnotation2() {
		System.out.println("I am test annotation2");
		driver.get("http://www.fb.com");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement el = driver.findElement(By.xpath("//a[starts-with(@id,\"u_0_\")]"));
		wait.until(ExpectedConditions.visibilityOf(el));

		el.click();

		WebElement e = driver.findElement(By.xpath("//label[contains(text(), 'Male')]"));

		if (e.isSelected() == false) {
			System.out.println("radio button notseleted...so iam going to select");
			e.click();
		} else if (e.isSelected() == true) {
			System.out.println("radio button already selected.");
		}
	}

	// launch browser and maximize the browser
	@BeforeMethod
	public void testBeforeMethodAnnotation() {
		System.out.println("Hey i am BeforeMethod");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	// closing the browser
	@AfterMethod
	public void testAfterMethodAnnotation() {
		System.out.println("Hey i am AfterMethod");
//		driver.close();
	}
}
