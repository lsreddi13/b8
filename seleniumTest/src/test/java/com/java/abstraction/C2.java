package com.java.abstraction;

public class C2 extends DemoAbs implements DingInterfaceTest {

	public void t2() {
		System.out.println("this is cricket team");
	}
	
	public static void main(String[] args) {
		C2 cc = new C2();
		cc.t2();
	}

	public void team1() {
		System.out.println("hello");
	}

}
