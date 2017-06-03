package main.java.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TopNavigation {
	private WebDriver WD;
	public TopNavigation(WebDriver WD){
		this.WD=WD;
		//org.openqa.selenium.support.PageFactory;
		PageFactory.initElements(WD, this);
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
