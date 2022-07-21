package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
			
			//My first dummy commit - to pull
			@FindBy(xpath="//*[@id='welcome']")
			private WebElement userMenu;
			
			@FindBy(xpath="//*[@id='welcome-menu']//child::li//a[text()='Logout']")
			private WebElement logoutLink;
			
			public HomePage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);		
			}
			
			public void logout()
			{
				userMenu.click();
				logoutLink.click();
			}
			
}
