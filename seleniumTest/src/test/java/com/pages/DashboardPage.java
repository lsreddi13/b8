package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.base.Base;

public class DashboardPage extends Base {

	
	WebElement profileIcon_ele = driver.findElement(By.xpath("//div/ul/li[@class='oxd-userdropdown']"));
	

	WebElement pageHeader_ele = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-title']/span/h6")); 

	public void clickProfileIcon() {
		wait.until(ExpectedConditions.visibilityOf(profileIcon_ele));
		profileIcon_ele.click();
	}
	

	
	public String getPageHeader() {
		wait.until(ExpectedConditions.visibilityOf(pageHeader_ele));
		String pageHeaderTxt = pageHeader_ele.getText();
		return pageHeaderTxt;
	}
}
