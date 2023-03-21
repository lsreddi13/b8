package com.java.controlstatemetns;

/*
 * this is if else condition example
 * 
 * if i give the 20 is this even number or not
 * int number = 20 or 15
 * if number is even number then print "this is even number" otherwise print "not an even number"
 * 
 * String day = "Monday"; 
 * 
 * if day is monday to friday then print "weekday"
 * if day is sat or sunday then print "weekend"
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class DemoIfElse2 {

	public static void main(String[] args) {

		String day = "Monday";
		if (day.equals("monday") || day.equals("tuesday")) {
			System.out.println();
		} else {
			System.out.println();
		}

//			if(day.equals("tuesday")) {
//			
//		} else if(day.equals("wednesday")) {
//			
//		}

		int val1 = 55;

		if (val1 == 75) {
			System.out.println("it is big");

		} else if (val1 == 55) {
			System.out.println("it is medium");
		} else if (val1 == 45) {
			System.out.println("it is small");
		} else {
			System.out.println("it is nothing");
		}

	}
}
