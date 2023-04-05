package com.selenium.windows;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demowindow8 extends Base {

	@Test
	public void tsetMouseHover() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");

		WindowTest ft = new WindowTest();
		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//tr//font//a[1]")).click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parent = it.next();
		System.out.println("Parent : " + parent);
		String child = it.next();
		System.out.println("Child : " + child);
		driver.switchTo().window(child);
		System.out.println("child title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("parent title : " + driver.getTitle());
		driver.close();
	}

}
