package StepDefinitions1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksStepDefinition {
	
	//Before and After runs for every scenario 
	//BeforeStep and AfterStep runs for every step like given when etc
	WebDriver driver;
	
	@Before(value="@Smoke",order=1)
	public void browserSetup()
	{
		System.out.println(" In browser setup");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Before(order=2)
	public void browserSetup2()
	{
		System.out.println(" browsersetup2");
	}
	
	@After
	public void tearDown()
	{
		System.out.println(" In teardown");
		
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforeSteps()
	{
		System.out.println(" ==beforeSteps== ");
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.println(" ==AfterSteps== ");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    
	}




}
