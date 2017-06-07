package test.java.cucumbertestcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import test.java.automationframework.WebDriverFactory;
import test.java.pageobjects.SearchForm;

public class StepDefinitionGoogleNavigation {
	WebDriver WD;
	
	@Before
	public void init(){
		WD = new WebDriverFactory("chrome").getWebDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@After
	public void teardown(){
		WD.quit();
	}
	@Given("^User is at Page \"([^\"]*)\"$")
	public void user_is_at_Page(String arg1) throws Throwable {
		WD.get(arg1);
	}
	@When("^User enters \"([^\"]*)\" in search textfield$")
	public void user_enters_in_search_textfield(String arg1) throws Throwable {
		SearchForm.inputQ(WD).sendKeys(arg1);
	}
	@When("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		SearchForm.buttonSearch(WD).click();
	}
	@Then("^User will be redirected to Page \"([^\"]*)\"$")
	public void user_will_be_redirected_to_Page(String arg1) throws Throwable {
		//Compare getURL with https://www.google.com.sg/search?q=Hello+World
		Thread.sleep(5000);
	}
}
