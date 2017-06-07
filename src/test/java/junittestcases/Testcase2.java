package test.java.junittestcases;

import org.openqa.selenium.By;
import org.junit.Assert;

public class Testcase2 extends SuperTestCase{
	@Override
	public void body() throws Exception{
		WD.get("https://google.com.sg");
		WD.findElement(By.xpath("//input[@name='qr']")).sendKeys("Hello World");
		Assert.assertEquals("Great1!", "Great1!");
	}
}
