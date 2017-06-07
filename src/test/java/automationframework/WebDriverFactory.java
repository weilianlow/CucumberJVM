package test.java.automationframework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;

import test.java.automationframework.*;

public class WebDriverFactory {
	WebDriver WD;
	public WebDriverFactory(String choice){
		switch (choice.toLowerCase()){
			case "chrome":
				System.setProperty("webdriver.chrome.driver",Props.getProperty("CHROME_DRIVER_SERVER_PATH"));
				WD = new ChromeDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver",Props.getProperty("IE_DRIVER_SERVER_PATH"));
				WD = new InternetExplorerDriver();
				break;
		}
	}
	
	public WebDriver getWebDriver(){
		return WD;
	}
}
