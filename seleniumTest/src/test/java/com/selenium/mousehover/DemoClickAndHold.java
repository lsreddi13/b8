package com.selenium.mousehover;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoClickAndHold {
	@Test
	public void testClickAndHold() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		 WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
		 WebElement titleB = driver.findElement(By.xpath("//li[text()= 'B']")); 
		
		Actions ac = new Actions(driver);
		
		
		Thread.sleep(3000);
//		ac.moveToElement(titleC).clickAndHold().perform(); 

		ac.dragAndDrop(titleC, titleB).build().perform();
		
		
		//click and hold
		//drag and drop
		//right click ( context click)
		//key down and key up
		//scroll down/up or till webelement
		
		
		Thread.sleep(3000);
		
	}
}