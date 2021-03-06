package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	// all web elements can be identified by @findby 
	WebDriver driver;
	By user = By.name("username");
	By password = By.name("password");
	
	
	By message = By.xpath("//p[contains[text(),'Please enter your username and password.']");
	By login = By.name("signon");
	
	
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//set username
	public void setUserName(String strUserName)
	{
		driver.findElement(user).sendKeys(strUserName);
	}
	
	//set password
	public void setPassword(String strPassword)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(strPassword);
	}
	
	//click on login
		public void clickLogin()
		{
			driver.findElement(login).click();
			
		}
		
	//get message of login page
		public String getLoginTitle()
		{
			return driver.findElement(message).getText();
		}
	 public void loginToApplication(String strUserName, String strPassword)
	 {
		 this.setUserName(strUserName);
		 this.setPassword(strPassword);
		 this.clickLogin();
	 }
}
