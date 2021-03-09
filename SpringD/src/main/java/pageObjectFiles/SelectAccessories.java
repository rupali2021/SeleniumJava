package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectAccessories 
{
	public WebDriver driver;
	//By filter = By.xpath("//span[@id='select-deal ' and text()='All Categories']");
	By filter = By.id("select-deal");
	By brands = By.cssSelector("select#select-brand");
	By sorts = By.cssSelector("select#select-sort");

	public SelectAccessories(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getCategories()
	{
		return driver.findElement(filter);
	}
	public WebElement getBrands()
	{
		return driver.findElement(brands);
	}
	public WebElement getSorts()
	{
		return driver.findElement(sorts);
	}
}
