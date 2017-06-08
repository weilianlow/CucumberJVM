package test.java.cucumbertestcases.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import test.java.pageobjects.SearchForm;
import test.java.pageobjects.TopNavigation;
public class StepDefinitionGoogleNavigation {
	@Given("^User is at Page \"([^\"]*)\"$")
	public void user_is_at_Page(String arg1) throws Throwable {
		Hooks.WD.get(arg1);
	}
	@When("^User enters \"([^\"]*)\" in search textfield$")
	public void user_enters_in_search_textfield(String arg1) throws Throwable {
		SearchForm.inputQ(Hooks.WD).sendKeys(arg1);
	}
	@And("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		SearchForm.buttonSearch(Hooks.WD).click();
	}
	@And("^User clicks on images hyperlink$")
	public void userClicksOnImagesHyperlink() throws Throwable {
		TopNavigation.aImages(Hooks.WD).click();
	}
	@Then("^images will be shown in grid format$")
	public void imagesWillBeShownInGridFormat() throws Throwable {
		Thread.sleep(5000);
	}
}
