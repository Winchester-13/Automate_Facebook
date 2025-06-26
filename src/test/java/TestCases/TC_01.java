package TestCases;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.PageObject_fb;
import PageObjects.PageObject_google;

class TC_01 extends Base_page{
	
	PageObject_google obj;
	
	/*@Test(priority=1)
	public void browserGoogle() {
		
		obj=new PageObject_google(driver);
		
		obj.searchOnGoogle("Facebook");
		obj.clickSearchBtn();
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(obj.fb_link));

		obj.clickFbLink();
		
		
		
		}*/
	
	
	@Test(priority=2)
	
	public void browseFacebook() {
		
		PageObject_fb fb_obj=new PageObject_fb(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(fb_obj.username));
		fb_obj.userName(p.getProperty("username"));
		
		wait.until(ExpectedConditions.visibilityOf(fb_obj.pwd));
		fb_obj.passWord(p.getProperty("pwd"));
		
		fb_obj.clickLogin();
		
	
		wait.until(ExpectedConditions.visibilityOf(fb_obj.msgs));
		fb_obj.clickMsgs();
		
	}
	
}
