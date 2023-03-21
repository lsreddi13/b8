package com.java.controlstatemetns;

import org.testng.annotations.Test;

public class DemoContinueBreak {

	@Test
	public void continueDemo() {

		for (int i = 1; i < 75; i++) {

			if (i == 10 || i==20 || i==30)
				continue;
			System.out.println(i);

		}

	}
}
