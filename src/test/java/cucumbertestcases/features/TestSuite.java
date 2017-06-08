package test.java.cucumbertestcases;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/java/cucumbertestcases",
					plugin ={"pretty" , "html:C:/result/temp2"},
					tags ={"@tag1"}) 

public class TestSuite {}
