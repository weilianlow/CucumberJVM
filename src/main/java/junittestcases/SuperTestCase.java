package main.java.junittestcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import main.java.automationframework.WebDriverFactory;

public class SuperTestCase {
	WebDriver WD;
	@Before
	public void start(){
		WD = new WebDriverFactory("chrome").getWebDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@After
	public void end(){
		WD.quit();
	}
	@Test
	public void main() throws Exception{
		try{
			body();
		}catch(Exception e){
			Assert.fail(e.getMessage());
		}
	}

	public void body() throws Exception{};
}
