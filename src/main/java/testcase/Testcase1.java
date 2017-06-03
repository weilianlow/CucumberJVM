package main.java.testcase;

import main.java.automationframework.TestNGCustomReporter;
import main.java.pageobjects.SearchForm;
import main.java.pageobjects.TopNavigation;


public class Testcase1 extends SuperTestCase{
	public void body() throws Exception {
		SearchForm SF = new SearchForm(WD);
		TopNavigation TN = new TopNavigation(WD);
		WD.get("https://google.com.sg");
		
		SF.inputQ.sendKeys("Hello World");
		Thread.sleep(2000);
		TestNGCustomReporter.logPassed("Great1!",WD);
		SF.buttonSearch.click();
		Thread.sleep(1000);
		TN.aImages.click();
		Thread.sleep(2000);
		TestNGCustomReporter.logPassed("Great2!",WD);
	}
}
