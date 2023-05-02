package com.java.accessSpecifiers2;

import com.java.accessSpecifiers.DemoPublic;

public class DemoDefault extends DemoPublic {
	
	public static void main(String[] args) {

		DemoDefault dp = new DemoDefault();

		System.out.println(dp.name);
		
//		System.out.println(dp.course);
		System.out.println(dp.toolName);
//		System.out.println(dp.platform);
		

	}

}
