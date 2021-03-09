package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPlanOrCustomer 
{
	public WebDriver driver;
	By nfbb = By.xpath("//div[@class='section-header title'][text()='I want a new Fibre Broadband plan']");
	By ncust = By.xpath("//div[@class='section-header title' and text()='I am a New Customer']");
	public NewPlanOrCustomer(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getNewFibreBand()
	{
		return driver.findElement(nfbb);		
	}
	public WebElement getNewCustomer()
	{
		return driver.findElement(ncust);		
	}
}
	