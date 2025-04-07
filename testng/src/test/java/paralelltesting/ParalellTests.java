package paralelltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalellTests {
	WebDriver driver;

	@Test
	public void logoTest() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"cb-logo-main-menu\"]"));
		Assert.assertTrue(logo.isDisplayed(), "webelement is not displayed");
	}

	@Test
	public void homepageTitle() {
		WebDriverManager.chromedriver().setup(); 		
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com");

	}


	/*
	 * @AfterMethod void tearDown() { driver.quit(); }
	 */
}
