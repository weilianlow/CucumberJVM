package main.java.automationframework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.Reporter;

public  class TestNGCustomReporter {
	static int stepNumber;
	static String temp;
	
	public static void resetReporter(){
		stepNumber = 0;
	}
	
	public static void logPassed(String message, WebDriver WD) throws Exception{
		temp = "[Passed] Step-" + (++stepNumber) + ": " + message;
		temp = temp.replace("\"", "&quot;").replace("'", "&#39;");
		
		if (Boolean.parseBoolean(Props.getProperty("SCREENSHOT_ENABLED_PASSED")))
			Reporter.log("<a href='" + captureScreenshot(Props.getProperty("rsl.dir") + "\\temp\\img",WD)
						 + "' data-lightbox='aaa' data-title='" + temp + "'>" + temp + "</a><br/>\n");
		else
			Reporter.log(temp + "<br/>\n");
	}

	public static void logFailed(String message, WebDriver WD) throws Exception{
		temp = "[Failed] Step-" + (++stepNumber) + ": " + message;
		temp = temp.replace("\"", "&quot;").replace("'", "&#39;");
		
		if (Boolean.parseBoolean(Props.getProperty("SCREENSHOT_ENABLED_FAILED")))
			Reporter.log("<a href='" + captureScreenshot(Props.getProperty("rsl.dir") + "\\temp\\img",WD)
						 + "' data-lightbox='aaa' data-title='" + temp + "'>" + temp + "</a><br/>\n");
		else
			Reporter.log(temp + "<br/>\n");
		
		Assert.fail(message);
	}
	
	public static void logDone(String message, WebDriver WD) throws Exception{
		temp = "[Done] Step-" + (++stepNumber) + ": " + message;
		temp = temp.replace("\"", "&quot;").replace("'", "&#39;");
		
		if (Boolean.parseBoolean(Props.getProperty("SCREENSHOT_ENABLED_DONE")))
			Reporter.log("<a href='" + captureScreenshot(Props.getProperty("rsl.dir") + "\\temp\\img",WD)
						 + "' data-lightbox='aaa' data-title='" + temp + "'>" + temp + "</a><br/>\n");
		else
			Reporter.log(temp + "<br/>\n");
	}
	
	public static String captureScreenshot(String imgFolder, WebDriver WD) throws Exception{
		File dir = new File(imgFolder);
		if (!dir.exists()) dir.mkdir();
		File scrFile = ((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
    	String imgName = new SimpleDateFormat(Props.getProperty("TIMESTAMP_FORMAT2")).format(new Date()) + "_" + stepNumber + "." + Props.getProperty("IMG_TYPE");
    	FileUtils.copyFile(scrFile, new File(imgFolder,imgName));
		return "..\\img\\" + imgName;
	}
}
