/**
 * 
 */
package com.wordpress.Testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

import lip.BaseClass;
import lip.GetExcelConfig;

/**
 * @author mkarthik
 *
 */
public class WordpressLogin extends BaseClass
{
	
	GetExcelConfig config;
	
	public WordpressLogin() throws Exception {
		config = new GetExcelConfig();
	}


	//WebDriver driver = this.driver();
	
		@Test(dataProvider="wordpressdata")
		public void loginToWodpress(String userid, String pass_word) throws Exception
		{
			LoginPage login=new LoginPage(this.driver());
			login.LoginToWordpress(userid, pass_word);	
			
			Assert.assertTrue(this.driver().getTitle().contains("Dashboard"),"Invalid Login");
		
			System.out.println("WordPress page is successfully logged in");
			Thread.sleep(2000);
		}
		
		
		@DataProvider(name="wordpressdata")
		public Object[][] passData()
		{
			int rows = config.getRowCount(0);
			
			Object[][] data = new Object[rows][2];
			
			for(int i=0; i<rows; i=i+1){
			
			 data[i][0]=config.getData(0, i, 0);
			 data[i][1]=config.getData(0, i, 1);
			
			}
			 return data;
//			data[0][0]= "admin1";
//			data[0][1]= "demo1";
//			
//			data[1][0]= "admin";
//			data[1][1]= "demo123";
//			
//			data[2][0]= "admin1";
//			data[2][1]= "demo2";
		}
	
}
