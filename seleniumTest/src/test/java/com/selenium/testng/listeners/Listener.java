package com.selenium.testng.listeners;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bouncycastle.crypto.tls.CertificateStatusRequest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.base.Base;

public class Listener extends Base implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takeScreenshot(driver, result.getName() + "-" + timeDisplay());
			childTest.log(Status.PASS, "this test case passed.");
			String path1 = System.getProperty("user.dir") + "//screenshots//" + result.getName() + "-" + timeDisplay()
					+ ".png";
			childTest.addScreenCaptureFromPath(path1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takeScreenshot(driver, result.getName() + "-" + timeDisplay());
			childTest.log(Status.FAIL, "this test case failed.");
			String path = System.getProperty("user.dir") + "//screenshots//" + result.getName() + "-" + timeDisplay()
					+ ".png";
			childTest.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("i am onTestSkipped - " + result.getName() + " - " + timeDisplay());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println("i am onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("i am onStart " + context.getName() + " - " + timeDisplay());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("i am onFinish - " + context.getName() + " - " + timeDisplay());
		extent.flush();
		
	}

}
