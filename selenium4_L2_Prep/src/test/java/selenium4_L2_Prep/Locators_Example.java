package selenium4_L2_Prep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Example {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("https://trytestingthis.netlify.app/");
			
		
		List<WebElement> l = driver.findElements(By.name("Optionwithcheck[]"));   //for multiple elements
		
		for(WebElement w : l) 
		{
			System.out.println(w.getText());
		}
		
		driver.close();
		
		driver.quit();
	}

}
