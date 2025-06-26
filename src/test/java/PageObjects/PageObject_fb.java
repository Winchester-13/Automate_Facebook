package PageObjects;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base_Constructor;


public class PageObject_fb extends Base_Constructor {
	
	public PageObject_fb(WebDriver driver){
		
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	

	@FindBy(how=How.XPATH, using="//*[@aria-label=\"Email address or phone number\"]")
	public WebElement username;


	@FindBy(how=How.XPATH, using="//*[@aria-label=\"Password\"]")
	public WebElement pwd;
	
	
	@FindBy(how=How.XPATH, using="(//*[@name=\"login\"])")
	WebElement loginbtn;
	
	
	@FindBy(how=How.XPATH, using="//*[@stroke-width=\"1\"]")
	public WebElement msgs;
	
	
	@FindBy(how=How.XPATH, using="(//*[contains(text(),'Sabyasachi Sinha')])[1]")
	public  WebElement Sabida;
	
	public void userName(String user_name) {
		
		username.sendKeys(user_name);
		
		
	}
	
	public void passWord(String pass) {
		
		pwd.sendKeys(pass);
		
		
	}
	
	public void clickLogin() {
		
		loginbtn.click();
		
	}	
	
	
	public void clickMsgs() {
		
		msgs.click();
		
	}	
	
	public void clickSabida() {
		
		Sabida.click();
	
}	

}
