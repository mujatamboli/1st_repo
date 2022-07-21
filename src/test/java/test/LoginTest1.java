package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest1 extends BaseTest{
		 
		LoginPage lp;
		@BeforeClass
		public void initObject()
		{
			lp=new LoginPage(driver);
		}
		
		@Test
		public void login()
		{
			lp.enterCred("Admin","admin123");
			lp.clcikButton();
			Assert.assertTrue(true);
		}
}
