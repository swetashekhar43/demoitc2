package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver driver;
	
	By homePageUserName = By.xpath("//div[@id='WelcomeContent']");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//get username from homepage
	
	public String getHomePageDashUserName()
	{
		return driver.findElement(homePageUserName).getText();
	}
}
