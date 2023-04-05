package com.java.abstraction;

public class C1 extends DemoAbs implements DingInterfaceTest {

	// what is the abstraction class
	// what is abstraction methods
	// how to implement abstraction methods

//	what is the diff b/w abstraction and interface

	public void t2() {
		System.out.println("this is implemented here");

	}

	public static void main(String[] args) {
		C1 cc = new C1();
		cc.t2();
		cc.t1();
		cc.team1();
	}

	public void team1() {
		System.out.println("this is implemented in the child class from interface");
	}

}
