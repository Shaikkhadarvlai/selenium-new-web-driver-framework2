package Amazontest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import AmazonProjectPage.AmazonPage;

public class BaseClass
{

	public WebDriver driver;
	public AmazonPage ap;
	
	@BeforeTest
	public void setupBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ap=new AmazonPage(driver);
		
	}
	
	@BeforeClass
	public void setupPage()
	{
	
		
	}
	
	
}
