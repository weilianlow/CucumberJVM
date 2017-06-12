package test.java.automationframework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;

public class GenericWebDriverFactory {
	WebDriver WD;
	public GenericWebDriverFactory(String choice){
		switch (choice.toLowerCase()){
			case "chrome":
				System.setProperty("webdriver.chrome.driver",GenericProps.getProperty("CHROME_DRIVER_SERVER_PATH"));
				WD = new ChromeDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver",GenericProps.getProperty("IE_DRIVER_SERVER_PATH"));
				WD = new InternetExplorerDriver();
				break;
		}
	}
	
	public WebDriver getWebDriver(){
		return WD;
	}
}
