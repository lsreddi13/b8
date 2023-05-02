package com.java.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoHashSetConvertArray {
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<>();
		s.add("sasi");
		s.add("sasidhar");
		s.add("sasidhar0");
		s.add("sasidhar2");
		s.add("sasidhar3");
		s.add("sasidhar4");
		s.add("sasidhar1");
		s.add("sasidhar5");

		System.out.println(s.size());

		 String arr[] = new String[s.size()];
	        
	        // toArray() method converts the set to array
	        s.toArray(arr);
	  
	        for (String n : arr)
	            System.out.println("arrays vaulues : "+n);
	    
		
		
	}
}
