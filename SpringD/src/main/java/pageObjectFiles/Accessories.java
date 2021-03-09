package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//-- https://www.techbeamers.com/use-locators-selenium/#:~:text=Locators%20provide%20a%20way%20to,checkboxes%20and%20other%20web%20elements. -- >
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Accessories 
{
	public WebDriver driver;
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//a[@href='https://www.singtel.com/personal/products-services/mobile/accessories']")));
	
	By acce = By.xpath("//a[@href='https://www.singtel.com/personal/products-services/mobile/accessories' and text()='Accessories']");

	public Accessories(WebDriver driver) 
	{
		this.driver = driver;
	}

	public WebElement getAccessories()
	{
		return driver.findElement(acce);
	}

}
