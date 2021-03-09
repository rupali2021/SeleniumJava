package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstallationAddress 
{
	public WebDriver driver;
	By pcd = By.id("r-157");
	By ret = By.cssSelector(".ux-button.button.default.postal-code-input-button.round.fullwidth ");
	By fno = By.xpath("//select[@id='select-floor' and @name='floor']");
	By uno = By.xpath("//select[@id='select-unit' and @name='unit']");
	By cfa = By.cssSelector(".ux-button.button.round.small-only-expand.check-fibre-availability.v-normal-top");
	public InstallationAddress(WebDriver driver) 
	{
		this.driver = driver;
	}
	public WebElement getPostalCode()
	{
		return driver.findElement(pcd);	
	}
	public WebElement getRetrieve()
	{
		return driver.findElement(ret);	
	}
	public WebElement getFloorNo()
	{
		return driver.findElement(fno);	
	}
	public WebElement getUnitNo()
	{
		return driver.findElement(uno);	
	}
	public WebElement getCheckFibreAvai()
	{
		return driver.findElement(cfa);	
	}
}