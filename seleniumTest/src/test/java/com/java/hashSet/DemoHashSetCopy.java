package com.java.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoHashSetCopy {
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

		
		 HashSet<String> copyOfSet = new HashSet<>(s);
		 
		 
		 System.out.println(copyOfSet.size());
		 
		 
		 Iterator<String> it = copyOfSet.iterator();
		 while (it.hasNext()) {
			 System.out.println("copy of set values : "+it.next());
			
		}
	}
}
