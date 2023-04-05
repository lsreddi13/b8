package com.selenium.windows;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowTest extends Base {
	public static void main(String[] args) throws InterruptedException {
		WindowTest ft = new WindowTest();
		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(3000);

		String parent = driver.getWindowHandle();
//	System.out.println("parent widnnow : "+parent);
//	System.out.println("url : "+driver.getCurrentUrl());
//	System.out.println("title : "+driver.getTitle());

		driver.findElement(By.xpath("//tr//font//a[1]")).click();
		driver.findElement(By.xpath("//tr//font//a[2]")).click();
		driver.findElement(By.xpath("//tr//font//a[3]")).click();
		Thread.sleep(3000);
		Set<String> handler = driver.getWindowHandles();

		for (String child : handler) {
			driver.switchTo().window(child);
			System.out.println("url  : " + driver.getCurrentUrl());
			System.out.println("title  : " + driver.getTitle());
			driver.close();
		}

		System.out.println("browser closed.");

	}
}
