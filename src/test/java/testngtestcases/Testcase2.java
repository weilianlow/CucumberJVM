package test.java.testngtestcases;

import org.openqa.selenium.By;

import test.java.automationframework.TestNGCustomReporter;

public class Testcase2 extends Hooks{
	@Override
	public void body() throws Exception{
		WD.get("https://google.com.sg");
		WD.findElement(By.xpath("//input[@name='qr']")).sendKeys("Hello World");
		TestNGCustomReporter.logPassed("Great!",WD);
		Thread.sleep(1000);
	}
}
