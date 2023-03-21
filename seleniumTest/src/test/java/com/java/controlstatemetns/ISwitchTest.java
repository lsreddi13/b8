package com.java.controlstatemetns;

public class ISwitchTest {
public static void main(String[] args) {
	String day = "mon";
	switch (day) {
	  case "mon":
	    System.out.println("Weekday");
	  break;
	  case "tue":
	    System.out.println("Tuesday");
	    break;
	  case "wed":
	    System.out.println("Wednesday");
	    break;
	  case 4:
	    System.out.println("Thursday");
	    break;
	  case 5:
	    System.out.println("Friday");
	    break;
	  case 6:
	    System.out.println("Saturday");
	    break;
	  case 7:
	    System.out.println("Sunday");
	    break;
	}
}
}
