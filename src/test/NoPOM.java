package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoPOM 
{
	@Test
	public void test_Home_Page_Appear()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sweta Shekhar\\Desktop\\Eclipse Mars 2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	    driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=5D6C85C830D5AA7642CF8FF08CC83DCB?signonForm=");
	    
	    driver.findElement(By.name("username")).sendKeys("tarun");
	    driver.findElement(By.name("password")).clear();
	 
	    driver.findElement(By.name("password")).sendKeys("itc@1234");
	    driver.findElement(By.name("signon")).click();
	    driver.findElement(By.xpath("//div[@id='WelcomeContent']")).getText();
	    
	    
	    //to verify login successful
	    Assert.assertTrue(homeText.contains("tarun"));
	    
	}
}
