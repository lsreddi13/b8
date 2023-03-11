package com.chrome.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoChromev1 {

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		
//		open google page
//		
//		enter your name
//		clck search button 

	}

}
