package com.java.accessSpecifiers2;

import com.java.accessSpecifiers.DemoPublic;

public class DemoProtected {
	
	public static void main(String[] args) {
		DemoPublic dp = new DemoPublic();
		System.out.println(dp.name);
		System.out.println(dp.course);
		
		System.out.println(dp.toolName);
		System.out.println(dp.platform);
		
	}

}
