package com.java.controlstatemetns;

import org.testng.annotations.Test;

public class DemoEven {

	@Test
	public void printEven() {

//		for (int i = 1; i < 20; i++) {
//
//			if (i %2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		//print a - z 
		//print Z - A
		//print only a, e, i o, u
		
		
		for (char i = 'a'; i < 'e'; i++) {

			if (i=='b' || i=='c') {
				System.out.println(i);
			}
		}
	}

}

//a, b, c, d, e

//print alphabetical letters in java
