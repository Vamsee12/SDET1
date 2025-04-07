package com.epam.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
	WebDriver driver;
	

	@BeforeClass
	void setUp() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();		
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
	}

	@Test
	void logoTest() {
		
		//inspect logo and right click and copy xpath
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"cb-logo-main-menu\"]"));
		Assert.assertTrue(logo.isDisplayed(), "webelement is not displayed");
		
		//"webelement is not displayed" - this is optional message which will be displayed if Assert.assertTrue fails
	}

	@Test
	void homepageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com");

	}

	@Test
	void searchTest() {
		WebElement search = driver
				.findElement(By.xpath("//*[@id=\"main-menu_search\"]/div/form/div[1]/div/div[1]/span[1]"));
		Assert.assertFalse(search.isDisplayed(), "webelement displayed123");
		
		//"webelement displayed123" - this is optional message which will be displayed if Assert.assertfalse passes and returns true
		//webelement displayed123 expected [false] but found [true]
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
