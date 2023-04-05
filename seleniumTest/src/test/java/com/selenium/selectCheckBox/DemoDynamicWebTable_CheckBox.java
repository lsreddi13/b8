package com.selenium.selectCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.selenium.alerts.Alerts;
import com.selenium.alerts.DemoAlerts1;

public class DemoDynamicWebTable_CheckBox {
	static WebDriver driver;

	@Test
	public void test() throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
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

//print status of Alice

//		System.out.println("Alice status : " +webTable("Alice"));

//		System.out.println("Anthony status : " +webTable("Anthony"));
//		webTableSelectCheckBox("David");
		webTableClickDeleteButtonx("Chenzira.Chuki");
		Thread.sleep(4000);
		Alerts dd = new Alerts();
//		System.out.println(dd.getTextFromPromptAlert(driver));
//		dd.clickDismissAlert(driver);
		driver.switchTo().alert().accept();

//		webTableSelectCheckBox("Dominic.Chase");

	}

	public String webTable(String empName) {
		WebElement status = driver.findElement(By.xpath(
				"//div[@class='oxd-table-body']/div/div/div[2]/div[contains(text(), '" + empName + "')]/../../div[5]"));

		String emp_status = status.getText();

		return emp_status;
	}

	public void webTableSelectCheckBox(String empName) {
		WebElement checkbox = driver.findElement(By.xpath(
				"//div[@class='oxd-table-body']/div/div/div[2]/div[contains(text(), '" + empName + "')]/../../div[1]"));
		checkbox.click();

	}

	public void webTableClickDeleteButtonx(String empName) {
		WebElement checkbox = driver
				.findElement(By.xpath("//div[@class='oxd-table-body']/div/div/div[2]/div[contains(text(), '" + empName
						+ "')]/../../div[6]//button[1]"));
		checkbox.click();

	}
}
