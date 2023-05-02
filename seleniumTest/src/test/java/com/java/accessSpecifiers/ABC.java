package com.java.accessSpecifiers;

public class ABC {
	public static void main(String[] args) {
		try {
		System.out.println(10/1);
		System.out.println(10/2);
		System.out.println(10/3);
		
		System.out.println(10/0); //unchecked exceptions ( run time exceptions)
	
		System.out.println(10/4);
		System.out.println(10/5);
		System.out.println(10/10);
		System.out.println(10/6);
		System.out.println(10/8);
		System.out.println(10/'i');
		}catch(Exception e) {
			System.out.println("error here : "+e);
		}
		
	}
}
