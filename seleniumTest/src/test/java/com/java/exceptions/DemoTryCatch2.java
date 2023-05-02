package com.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTryCatch2 {

	@BeforeClass
	public void setUp() {
		WebDriver driver = new ChromeDriver();

		driver.get("open application login page");
	}
WebDriver driver;
	@Test
	public void testLogin()    {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("");
		//Copy file at destination
		try {
			FileUtils.copyFile(src, DestFile);
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			throw new ArithmeticException("Person is not eligible to vote");
			// enter email

			// enter pass

			// click login

			// check home page is displayed or not

			// click logout -- failed here logout link is not displayed.

			// check login page is displayed or not
		} catch (ElementNotInteractableException e) {// punch

			System.out.println("error displayed : " + e);

		} catch (StaleElementReferenceException e) {// oil

			System.out.println("error displayed : " + e);

		} catch (NoSuchElementException e) {// break wire

			System.out.println("error displayed : " + e);

		} catch (NoAlertPresentException e) {// clutch

			System.out.println("error displayed : " + e);

		} catch (ArithmeticException e) {

			System.out.println("error displayed : " + e);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// write code to remove cookies and navigate to login page.

		}

	}

	@Test
	public void testCreateUser() {
//		throw new ArithmeticException("Person is not eligible to vote");    
		throw new NullPointerException("Person is not eligible to vote");    
		// enter email

		// enter pass

		// click login

		// check home page is displayed or not

		// go to admin tab

		// create new user

		// check user is crated or not

		// logout

	}

}
