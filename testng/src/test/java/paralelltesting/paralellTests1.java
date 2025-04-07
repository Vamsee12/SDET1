package paralelltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralellTests1 {
	WebDriver driver;

	@Test
	void searchTest() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 		
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		WebElement search = driver
				.findElement(By.xpath("//*[@id=\"main-menu_search\"]/div/form/div[1]/div/div[1]/span[1]"));
		Assert.assertTrue(search.isDisplayed(), "webelement is not displayed123");
	}
}
