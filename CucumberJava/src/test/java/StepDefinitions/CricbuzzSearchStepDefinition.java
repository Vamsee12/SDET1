package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CricbuzzSearchStepDefinition {

	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	@And("user is on cricbuzz search page")
	public void user_is_on_cricbuzz_search_page() {

		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='cb-ico cb-search-input-icon cb-search-input-icon-nav']")).click();

		driver.findElement(By.xpath("//input[@id='search_bar_menu']")).sendKeys("virat");

	}

	@And("clicks on search button")
	public void clicks_on_search_button() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='SEARCH']")).isDisplayed();	

	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {

		driver.getPageSource().contains("TRENDING PLAYERS");

	}


}
