package com.java.controlstatemetns;

import org.testng.annotations.Test;

public class DemoTestNG2 {

	@Test
	public void openGooglebrowser() {
		
		System.out.println("open browser and open FB applicaiton test case");
//		for (int i = 0; i < 10; i++) {
//			  if (i == 4) {
////			    break;
//				  continue;
//			  }
//			  System.out.println(i);
//			}

	}
	
	
	@Test
	public void signInFBUser() {
		
		System.out.println("login FB user test case");
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}
	}
	
	@Test
	public void signoutFBUser() {
		
		System.out.println("logout FB user test case");
		int i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++; // if we comment this 
		}
	}

}
