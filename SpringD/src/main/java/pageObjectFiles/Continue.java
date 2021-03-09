package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Continue {
	public WebDriver driver;
	//By cont = By.cssSelector(".ux-button.button.round.small-only-expand.continue-button ");
	By cont = By.xpath("//button[@type='button' and text()='Continue']");
	public Continue(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getContinue()
	{
		return driver.findElement(cont);
	}

}
