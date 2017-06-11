package test.java.cucumbertestcases.steps;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import test.java.automationframework.WebDriverFactory;

public class Hooks {
	//public static WebDriver WD;
	BaseUtil base;
	
	public Hooks(BaseUtil base){
		this.base = base;
	}
	
	
	@Before("@seleniumchrome")
	public void seleniumchrome(){
		base.WD = new WebDriverFactory("chrome").getWebDriver();
		base.WD.manage().window().maximize();
		base.WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Before("@seleniumie")
	public void seleniumie(){
		base.WD = new WebDriverFactory("ie").getWebDriver();
		base.WD.manage().window().maximize();
		base.WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@After("@seleniumchrome,@seleniumie")
	public void seleniumteardown(){
		base.WD.quit();
	}
}