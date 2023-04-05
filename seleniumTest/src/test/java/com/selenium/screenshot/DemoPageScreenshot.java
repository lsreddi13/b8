package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoPageScreenshot {
	static WebDriver driver;

	@Test
	public void test() throws InterruptedException, IOException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		File f = new File(".//fullscreen.png");
		File srcF = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcF, f);
//		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(".//abc.png"));
		
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		
		File screen2 = loginBtn.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen2, new File(".//loginButton.png"));
		
		
		
		WebElement userNameInputBox = driver.findElement(By.name("username"));
		
		
		File screen3 = userNameInputBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen3, new File(".//username.png"));
		String url = "https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=17966155065046489609&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062131&hvtargid=kwd-10573980&hydadcr=14453_2316415";
		driver.navigate().to(url);
		
		WebElement off = driver.findElement(By.xpath("//div[@id='desktop-grid-3']"));
		
		File offerscreen_amazon = off.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(offerscreen_amazon, new File(".//amazonOfferScreenElement.png"));
		
		
	}

	/*
	 * public static void takeScreenshot(WebElement we, String name) throws
	 * IOException { File scrFile = we.getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(scrFile, new File(".\\screenshots\\" + name + ".png")); }
	 * 
	 * public static void takeScreenshot(WebDriver driver, String filename) throws
	 * IOException { File screen = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(screen, new
	 * File(".\\screenshots\\" + filename + ".png")); }
	 */

}
