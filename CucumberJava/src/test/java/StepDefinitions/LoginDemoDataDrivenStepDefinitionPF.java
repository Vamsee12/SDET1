package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginDemoDataDrivenPageFactory;
import PageFactory.LoginDemoDataDrivenPageFactory1;
import Pages.LoginDemoDataDrivenPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoDataDrivenStepDefinitionPF {
	
WebDriver driver;
	
LoginDemoDataDrivenPageFactory login;
LoginDemoDataDrivenPageFactory1 login1;

	@Given("chrome browser is open")
	public void chrome_browser_is_open() {
		
		System.out.println("Page Factory Model");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}



	@And("user is on the login page")
	public void user_is_on_the_login_page() {

		driver.get("https://practice.expandtesting.com/secure");
		driver.manage().window().maximize();

	}


	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username, String password) {

//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		login = new LoginDemoDataDrivenPageFactory(driver);
		login.enter_UserName(username);
		login.enter_Password(password);


	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {


//      driver.findElement(By.xpath("//form[@id='login'] //button[@type='submit'][1]")).click();
//		driver.findElement(By.xpath("//div[@class='card-body']//button[normalize-space()='Login'][1]")).click();
		
		login.click_LoginBtn();



	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

//		driver.findElement(By.xpath("//b[contains(text(),'You logged into a secure area!')]")).isDisplayed();
		
		login1.landingPage_Txt();


	}

}
