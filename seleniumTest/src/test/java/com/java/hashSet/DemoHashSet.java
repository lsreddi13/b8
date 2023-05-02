package com.java.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoHashSet {
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

		System.out.println(s.isEmpty());

		System.out.println(s.contains("kar"));

		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// craete object s4 for hashset with values
		Set<String> s4 = new HashSet(
				Arrays.asList("selenium", "testing", "automation", "webdriver", "testng", "maven"));

		System.out.println("before adding list elements into the hashset size : " + s4.size());
		List li = Arrays.asList("java", "pthon");

		s4.addAll(li);
		System.out.println("after adding list elements into the hashset size : " + s4.size());

		Set<String> s5 = new HashSet<String>();
		for (int j = 1; j < s4.size(); j++) {
			s5.add("dd"+j+"-k" );

		}
		System.out.println(s5.size() + "-----s5 size");
		Iterator<String> its = s5.iterator();

		while (its.hasNext()) {

			System.out.println(its.next());
		}

		
		
	}
}
