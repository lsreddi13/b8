package com.java.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(1, "sasidhar"); // adding values into the map
		map1.put(2, "sasi1");
		map1.put(3, "sasidhar");
		map1.put(4, "sasireddy");
//		map1.clear();//delete values from the map
//		boolean val = map1.isEmpty(); // cehcking map having values or not
//
//		System.out.println(val);

		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(map1.size());
		System.out.println(map1.get(1));
//		System.out.println(map1.getKey("sasireddy"));
		
		 for (Entry<Integer, String> entry : map1.entrySet()) {
	            if (entry.getValue().equals("sasidhar")) {
	                System.out.println(entry.getKey());
	            }
	        }
		

	}

}
