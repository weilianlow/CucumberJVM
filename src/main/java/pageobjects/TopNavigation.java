package main.java.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TopNavigation {
	public TopNavigation(WebDriver WD){
		//org.openqa.selenium.support.PageFactory;
		PageFactory.initElements(WD, this);
	}

	public static WebElement aAll(WebDriver WD){
		return WD.findElement(By.xpath("//a[@class='q qs' and text()='All']"));
	}
	
	public static WebElement aImages(WebDriver WD){
		return WD.findElement(By.xpath("//a[@class='q qs' and text()='Images']"));
	}
	
	public static WebElement aVideos(WebDriver WD){
		return WD.findElement(By.xpath("//a[@class='q qs' and text()='Videos']"));
	}
	
	public static WebElement aMaps(WebDriver WD){
		return WD.findElement(By.xpath("//a[@class='q qs' and text()='Maps']"));
	}
	
	public static WebElement anews(WebDriver WD){
		return WD.findElement(By.xpath("//a[@class='q qs' and text()='News']"));
	}
	
	public static WebElement aSettings(WebDriver WD){
		return WD.findElement(By.xpath("//a[@class='q qs' and text()='All']"));
	}
	
	public static WebElement aTools(WebDriver WD){
		return WD.findElement(By.xpath("//a[@class='hdtb-tl' and text()='Tools']"));
	}
	
	@FindBy(xpath="//a[@class='q qs' and text()='All']")
	public WebElement aAll;
	
	@FindBy(xpath="//a[@class='q qs' and text()='Images']")
	public WebElement aImages;
	
	@FindBy(xpath="//a[@class='q qs' and text()='Videos']")
	public WebElement aVideos;
	
	@FindBy(xpath="//a[@class='q qs' and text()='Maps']")
	public WebElement aMaps;
	
	@FindBy(xpath="//a[@class='q qs' and text()='News']")
	public WebElement anews;
	
	@FindBy(xpath="//a[@class='q qs' and text()='All']")
	public WebElement aSettings;
	
	@FindBy(xpath="//a[@class='hdtb-tl' and text()='Tools']")
	public WebElement aTools;
}
