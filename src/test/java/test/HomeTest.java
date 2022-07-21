package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class HomeTest {
	
		WebDriver driver;
		HomePage hp;
		LoginPage lp;
	
		 @BeforeSuite
		  public void BeforeSuite() 
		  {
			 WebDriverManager.chromedriver().setup();
			 
			// Step -1 Launch browser
			 driver = new ChromeDriver();

			// step-2 max window
			 driver.manage().window().maximize();

			 // step-3 open web application
			 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

			 // step-4 dynamic wait
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  }
		  
		 @BeforeClass
		  public void initObject() 
		  {
			 hp=new HomePage(driver);
			 lp=new LoginPage(driver);
		  }
		 
		 @BeforeMethod
		  public void login() 
		  {
			 lp.enterCred("Admin","admin123");
			 lp.clcikButton();
		  }
		 
		  @Test
		  public void logout() 
		  {
			  hp.logout();
		  }
		
		  @AfterSuite
		  public void tearDown() 
		  {
			  driver.close();
		  }

}
