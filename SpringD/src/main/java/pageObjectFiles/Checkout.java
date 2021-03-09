package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
	By chp = By.xpath("//div[@class='left v-medium-top' and text()='1G Fibre Hm HDL']");
	By vpl = By.xpath("//div[@class='left row-data' and text()='24 mths Family Starter'][0]");
	By gpt = By.xpath("//div[text()='Total (Inclusive of GST)'][1]");
	By gp = By.xpath("//div[@class='section-header right'][1]");
	By cho = By.xpath("//button[@class='ux-button button button round right ' and text()='Checkout']");
	public WebDriver driver;
	public Checkout(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getPlan()
	{
		return driver.findElement(chp);
	}
	public WebElement getSgPlan()
	{
		return driver.findElement(vpl);
	}
	public WebElement getPricetext()
	{
		return driver.findElement(gpt);
	}
	public WebElement getTotalPrice()
	{
		return driver.findElement(gp);
	}
	public WebElement getCheckout()
	{
		return driver.findElement(cho);
	}
}
