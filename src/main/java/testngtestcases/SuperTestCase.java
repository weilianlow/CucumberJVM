package main.java.testngtestcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import main.java.automationframework.TestNGCustomReporter;
import main.java.automationframework.WebDriverFactory;
import main.java.pageobjects.SearchForm;
import main.java.pageobjects.TopNavigation;

public class SuperTestCase {
	WebDriver WD;
	@Parameters({"browserType"})
	@BeforeTest
	public void start(String browserType){
		WD = new WebDriverFactory(browserType).getWebDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		SearchForm SF = new SearchForm(WD);
		TopNavigation TN = new TopNavigation(WD);
	}
	@AfterTest
	public void end(){
		WD.quit();
	}
	@Test
	public void main() throws Exception{
		try{
			body();
		}catch(Exception e){
			TestNGCustomReporter.logFailed(e.getMessage(),WD);
		}
	}
	public void body() throws Exception{};
}
