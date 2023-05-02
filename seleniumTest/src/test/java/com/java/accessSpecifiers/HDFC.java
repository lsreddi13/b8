package com.java.accessSpecifiers;

public class HDFC extends DemoPrivate{
	
	public static void main(String[] args) {
		HDFC dcp = new HDFC();
		dcp.setName("sasi");
		System.out.println(dcp.getName());
		
		dcp.setName("karthik");
		System.out.println(dcp.getName());
		
		dcp.setPrice(15);
		
		System.out.println(dcp.getPrice());
		

		
	}

}
