package com.selenium.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoWindows1 {

	@Test
	public void testWindows() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver = new ChromeDriver();
		String Url = "https://digg.com/";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Url);

		String main = driver.getWindowHandle();
		WebElement x = driver.findElement(By.xpath("//main[1]//header//h1"));
		x.click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> It = handle.iterator();
		while (It.hasNext()) {
			String next = It.next();
			if (!main.equals(next)) {
				driver.switchTo().window(next);
				System.out.println("after switching to child window : " + driver.getCurrentUrl());
				System.out.println("after switching to child window :  " + driver.getTitle());
				driver.close();

			}
			driver.switchTo().defaultContent();
		}
		// main window
//		
		System.out.println("after switching to main window : " + driver.getCurrentUrl());
		System.out.println("after switching to main window :  " + driver.getTitle());

//		WebElement select = driver.findElement(By.cssSelector(".js_starterpost>div>div>div>div>div"));
//		System.out.println(select.getText());
//		WebElement finalword = driver.findElement(By.cssSelector(".js_starterpost>div>div>div>div>div>div>a"));
//		System.out.println(finalword.getText());
	}

}
