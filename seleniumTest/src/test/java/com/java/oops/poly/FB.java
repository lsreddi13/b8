package com.java.oops.poly;

import org.testng.annotations.Test;

public class FB extends FB2 {

	@Test
	public void testLogin() {
		FB ff1 = new FB();
		FB2 ff2 = new FB2();
		FB2 ff12 = new FB();
		
		ff12.login("sasidhar", "sasidhar123");
		login("sasidhar1", "sasidhar12", "invalid user creadentials");
		

	}

	public void login(String email, String password) {
		// enter user name

		// enter password

		// click login button

		// click logout link

	}

	
	
	public void login(String email, String password, String error) {
		// enter user name

		// enter password

		// click login button

		// verify error message

	}
}
