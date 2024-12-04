package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemoDataDrivenPageFactory1 {
	
WebDriver driver;
	
	
	@FindBy(xpath="//b[contains(text(),'You logged into a secure area!')]")
	WebElement landingPage_Txt;
	
	public LoginDemoDataDrivenPageFactory1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void landingPage_Txt()
	{
		landingPage_Txt.isDisplayed();
	}

}
