package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest1 extends BaseTest 
{
			HomePage hp;
			LoginPage lp;
			
			@BeforeClass
			public void initObject()
			{
				hp=new HomePage(driver);
				lp=new LoginPage(driver);
			}
			
			@Test
			public void logout()
			{
				hp.logout();
			}

}
