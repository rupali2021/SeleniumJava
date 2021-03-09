package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BroadbandPlansUnderBroadband 
{
	public WebDriver driver;
	By bbub = By.xpath("//a[@href='https://www.singtel.com/personal/products-services/broadband/fibre-broadband-plans' and text()='Broadband Plans']");
	public BroadbandPlansUnderBroadband(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getBroadbandPlansUnderBroadband()
	{
		return driver.findElement(bbub);		
	}
}
