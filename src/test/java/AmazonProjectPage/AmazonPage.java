package AmazonProjectPage;

import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.com.Utility123;

public class AmazonPage {
	private WebDriver driver;

	public AmazonPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators

	private By option = By.id("searchDropdownBox");
	private By searchbox = By.id("twotabsearchtextbox");
	private By watche = By.xpath("(//img[@class='s-image'])[3]");

	private By addcart = By.xpath("//input[@id='add-to-cart-button']");
  private By gotocart=By.xpath("//span[@id='nav-cart-count']");
  private By proced=By.name("proceedToRetailCheckout");
	// Methods
	public void testoption() {
		WebElement opt = driver.findElement(option);

		Utility123.selectBasedDropdown(opt, "Watches");
		Utility123.getScreenshot(driver);

		driver.findElement(searchbox).sendKeys("Watches", Keys.ENTER);

		driver.findElement(watche).click();
		Utility123.getScreenshot(driver);
	}

	public void addcart()

	{

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> a = windows.iterator();
		String Parentswindow = a.next();
		String Childwindow = a.next();
		driver.switchTo().window(Childwindow);

		WebElement add = driver.findElement(addcart);
		add.click();
		Utility123.getScreenshot(driver);
	}
	
}
