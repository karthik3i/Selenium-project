/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author mkarthik
 *
 */
public class LoginPage {
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.name("pwd");
	By submit_button = By.id("wp-submit");
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	public void LoginToWordpress(String userid, String pass_word){
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass_word);
		driver.findElement(submit_button).click();
	}

}
