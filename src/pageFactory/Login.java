package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;
	@FindBy(name="username")
	WebElement username;
	//By password = By.name("password");
	@FindBy(name="password")
	WebElement password;
	
	//By message = By.xpath("//p[contains[text(),'Please enter your username and password.']");
	@FindBy(xpath="//p[contains[text(),'Please enter your username and password.']")
	WebElement message;
	
	//By login = By.name("signon");
	@FindBy(name="signon")
	WebElement login;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //initialise page factory
		
	}
}
