package com.epam.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

//tests are executed in alphabetical order if priority is not mentioned
//no need of main method

public class FirstTestCase {
	
	@Test(priority = 1)
	void setUp() {
		System.out.println("opening browser");
	}

	@Test(priority = 2)
	void login() {
		System.out.println("logging in test");
	}
	@Test
	void addCustomer() {
		System.out.println("custromer add test");
		//Assert.assertEquals('v', 'l');
	}

	@Test(priority = 3)
	void tearDown() {
		System.out.println("closing browser");
	}
}
