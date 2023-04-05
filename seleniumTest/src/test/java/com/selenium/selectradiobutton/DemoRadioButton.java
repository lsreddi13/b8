package com.selenium.selectradiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoRadioButton {
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[starts-with(@id,\"u_0_\")]")).click();
		
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//label[contains(text(), 'Male')]"));
		
		if(e.isSelected()==false) {
			System.out.println("radio button notseleted...so iam going to select");
			e.click();
		}else if(e.isSelected()==true) {
			System.out.println("radio button already selected.");
		}
		//click on radio button
//		selectRadio("Female");
//		selectRadio("Male");
		
		
//		boolean value = driver.findElement(By.xpath("//label[contains(text(), 'Male')]")).isSelected();
//		if(value==true) {
//			System.out.println("Radio button is selected.");
//		}else if(value ==false) {
//			System.out.println("Radio button is not selected.");
//		}else {
//			System.out.println("some thing wrong");
//		}
	}
	
	public void selectRadio(String gender) {
		driver.findElement(By.xpath("//label[contains(text(), '"+gender+"')]")).click();
	}
	
	
	
	
	
}
