package com.java.controlstatemetns;

public class JForTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("for loop with increment 1 "+i);
		}

		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println("for loop with increment 2 : "+i);
		}

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println("for each loop : "+i);
		}

		// break and continue
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println("for loop with if condition and break statement : "+i);
		}

		// continue example
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println("for loop with if condition and continue statement : "+i);
		}

		//
		int i = 0;
		while (i < 10) {
			System.out.println("while loop with if condition with break statement. "+i);
			i++;
			if (i == 4) {
				break;
			}
		}

		int i1 = 0;
		while (i1 < 10) {
			System.out.println("while loop with if condition with break statement. "+i1);
			i1++;
			if (i1 == 4) {
				continue;
			}
		}
		
	}
}
