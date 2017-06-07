package test.java.testngtestcases;

import test.java.automationframework.TestNGCustomReporter;
import test.java.pageobjects.SearchForm;
import test.java.pageobjects.TopNavigation;

public class Testcase1 extends SuperTestCase{
	@Override
	public void body() throws Exception {
		WD.get("https://google.com.sg");
		SearchForm.inputQ(WD).sendKeys("Hello World");
		Thread.sleep(2000);
		TestNGCustomReporter.logPassed("Great1!",WD);
		SearchForm.buttonSearch(WD).click();
		Thread.sleep(1000);
		TopNavigation.aImages(WD).click();
		Thread.sleep(2000);
		TestNGCustomReporter.logPassed("Great2!",WD);
	}
}