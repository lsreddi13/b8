package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMapValuesInitialization {
	public static void main(String[] args) {
		Map<String, String> doubleBraceMap = new HashMap<String, String>() {
			{
				put("key1", "value1");
				put("key2", "value2");
			}
		};
	}
}
