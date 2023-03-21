package com.java.datatypes;

public class DemoStrings {

	public static void main(String[] args) {
		
		String text = "Biden signs order to strengthen background checks before gun sale";
		
		int sizeOfString = text.length(); // number of characters
		
		String ar[] = text.split(" ");
		
		//array - group of string [] {"Biden", "signs", "order"}
		
		int numberOfWords = ar.length;
		
		System.out.println(ar[0]);
		
		System.out.println(numberOfWords);
		
		String result = "About 19,92,00,00,000 results (0.55 seconds) ";
		
//		System.out.println(result.length());
		
//		int index1=result.indexOf("results");
//		System.out.println(index1);
		
		String s1 = result.substring(6,result.indexOf("results"));
		System.out.println(s1);
		
		
//		Hello world!
//		
//		!dlrow olleH
//		
//		olleH !dlroW
//		
//		o 
//		l
		
//		regular expressions in string
		
		
		
		
//		String s2 =s1.substring(6,21);
//		System.out.println("results count " + s2);
		
		/*
		String result = "About 19,92,00,00,000 results (0.55 seconds) ";
		
		
		String str1 = "DFFASDF dhhsfasdj @#2143123v 134123 . 9000.8888 R@#$%@#$%";
		
		
		System.out.println(text);
		
		System.out.println(str1);
		*/
		
		
	}

}
