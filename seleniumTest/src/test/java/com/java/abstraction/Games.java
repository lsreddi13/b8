package com.java.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Games implements DingInterfaceTest, Intf1, Intf2 {

	
	@Test
	public void team1() {
		System.out.println("hhhhhh");
		WebDriver driver = new ChromeDriver();
	}
	
	@Test
	public void login() {
		team1();
	}

	public void team3() {
		
	}

	public void team2() {
		
	}

}
