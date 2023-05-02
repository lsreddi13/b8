package com.java.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet {
	
	public static void main(String[] args) {
		
		
		Set<String> s1 = new LinkedHashSet<>(); // getwindowhandles();
		s1.add("chrome");
		s1.add("firefox");
		s1.add("edge");
		s1.add("opera");
		s1.add("safari");
		System.out.println(s1);
		
		//find chrome is exist in the list
		
		System.out.println(s1.contains("Chrome"));
		String[] A = {"IE", "mozilla"};
		
		//change the chrome to googleChrome
		s1.addAll(Arrays.asList(A));   
		System.out.println(s1);
//		s1.clear();
//		System.out.println(s1+"----");
		
		s1.remove("chrome");
		System.out.println(s1);
		s1.remove("CChrome");
		System.out.println(s1);
		
		
	}

}
