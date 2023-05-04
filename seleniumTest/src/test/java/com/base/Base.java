package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base {

	public static WebDriver driver;

	public static Properties prop;
	public static WebDriverWait wait;
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports extent;

	public static ExtentTest parentTest;
	public static ExtentTest childTest;

	public Base() { // constructor
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//config2.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// crate an object for extenthtmlreporter and pass the argument as filename
	@BeforeSuite
	public void setUpReports(ITestContext context) {
		htmlreport = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\results\\Test.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		extent.setSystemInfo("OS", "Windows 11");
		htmlreport.config().setChartVisibilityOnOpen(false);
		htmlreport.config().setDocumentTitle("Smoke Test");
		htmlreport.config().setReportName("sasi");
		htmlreport.config().setTheme(Theme.STANDARD);

	}

	@AfterSuite
	public void closeReport() {
		extent.flush();
		driver.close();
	}
	
	public static void takeScreenshot(WebElement we, String name) throws IOException {
		File scrFile = we.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(".\\screenshots\\" + name + ".png"));
	}

	public static void takeScreenshot(WebDriver driver, String filename) throws IOException {
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(".\\screenshots\\" + filename + ".png"));
	}

	public static void setUp() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

}
