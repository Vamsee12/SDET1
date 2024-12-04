package selenium4_L2_Prep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();       //WebDriverManager dependency
		
		//WebDriverManager.chromedriver().driverVersion("126.0.6478.63").setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(25));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25)); 
		
	    driver.close();

	}

}
