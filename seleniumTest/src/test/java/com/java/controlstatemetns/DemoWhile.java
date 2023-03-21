package com.java.controlstatemetns;

import org.testng.annotations.Test;

public class DemoWhile {

	@Test
	public void testWhileLoop() {

		int i = 6; // initialization
		while (i < 5) { // condition
			System.out.println(i + 1);
			i++; // increment
		}
//
		int j = 5;
		do {
			System.out.println(j);
			j++; // increment
		} while (j <0);

	}
}
