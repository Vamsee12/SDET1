package selenium4_L2_Prep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Actions_Demo {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String s = driver.getWindowHandle(); //gets the window handle and saves it in a string
		
		driver.navigate().to("https://www.espncricinfo.com/");
		
		
		
         System.out.println(driver.getCurrentUrl());
         
         System.out.println(driver.getTitle());
         
         driver.navigate().back();
         driver.navigate().forward();
         driver.navigate().refresh();
         
         driver.switchTo().newWindow(WindowType.WINDOW);
         driver.switchTo().newWindow(WindowType.TAB);
         
         driver.switchTo().window(s);
         
         
         		
	    //driver.close();  //only closed current tab
        //driver.quit();   //closes entire browser sessions

	}

}
