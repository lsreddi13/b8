package com.java.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoContainsString {

	public static void main(String[] args) {
		// using string.concat
		String s1 = "Hello";
		String s2 = "all";
		System.out.println(s1.concat(s2)); // Helloall --
		// adds second object's string to first object's end of string without any
		// spaces.

		// using + operator to concatenate String
		String first = "Raj";
		String last = "Chris";

		String name = first + " " + last;
		System.out.println(name);

		// using StringBuilder
		StringBuilder strBuilder = new StringBuilder(14);
		strBuilder.append(first).append(" ").append(last);
		System.out.println(strBuilder.toString());

		// using StringBuffer
		StringBuffer strBuffer = new StringBuffer(15);
		strBuffer.append(first).append(" ").append(last);
		System.out.println(strBuffer.toString());

		String ss1 = "the sentence doesn't end with because, because because is a conjunction";
//		the sentence doesn't end with what, because because is a conjunction

		System.out.println(ss1.replaceFirst("because", "what"));

		String str = "Hello Java";
		System.out.println(str.substring(4));// returns 'o Java'

		System.out.println(str.substring(2, 8));// returns 'llo Ja'

		String myStr = "Hello planet earth, you are a great planet.";
		System.out.println(myStr.lastIndexOf("planet"));

		int a = 90;

		String a2 = "dasD";
		String sname = new String("sasi");

	}

}
