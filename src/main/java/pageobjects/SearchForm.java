package main.java.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchForm {
	private WebDriver WD;
	public SearchForm(WebDriver WD){
		//org.openqa.selenium.support.PageFactory;
		this.WD=WD;
		PageFactory.initElements(WD, this);
	}
	@FindBy(xpath="//button[@name='btnG']")
	public WebElement buttonSearch;
	@FindBy(xpath="//input[@name='q']")
	public WebElement inputQ;
}
