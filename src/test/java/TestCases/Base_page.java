package TestCases;	

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.sun.tools.javac.util.Options;

public class Base_page  {
	
	public Properties p;
	 
	 WebDriver driver;
	
	@BeforeClass
	
	public  void browSetup() throws IOException {
	
		
	FileReader file= new FileReader(".//src/test/resources/Config.properties"); 
	p=new Properties();
	p.load(file);
		
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--incognito");	
	driver=new ChromeDriver(opt);
	
	driver.manage().window().maximize();
	driver.get(p.getProperty("Google_url"));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

	
/*	@AfterTest
	
	public void tearDown() {
	
		driver.quit();
	
	}*/
	}