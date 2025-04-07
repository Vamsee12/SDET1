package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//tag and id combination
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Pants");   //tagName#id
		//Here tag name is not mandatory, it is optional, we pass this #small-searchterms directly in css selector
		
		
		//tag and class combination
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("shirts");  //tagname.classname
		//search-box-text ui-autocomplete-input this is class name here we can ignore text after the space as it will not locate properly
		
		//tag and attribute combination
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("mobile"); 
		//placeholder=\"Search store\"
		
		
	}

}
