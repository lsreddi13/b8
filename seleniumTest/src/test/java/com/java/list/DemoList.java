package com.java.list;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	
	public static void main(String[] args) {
		
		List<String> list1= new ArrayList();
		List<String> list2= new ArrayList();
		list1.add("sasi");
		list1.add("ramu");
		list1.add("raju");
		list1.add("sasi");
		list1.add("indra");
		list1.add("kisore");
		System.out.println(list1.size());
		System.out.println(list1);
		list1.add("Kranthi");
		list1.add("Divya");
		
		list1.add("suseela");
		System.out.println(list1.size());
		System.out.println(list1);
		
		
		//remove values from list
//		list1.remove(1);
//		System.out.println(list1.size());
//		System.out.println(list1);
		//replace value from list
		list1.add("sundar");
		System.out.println(list1.size());
		System.out.println(list1);
		list1.set(0, "Karthi K");
		System.out.println(list1.size());
		System.out.println("all " +list1);
		list1.remove("SSuseela");
		
		
		
		
		
		
		//copy list into another list
		
		
		//add list items into another list
		
		//print only few elements from a to b in array lsit
//		System.out.println(list1);
		System.out.println("from 2 to 8" + list1.subList(2, 7));
		
	System.out.println(list1.contains("sasidhar"));
	
	System.out.println(list1.contains("ddd"));
	
//	find the index of arraylist element
	System.out.println(list1.indexOf("raju"));
	
//	System.out.println();
		
		
	}
}
