package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChoosePlan {
	public WebDriver driver;
	//By cpp = By.xpath("//div/div/div/div/div/div[2]/div[@class='bb-header v-small-top' and text()='1Gbps']/parent::div/following-sibling::div[3]/div[2]/div[2]/button");
	By cpp = By.xpath("//*[@id=\'_content_singtel_en_personal_products-services_broadband_fibre-broadband-plans_jcr_content_par_sd_component_pagesec_contentDiv\']/div/div/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div/section[1]/div[3]/div/div[1]/div/div/div[5]/div[2]/div[2]/button");
	public ChoosePlan(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getChoosePlan()
	{
		return driver.findElement(cpp);
	}

}

