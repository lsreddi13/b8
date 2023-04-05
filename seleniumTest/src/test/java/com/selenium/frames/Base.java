package com.selenium.frames;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

public class Base {

	public static WebDriver driver;
	public static final String USERNAME = "qatech2";
	public static final String AUTOMATE_KEY = "DbiqcZyzu4jxp6CaybN9";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@BeforeTest
	public void Base() throws IOException {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".//src//main//resources//config.properties");
		p.load(fis);
		String Browser = p.getProperty("Brw");
		switch (Browser) {
		case "Chrome":
			String driver_path = ".//BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driver_path);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.get("http://www.google.com");
			break;
		case "Firefox":
			String driver_path2 = ".\\BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driver_path2);
			ChromeOptions options3 = new ChromeOptions();
			options3.addArguments("start-maximized");
			options3.addArguments("--disable-notifications");
			driver = new ChromeDriver(options3);
			break;
		case "BrowserrStack":
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "80.0");
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("resolution", "1280x1024");
			caps.setCapability("name", "BrowserStackDemo1");

			driver = new RemoteWebDriver(new URL(URL), caps);
//			driver.get("http://www.google.com");

			break;
		default:

			break;
		}

	}

	public static void takeScreenshot(WebDriver driver) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		Files.copy(srcFile, new File(currentDir + "//screenshots//" + System.currentTimeMillis() + ".png"));
	}
}
