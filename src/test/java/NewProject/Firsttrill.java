package NewProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttrill {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("APjFqb")).sendKeys("facebook.com",Keys.ENTER);
		
		
		
	}

}
