package com.selenium.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoNonSelectTag {
	
	
	@Test
	public void selectDropdownValue() throws InterruptedException {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		//enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		
		//enter password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		
		//go to admin tab
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();
		
		Thread.sleep(3000);
		
		//click on dropdown list
		driver.findElement(By.xpath("//label[contains( text(), 'User Role')]/../following-sibling::div//i")).click();
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@role='listbox']/div"));
		
		System.out.println(li.size());
		
		for(WebElement el : li) {
			String val = el.getText();
			System.out.println(val);
			
			if(val.equalsIgnoreCase("ESS") ){
				el.click();
				Thread.sleep(3000);
//				break;
			}
		}
		
		
		
	}

}
