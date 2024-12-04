package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemoDataDrivenPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement Txt_Username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Txt_Password;
	
	@FindBy(xpath="//b[contains(text(),'You logged into a secure area!')]")
	WebElement Login_Btn;
	
	public LoginDemoDataDrivenPageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter_UserName(String username)
	{
		Txt_Username.sendKeys(username);
	}
	
	public void enter_Password(String password)
	{
		Txt_Password.sendKeys(password);
	}
	
	public void click_LoginBtn()
	{
		Login_Btn.click();
	}
	

}
