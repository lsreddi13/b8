package demoCss;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoCssSelectorLogin {
	@Test
	public void testRelativeLocator1() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(40000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		
		driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(1)>div>div:nth-of-type(2)>input"))
				.sendKeys("Admin");
		driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(2)>div>div:nth-of-type(2)>input"))
				.sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-form >div:nth-of-type(3)>button")).click();
//		Thread.sleep(4000);
		WebElement req = driver.findElement(By.cssSelector("ul > li:nth-of-type(5) >a > span"));
		boolean val = req.isDisplayed();
		if (val = true) {
			req.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(), 'Job Title')]/../following-sibling::div")).click();

//		Thread.sleep(4000);		
//		driver.findElement(By.cssSelector("div[role='listbox] > div > ul > li:nth-of-type(3)")).click();
//		driver.findElement(By.cssSelector("div[role='listbox'] > div > ul > li:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector("div[role='listbox'] > div:nth-of-type(25)")).click();
		
		
//		driver.findElement(By.xpath("//label[contains(text(), 'Job Title')]/../following-sibling::div")).click();
//		driver.findElement(By.cssSelector("div[role='listbox'] > div:last-child")).click();
		//select vacancy last item
		
		//select hiring manager last item
		
		
		
		
		
		
	}

}
