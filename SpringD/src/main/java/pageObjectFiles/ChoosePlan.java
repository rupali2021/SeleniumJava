package pageObjectFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChoosePlan {
	public WebDriver driver;
	//By cpp = By.xpath("//div[@class='bb-header v-small-top' and text()='1Gbps']/parent::div/following-sibling::div[3]/div[2]/div[2]/button");
	//By cpp = By.xpath("//li[text()='Wireless Dual-band AC Access Point for new sign-ups']/parent::ul/parent::div/following-sibling::div[2]/div[2]/div[2]/button");
	By cpp = By.xpath("//section[@class='content  active']/div[3]/div/div/div/div/div[6]/div[2]/div[2]/button");
	public ChoosePlan(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getChoosePlan()
	{
		//return (WebElement) driver.findElements(cpp);
		List<WebElement> plan = driver.findElements(cpp);
		WebElement we = plan.get(0);
	    System.out.println("PLan........." + we);
		return we;
	}

}

