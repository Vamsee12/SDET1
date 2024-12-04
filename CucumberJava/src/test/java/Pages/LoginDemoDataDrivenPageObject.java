package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDemoDataDrivenPageObject {
	
	WebDriver driver;
	
	private By TxtUsername = By.xpath("//input[@id='username']");
	
	private By TxtPassword = By.xpath("//input[@id='password']");
		
	private By LoginBtn = By.xpath("//div[@class='card-body']//button[normalize-space()='Login'][1]");
	
	private By LandingPageTxt = By.xpath("//b[contains(text(),'You logged into a secure area!')]");
	
	
	public LoginDemoDataDrivenPageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUserName(String username)
	{
		driver.findElement(TxtUsername).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(TxtPassword).sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(LoginBtn).click();
	}
	
	public void landingPageTxt()
	{
		driver.findElement(LandingPageTxt).isDisplayed();
	}

}
