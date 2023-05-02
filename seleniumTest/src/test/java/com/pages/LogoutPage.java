package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.base.Base;

public class LogoutPage extends Base {

	WebElement logout_ele = driver.findElement(By.xpath("//div//ul[@class='oxd-dropdown-menu']/li[4]"));

	public void clickLogout() {
		wait.until(ExpectedConditions.visibilityOf(logout_ele));
		logout_ele.click();
	}

}
