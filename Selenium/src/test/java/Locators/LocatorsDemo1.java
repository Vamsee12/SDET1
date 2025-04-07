package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
				
		
		//driver.findElement(By.name("search")).sendKeys("mac");
		
		//boolean statusOfLogoDisplayed = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(statusOfLogoDisplayed);
		
		//driver.findElement(By.linkText("Tablets")).click();
		
		//driver.findElement(By.partialLinkText("Tablet")).click();		
				
		List<WebElement> elements = driver.findElements(By.className("list-inline-item"));
		System.out.println(elements.size());
		
		List<WebElement> elementsWithTagli = driver.findElements(By.tagName("li"));
		System.out.println(elementsWithTagli.size());
		
		List<WebElement> elementsWithTagimg = driver.findElements(By.tagName("img"));
		System.out.println(elementsWithTagimg.size());
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Maximum wait time
                .pollingEvery(Duration.ofSeconds(5))  // Check condition every 5 seconds
                .ignoring(Exception.class); 

	}

}
