package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ProductnServices 
{
	public WebDriver driver;
	By prod = By.xpath("//a[@href='https://www.singtel.com/personal/products-services' and @class='header-link inactive']");
	
	
	public ProductnServices(WebDriver driver)                                             // *** constructor ***
	{
		this.driver = driver;
	}
	public WebElement getProductnServices()
	{
		return driver.findElement(prod);
	}
}
