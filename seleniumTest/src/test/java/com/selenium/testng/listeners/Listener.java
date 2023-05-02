package com.selenium.testng.listeners;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public String timeDisplay() {
		DateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy hh.mm aa");
		String dateString2 = dateFormat2.format(new Date()).toString();
		return dateString2;
	}

	@Override
	public void onTestStart(ITestResult result) {
//		System.out.println("I am onTestStart");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
//		System.out.println("i am onTestSuccess");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("i am onTestFailure -- " + result.getName() +" - "+ timeDisplay());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("i am onTestSkipped - " + result.getName() +" - "+ timeDisplay());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println("i am onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("i am onStart "+ context.getName() +" - "+ timeDisplay());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("i am onFinish - " + context.getName() +" - "+ timeDisplay());

	}

}
