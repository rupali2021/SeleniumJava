package pageObjectFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PackUnderTv 
{
	public WebDriver driver;
	By putv = By.xpath("//a[@href='https://www.singtel.com/personal/products-services/tv/packs' and text()='Packs']");
	public PackUnderTv(WebDriver driver) 
	{
		this.driver = driver;
	}
	public WebElement getPackUnderTv()
	{
		return driver.findElement(putv);
	}
}
