package main.java.testcase;

import org.openqa.selenium.By;

import main.java.config.TestNGCustomReporter;

public class Testcase2 extends SuperTestCase{
	public void body() throws Exception{
		WD.get("https://google.com.sg");
		WD.findElement(By.xpath("//input[@name='qr']")).sendKeys("Hello World");
		TestNGCustomReporter.logPassed("Great!",WD);
		Thread.sleep(1000);
	}
}
