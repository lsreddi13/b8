package com.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIframe {
	public static void main(String[] args) {
		// set the location of chrome browser from the local machine path
		WebDriverManager.chromedriver().setup();

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Navigate to the demo site
		driver.get("https://www.quackit.com/html/examples/frames/");

		// Number of Frames on a Page
		int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames on a Page:" + countIframesInPage);

		// Locate the frame1 on the webPage
//        WebElement frame1=driver.findElement(By.id("frame1"));

		// Switch to Frame1
		driver.switchTo().frame(0);

		// Locate the Element inside the Frame1
		WebElement frame1Element = driver.findElement(By.tagName("eser"));

		// Get the text for frame1 element
		String frame1Text = frame1Element.getText();
		System.out.println("Frame0 is :" + frame1Text);

		// Number of Frames on a Frame1
		int countIframesInFrame1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames inside the Frame0:" + countIframesInFrame1);

		// switch to child frame
		driver.switchTo().frame(0);

		int countIframesInFrame2 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames inside the Frame0:" + countIframesInFrame2);

		driver.close();
	}
}
