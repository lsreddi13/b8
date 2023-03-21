package com.chrome.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoPrintNameandPrice {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		String url = "https://www.justdial.com/Hyderabad/Electricians/nct-10184166";

		driver.get(url);

		Thread.sleep(3000);

		// span[contains(text(), 'pTron Solero MB301 3A Micro USB Data & Charging Cable,
		// Made in India, 480Mbps Data Sync, Strong & Durable 1.5-Meter Nylon Braided
		// USB Cabl')]/../../../../div[3]/div/a/span[@class='a-price']/span[1]

		String s1 = driver.findElement(By.xpath("//div[@class=\"resultbox_textbox\"]/div/a")).getText();
		System.out.println(s1);
		
		
		//print all Electricians names from the justdial web page
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='resultbox_textbox']/div/a"));
		
		System.out.println(" number of Electricians : "+li.size());
		
		
		for(WebElement justDial_electrician : li) {
			
//			System.out.println(justDial_electrician.getText());
			
			
			String justDial_electrician_name = justDial_electrician.getText();
			
			System.out.println("Electrician name : "+justDial_electrician_name);
			
			
//			telephone number xpath ://div[@class='resultbox_textbox']/div/a/../following-sibling::div//a[contains(@href, 'tel:')]
			
		}
		
		
		
		
		
	}

}
