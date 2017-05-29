package testcase;

import org.openqa.selenium.By;
import config.TestNGCustomReporter;

public class Testcase1 extends SuperTestCase{
	public void body() throws Exception{
		WD.get("https://google.com.sg");
		WD.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
		TestNGCustomReporter.logPassed("Great!",WD);
		Thread.sleep(1000);
	}
}
