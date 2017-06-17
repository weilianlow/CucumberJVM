package test.java.cucumber.steps;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import test.java.automationframework.GenericWebDriverFactory;

public class Hooks {
	BaseUtil base;
	public Hooks(BaseUtil base){
		this.base = base;
	}
	public void scenarioInit(Scenario scenario){
		base.scenario = scenario;
	}
	@Before
	public void before(Scenario scenario){
		scenarioInit(scenario);
	}
	@Before("@seleniumchrome")
	public void seleniumchrome(Scenario scenario){
		base.WD = new GenericWebDriverFactory("chrome").getWebDriver();
		base.WD.manage().window().maximize();
		base.WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		scenarioInit(scenario);
	}
	@Before("@seleniumie")
	public void seleniumie(Scenario scenario){
		base.WD = new GenericWebDriverFactory("ie").getWebDriver();
		base.WD.manage().window().maximize();
		base.WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		scenarioInit(scenario);
	}
	@After("@seleniumchrome,@seleniumie")
	public void seleniumteardown(){
		try{
			byte[] screenshot = ((TakesScreenshot)base.WD).getScreenshotAs(OutputType.BYTES);
			base.scenario.embed(screenshot, "image/png");
		}catch(WebDriverException e){
			System.err.println(e.getMessage());
		}
		base.WD.quit();
	}
}