package selenium4_L2_Prep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement w = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(w)).sendKeys("abcde");
		
		driver.close();
		driver.quit();
		
	}

}
