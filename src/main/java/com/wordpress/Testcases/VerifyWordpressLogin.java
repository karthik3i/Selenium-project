/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.wordpress.pages.LoginPage;
import org.testng.annotations.*;

/**
 * @author mkarthik
 *
 */
public class VerifyWordpressLogin {
	
	@Test
	public void VerifyValidLogin() throws InterruptedException{
//	System.setProperty("webdriver.gecko.driver", "/opt/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		LoginPage login = new LoginPage(driver);
		login.LoginToWordpress("admin", "demo123");
		Thread.sleep(10000);
		driver.quit();	
	}

}
