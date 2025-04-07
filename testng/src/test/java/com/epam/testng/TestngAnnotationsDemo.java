package com.epam.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngAnnotationsDemo {
	@Test
	void test1() {
		System.out.println("This is test one");
	}

	@Test
	void test2() {
		System.out.println("This is test two");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("before Method");

	}

	@AfterMethod
	void AfterMethod() {
		System.out.println("After Method");

	}

	@BeforeClass
	void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	void afterClass() {
		System.out.println("After class");
	}

	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	void AfterSuite() {
		System.out.println("After Suite");
	}
}
