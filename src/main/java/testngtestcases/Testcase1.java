package main.java.testngtestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.java.automationframework.TestNGCustomReporter;
import main.java.pageobjects.SearchForm;
import main.java.pageobjects.TopNavigation;


public class Testcase1 extends SuperTestCase{
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
