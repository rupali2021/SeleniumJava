package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChoosePack {
	public WebDriver driver;
	By vsp = By.xpath("//a[text()='View Starter Packs']");
	By ssp = By.xpath("//*[@id=\"_content_singtel_en_personal_products-services_tv_packs_starter_jcr_content_par_sd_component_pagesec_contentDiv\"]/div/div/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div[4]/div/div/button");
	
	public ChoosePack(WebDriver driver) 
	{
		this.driver = driver;
	}
	public WebElement getViewPacks()
	{
		return driver.findElement(vsp);
	}
	public WebElement getSelectPacks()
	{
		return driver.findElement(ssp);
	}
}
