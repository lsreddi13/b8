package com.selenium.FindBrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoFindBrokenLink {

	WebDriver driver;

	@Test
	public void printBrokenLink() throws InterruptedException, MalformedURLException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

//		driver.get("http://www.fb.com");

//		HttpURLConnection huc = null;
//		int respCode = 200;

//		String url = driver.findElement(By.linkText("Forgotten password?")).getAttribute("href");

		String url = "https://qaautomation.expert/2022/08/05/extentreports-version-56-with-selenium-and-testng/";
//		driver.get(url);

//		driver.navigate().to("http://fb.com");
		// System.out.println("url value : " + url);

	
			HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());

			huc.setRequestMethod("HEAD");

			huc.connect();

			int respCode = huc.getResponseCode();

			System.out.println(respCode);
//			200 - 399 :: valid status codes
//			400 - 599 :: invalid status code
//			
//			if (respCode >= 400) {
//				System.out.println(url + " is a broken link");
//			} else {
//				System.out.println(url + " is a valid link");
//			}
//
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
