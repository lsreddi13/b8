package com.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrame4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/guru99home/");

		System.out.println("Main window page title : " + driver.getTitle());
		// how many frame in the webpage
//		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		int numberOfFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("frames count : " + numberOfFrames);

		
//		 driver.switchTo().frame(0);
//		 System.out.println("frame title : "+ driver.getTitle());
		 
		 System.out.println("frame name : "+  driver.switchTo().frame(0).getTitle());
		 
		/*
		 * driver.switchTo().frame(0); driver.switchTo().parentFrame();
		 * 
		 * driver.switchTo().frame("webelement");
		 * 
		 * driver.switchTo().frame("frame name"); driver.switchTo().frame("frame id");
		 * 
		 * driver.switchTo().defaultContent(); // main window
		 */
	}
}
