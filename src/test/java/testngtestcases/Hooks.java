package test.java.testngtestcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.java.automationframework.TestNGCustomReporter;
import test.java.automationframework.GenericWebDriverFactory;

public class Hooks {
	WebDriver WD;
	@Parameters({"browserType"})
	@BeforeTest
	public void start(String browserType){
		WD = new GenericWebDriverFactory(browserType).getWebDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
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
