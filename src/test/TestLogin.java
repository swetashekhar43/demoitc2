package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;

public class TestLogin 
{
	WebDriver driver;
	Login objLogin;
	
	HomePage objHomePage;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sweta Shekhar\\Desktop\\Eclipse Mars 2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	    driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=5D6C85C830D5AA7642CF8FF08CC83DCB?signonForm=");
	}
	
	@Test
	public void test_Home_Page_Appear_Correct()
	{
		objLogin = new Login(driver);
		
		String loginPageMessage = objLogin.getLoginTitle();
		System.out.println(loginPageMessage);
		Assert.assertTrue(loginPageMessage.contains("Please"));
		
		objLogin.loginToApplication("tarun", "itc@1234");
		objHomePage = new HomePage(driver);
		
		//verify homepage
		Assert.assertTrue(objHomePage.getHomePageDashUserName().contains("tarun"));
	}
	
}
