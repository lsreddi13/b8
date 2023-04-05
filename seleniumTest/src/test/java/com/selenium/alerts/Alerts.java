package com.selenium.alerts;

import org.openqa.selenium.WebDriver;

public class Alerts {
	public void promtAlertSendText(String s, WebDriver driver) {
		driver.switchTo().alert().sendKeys(s);
	}

	public String getTextFromPromptAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();

	}

	public void clickAcceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void clickDismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
}
