package com.selenium.windows;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class DemoWindow2 {
	@Test
	public void test() throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
//		String url = "https://digg.com/";
		String url = "https://www.naukri.com/";
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver.findElement(By.xpath("//main[1]//header//h1")).click();
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='premium-swiper-wrap']//h3"));
		
		for (WebElement link : li) {
//			link.click();
			String sd = link.getText();
			System.out.println(sd);
			
	          js.executeScript("window.scrollBy(0,10)");     
			
		}
		
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String windowID = itr.next();
			driver.switchTo().window(windowID);
			Thread.sleep(3000);
			driver.close();
		}

	}
	
}
