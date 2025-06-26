package PageObjects;
import java.beans.Visibility;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base_Constructor;

public class PageObject_google extends Base_Constructor{
		
	WebDriver driver;
	
	public PageObject_google(WebDriver driver){
		
		super(driver);
		PageFactory.initElements(driver,this);	
			
	}
	
	
	@FindBy(how=How.XPATH, using="//*[@title='Search']")
	WebElement searchGoogle;
	

	@FindBy(how=How.XPATH, using="(//*[@value=\"Google Search\"])[2]")
	WebElement searchbtn;
	

	@FindBy(how=How.XPATH, using="(//*[contains(text(), 'Facebook - log in or sign up')])[1]")
	public WebElement fb_link;
	

	
	public void searchOnGoogle(String s) {
		searchGoogle.sendKeys(s);
		
	}
	
	public void clickSearchBtn() {
		searchbtn.click();
	
	}
	
	public void clickFbLink() {
		fb_link.click();
	}
	


	
}


	
	

