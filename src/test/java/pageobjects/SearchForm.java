package test.java.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchForm {
	public SearchForm(WebDriver WD){
		//org.openqa.selenium.support.PageFactory;
		PageFactory.initElements(WD, this);
	}
	
	public static WebElement buttonSearch(WebDriver WD){
		return WD.findElement(By.xpath("//button[@name='btnG']"));
	}
	
	public static WebElement inputQ(WebDriver WD){
		return WD.findElement(By.xpath("//input[@name='q']"));
	}
	
	@FindBy(xpath="//button[@name='btnG']")
	public WebElement buttonSearch;
	@FindBy(xpath="//input[@name='q']")
	public WebElement inputQ;
}
