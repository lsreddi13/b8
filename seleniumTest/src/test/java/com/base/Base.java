package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
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

	public String timeDisplay() {
		DateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy hh.mm");
		String dateString2 = dateFormat2.format(new Date()).toString();
		return dateString2;
	}
	
	@AfterSuite
	public void closeBrowsers() {
		driver.quit();
	}
	@BeforeSuite
	public void beforeStartTestSuite() {
		System.out.println("this is before suire for reports");
		htmlreport = new ExtentHtmlReporter(System.getProperty("user.dir") + "//results//Testresult"+timeDisplay()+".html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		extent.setSystemInfo("OS", "Windows 11");
		htmlreport.config().setChartVisibilityOnOpen(false);
		htmlreport.config().setDocumentTitle("Result report Test");
		htmlreport.config().setReportName("sasi");
		htmlreport.config().setTheme(Theme.STANDARD);
	}

	public static void takeScreenshot(WebElement we, String name) throws IOException {
		File scrFile = we.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "//screenshots//" + name + ".png"));
	}

	public static void takeScreenshot(WebDriver driver, String filename) throws IOException {
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(System.getProperty("user.dir") + "//screenshots//" + filename + ".png"));
	}

	public static void setUp() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("i am from base1");

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("i am from base2");

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("i am from base3");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("i am from base4");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("i am from base5");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("i am from base6");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("i am from base7");
	}

}
