package com.selenium.selectCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoSelectCheckBox {

	@Test
	public void test() throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// click login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Thread.sleep(3000);

		// go to admin tab
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();

		Thread.sleep(3000);

		//header chefckbox
//		WebElement checkBoxmain = driver
//				.findElement(By.xpath("//div[@class='oxd-table']/div[@class='oxd-table-header']/div[1]/div/div[1]/label"));
//
//		if(checkBoxmain.isSelected() == false) {
//			checkBoxmain.click();
//			System.out.println("now all check boxes are selected.");
//		}else {
//			System.out.println("check box is already selected.");
//		}
		

		Thread.sleep(3000);
		
		// check box is selected or not
		WebElement checkBox = driver
				.findElement(By.xpath("//div[@class=\"oxd-table\"]/div[@class='oxd-table-body']/div[1]/div/div[1]"));
	
		System.out.println("before selecting check box: "+checkBox.isSelected());
		
		
		checkBox.click();
		Thread.sleep(3000);
		System.out.println("after selecting check box: "+checkBox.isSelected());
		
		
//		boolean s1 = checkBox.isSelected();
//		if(s1==false) {
//			System.out.println("if statement - selected is :"+s1);
////			checkBox.click();
//			
//		}else {
//			System.out.println("else statement : "+s1);
//		}
//		
	}

}
