package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/Tags.feature", glue= {"Runners"},
	tags= "@Smoketest and @Regression")
	public class TagsRunner 
	{

	}



