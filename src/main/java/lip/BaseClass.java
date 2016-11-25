package lip;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	ConfigReader config;
	
	public BaseClass() throws Exception
	{
		  config = new ConfigReader();
	}
	
 @BeforeMethod	
 public void setupApplication() throws Exception
	{
	    //driver =new FirefoxDriver();	
	    driverInitiation();
		driver.get(config.GetAppURL());
	}
	
 @AfterMethod		
 public void closeBrowser()
	{
		driver.close();
	}
 
  public WebDriver driver(){
	 return driver;
  }
  
  public void driverInitiation()
  {
	 String BrowserName = config.GetbrowserName();
	 
	 if(BrowserName == "FireFox" || BrowserName == "FF") {
		 driver =new FirefoxDriver();
	 }else if (BrowserName.equalsIgnoreCase("Chrome")){
		 System.setProperty("webdriver.chrome.driver", config.GetChromeDriver());
		 driver =new ChromeDriver();
	 }else if (BrowserName.equalsIgnoreCase("IE")){
		 driver =new InternetExplorerDriver(); 
	 }else if(BrowserName.equalsIgnoreCase("HTML")){
		 driver =new HtmlUnitDriver(); 
	 }else{
		 driver =new FirefoxDriver();
	 }	 
	 driver.manage().window().maximize();
	 
	 Reporter.log("=====Browser Session Started=====", true);
  }

}
