package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloseFrame 
{
	public WebDriver driver;
	By frame = By.xpath("//img[@class='LPMcloseButton']");
	public CloseFrame(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement closePopup()
	{
		return driver.findElement(frame);
	}
}
