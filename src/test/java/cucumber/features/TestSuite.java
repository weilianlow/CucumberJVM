package test.java.cucumber.features;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/java/cucumber/features",
					plugin = {"pretty",
							"json:target/cucumber.json",
							"html:target/site/cucumber-pretty"},
					tags ={"@regression"},
					glue="test.java.cucumber.steps",
					monochrome = true)
					//dryRun = true
					//monochrome - Display the console output in a much readable ways
					//strict - if set to true, this will fail any scenarios with pending steps 
public class TestSuite {}
