package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NoOfAccessorries 
{
	public WebDriver driver;
	public int n=1;
	String No;

	public NoOfAccessorries(WebDriver driver) 
	{
		this.driver = driver;
	}

	public int getNoOfAccessories()
	{
		System.out.println("INSIDE");
	    java.util.List<WebElement> lst = driver.findElements(By.cssSelector(".panel.clearfix.rrp-panel-height"));
		System.out.println("NM" + lst.size());
		int count = lst.size();
		return count;
	}

}
