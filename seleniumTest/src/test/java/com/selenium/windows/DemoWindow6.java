package com.selenium.windows;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoWindow6 {

	@Test
	public void test() throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		System.out.println("parent window : " + parent);
		assert driver.getWindowHandles().size() == 4;
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("print number of windows opened : " + s1.size());
		// Loop through until we find a new window handle
		for (String windowHandle : s1) {
			if (!parent.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);

				driver.manage().window().maximize();
				Thread.sleep(2000);
				// print child window title
				System.out.println("child window id : " + windowHandle);
				System.out.println("child winow title : " + driver.getTitle());
				System.out.println("child winow url : " + driver.getCurrentUrl());
				System.out.println("-------------------");
			}
			driver.close();
		}
		driver.quit();
	}
}
