package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
		public static WebDriver driver;
		
		@BeforeSuite
		public void initBrowser()
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
		
		@AfterSuite
		public void tearDown()
		{
			driver.quit();
		}
		

}
