package selenium4_L2_Prep;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Example {

	public static void main(String[] args) throws IOException {

       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
					
		//driver.navigate().to("https://www.espncricinfo.com/");
		
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //here first type caste driver to TakesScreenshot
		FileUtils.copyFile(f1, new File("./image1.png"));
		
		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		File f2 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("./image2.png"));
		
		
	}

}
