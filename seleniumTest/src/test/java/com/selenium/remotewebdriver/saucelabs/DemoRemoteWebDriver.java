package com.selenium.remotewebdriver.saucelabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoRemoteWebDriver {

	@Test
	public void testDemoRemoteWebDriver() throws MalformedURLException, InterruptedException {

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");

		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("build", "selenium-build-K3SS7");
		sauceOptions.put("name", "demo smoke test");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL(
				"https://oauth-testautomation2498-89c5d:6c827b83-50b5-4676-8df0-2f2a42b846dd@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

		/*
		 * SafariOptions browserOptions = new SafariOptions();
		 * browserOptions.setPlatformName("macOS 13");
		 * browserOptions.setBrowserVersion("16"); Map<String, Object> sauceOptions =
		 * new HashMap<>(); sauceOptions.put("build", "release13.4");
		 * sauceOptions.put("name", "smoketest on mac");
		 * browserOptions.setCapability("sauce:options", sauceOptions);
		 * 
		 * URL url = new URL(
		 * "https://oauth-testautomation2498-89c5d:6c827b83-50b5-4676-8df0-2f2a42b846dd@ondemand.eu-central-1.saucelabs.com:443/wd/hub"
		 * ); RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		 */

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// click login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Thread.sleep(3000);

		// go to admin tab
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();

//		Thread.sleep(3000);
//		webTableClickDeleteButtonx("Chenzira.Chuki");
//		Thread.sleep(4000);
//		Alerts dd = new Alerts();
//		driver.switchTo().alert().accept();
		driver.close();

	}

	public void webTableClickDeleteButtonx(String empName) {
		System.out.println("hello");
//		WebElement checkbox = driver
//				.findElement(By.xpath("//div[@class='oxd-table-body']/div/div/div[2]/div[contains(text(), '" + empName
//						+ "')]/../../div[6]//button[1]"));
//		checkbox.click();

	}
}
