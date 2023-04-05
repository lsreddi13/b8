package com.selenium.mousehover;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoMouseHover {
	@Test
	public void tsetMouseHover() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		WebElement Company_header_link = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/ul/li/a[contains(text(), 'Company')]"));
		
		WebElement Resource_header_link = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/ul/li/a[contains(text(), 'Resources')]"));
		
		
		Actions ac = new Actions(driver);
		ac.moveToElement(Company_header_link).build().perform();
		
		Thread.sleep(3000);
		ac.moveToElement(Resource_header_link).build().perform();
		
		//click and hold
		//drag and drop
		//right click ( context click)
		//key down and key up
		//scroll down/up or till webelement
		
		
		Thread.sleep(3000);
		
	}
}