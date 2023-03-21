package com.selenium.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.methods.java.DemoMethod;

public class DemoFBMethods {

	// how to read properties file in java
	@Test
	public void testcase1() throws IOException {

		FileReader fr = new FileReader(".\\src\\test\\java\\com\\selenium\\example\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		DemoMethod dm = new DemoMethod();
		dm.openBrowser();
		dm.loginTest(p.getProperty("name"), p.getProperty("pwd"));
		dm.logoutTest();
	}

	@Test
	public void testcase2() throws IOException {
		FileReader fr2 = new FileReader(".\\config2.properties");
		Properties p2 = new Properties();
		p2.load(fr2);
		DemoMethod dm = new DemoMethod();
		dm.openBrowser();
		dm.loginTest(p2.getProperty("name2"), p2.getProperty("pwd2"));
		dm.logoutTest();
	}

}
