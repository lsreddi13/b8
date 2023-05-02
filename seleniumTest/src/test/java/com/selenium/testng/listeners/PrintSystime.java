package com.selenium.testng.listeners;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PrintSystime {

	
	public static void main(String[] args) {
		
		   
		   
		   DateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy hh.mm aa");
	    	String dateString2 = dateFormat2.format(new Date()).toString();
	    	System.out.println("time :  "+dateString2);
	    	
	    	
	}
}
