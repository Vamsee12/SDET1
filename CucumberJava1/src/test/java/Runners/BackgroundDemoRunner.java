package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/FeatureFiles/BackgroundDemo.feature", glue= {"StepDefinitions2"},
	monochrome = true, 
	plugin= {"pretty",
			"html:target/Cucumber-reports/htmlreport.html",
			"json:target/Cucumber-reports/jsonreport.json",
			"junit:target/Cucumber-reports/xmlreport.xml"})
	public class BackgroundDemoRunner 
	{

	}



