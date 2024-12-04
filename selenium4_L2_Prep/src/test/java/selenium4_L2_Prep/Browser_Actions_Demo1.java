package selenium4_L2_Prep;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Actions_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
					
		driver.navigate().to("https://www.espncricinfo.com/");
		
		//width and height
		Dimension d = driver.manage().window().getSize();
		System.out.println("width: "+d.width+", " +"height: "+d.height);
		driver.manage().window().setSize(new Dimension(1200,750));
		
		Thread.sleep(5000);
		
		
		//x and y co-ordinates
		Point p = driver.manage().window().getPosition();
		System.out.println("x: "+p.getX()+", " +"y: "+p.getY());
		driver.manage().window().setPosition(new Point(600,700));
		
		
		Thread.sleep(5000);
		
		//maximize window
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//minimize window
		driver.manage().window().minimize();
		
         Thread.sleep(5000);
		
         //fullscreen
		driver.manage().window().fullscreen();
		
		Thread.sleep(5000);
		
		driver.quit();
		
			
				
	}

}
