package com.selenium.ClickImage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoClickImage {

	@Test(enabled = false)
	public void clickImage() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get(
				"https://www.apollohospitals.com/hyderabadapolloconsultleads/?utm_source=paid&utm_medium=cpc&utm_campaign=12527691822&utm_adgroup=118016306566&utm_match_type=e&network=g&ad=540087885357&utm_device=c&utm_keyword=apollo&utm_gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY03IXzQ8YXUHbFW9mJCvIUuVd6j4Uhmw0WQpjjWeo_VXf2sXd7j3bMaAiWtEALw_wcB&gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY03IXzQ8YXUHbFW9mJCvIUuVd6j4Uhmw0WQpjjWeo_VXf2sXd7j3bMaAiWtEALw_wcB#page-top");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='round-tab ts1']")).click();

	}

	@Test(enabled = true)
	public void clickImage2() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.synechron.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement image = driver.findElement(By.xpath("//h2[contains(text(), 'Our Work')]/following-sibling::div/div[1]//img"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
//		js.executeScript("window.scrollBy(295, 1861)","");
		
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(295, -1300)","");
		
//		WebElement we = driver.findElement(By.xpath("//span[contains(text(), 'Explore all Press Releases, In The News & Events')]"));
		
//		js.executeScript("arguments[0].scrollIntoView();", we);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
//		image.click();

	}
}
