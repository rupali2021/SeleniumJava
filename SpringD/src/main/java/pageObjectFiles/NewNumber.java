package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewNumber {
public WebDriver driver;
	By nno = By.xpath("//div[@class='col5-unit small-6 columns'][1]");
	By p2c = By.xpath("//button[@class='ux-button button round proceed-button right' and text()='Proceed to Cart']");
public NewNumber(WebDriver driver)
{
	this.driver = driver;
}
public WebElement getNewNumber()
{
	return driver.findElement(nno);
}
public WebElement getProceedToCart()
{
	return driver.findElement(nno);
}
}
