package test.java.cucumber.features;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/java/cucumber/features",
					glue="test.java.cucumber.steps",
					plugin = {"pretty",
							"rerun:target/rerun.txt",
							"json:target/cucumber.json",
							"html:target/site/cucumber-pretty"},
					tags ={"@regression"},
					strict = true,
					monochrome = true)
					//dryRun = true
public class TestSuite {}
