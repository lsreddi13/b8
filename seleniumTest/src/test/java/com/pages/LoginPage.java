package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.base.Base;

public class LoginPage extends Base {

	WebElement emailID = driver.findElement(By.name("username"));
//	@FindBy(name = "username")
//	WebElement emailID;
	
	// enter username
	WebElement pwd = driver.findElement(By.name("password"));
	// enter username
	WebElement loginBtn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(pwd));
//    
	
//	public LoginPage() {
//		PageFactory.initElements(driver, this);
//	}
	public void enterEmail(String n) {
		wait.until(ExpectedConditions.visibilityOf(emailID));
		emailID.sendKeys(n);

	}
	public void enterPassword(String p) {
		
		pwd.sendKeys(p);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
}
