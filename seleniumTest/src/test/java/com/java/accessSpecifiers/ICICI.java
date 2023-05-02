package com.java.accessSpecifiers;

public class ICICI extends DemoPrivate{
	
	public static void main(String[] args) {
		ICICI dcp = new ICICI();
		dcp.setName("sasi");
		System.out.println(dcp.getName());
		
		dcp.setName("karthik");
		System.out.println(dcp.getName());
		
		dcp.setPrice(12);
		
		System.out.println(dcp.getPrice());
		

		
	}

}
