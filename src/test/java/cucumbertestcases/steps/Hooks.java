package test.java.cucumbertestcases.steps;

import java.util.concurrent.TimeUnit;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import test.java.automationframework.WebDriverFactory;

public class Hooks{
	public static WebDriver WD;
	
	@Before("@seleniumchrome")
	public void seleniumchrome(){
		WD = new WebDriverFactory("chrome").getWebDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Before("@seleniumie")
	public void seleniumie(){
		WD = new WebDriverFactory("ie").getWebDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@After("@seleniumchrome,@seleniumie")
	public void seleniumteardown(){
		WD.quit();
	}
}

