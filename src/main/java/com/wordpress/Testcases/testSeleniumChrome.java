package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lip.ConfigReader;

public class testSeleniumChrome {
	ConfigReader config;
	
	@BeforeTest
	public void SetUp() throws Exception{
		config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.GetChromeDriver());
			
	}
	
	@Test
	public void LoadChromeBrowser(){
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.GetAppURL());	
		driver.quit();
	}

}
