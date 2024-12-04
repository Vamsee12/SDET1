package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {
	// tests are executed in alphabetical order if priority is not mentioned
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
