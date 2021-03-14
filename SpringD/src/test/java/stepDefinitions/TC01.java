/*-----------------------------------------------
 * Search for accessories
 * Minimum three accessories should be displayed
 *-----------------------------------------------*/

package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjectFiles.Accessories;
import pageObjectFiles.CloseFrame;
import pageObjectFiles.NoOfAccessorries;
import pageObjectFiles.ProductnServices;
import pageObjectFiles.SelectAccessories;
import pageObjectFiles.Utility;
import resources.base;

@RunWith(Cucumber.class)
public class TC01 extends base
{
	@Given("^Usera is at eshop Home page$")
	public void usera_is_at_eshop_Home_page() throws Throwable {
		driver = InitialiseDriver();
		String str = driver.getTitle();
		Assert.assertEquals("Mobile, Fibre Broadband and TV services provider | Singtel", str);      // Assertions
		Utility.takeScreenshot(driver, "HomePage");
		System.out.println("Usera is at eshop Home page");

	}

	@When("^User looks for accessories in products & services menu$")
	public void user_looks_for_accessories_in_products_services_menu() throws Throwable {
		/*............................ Hover over Product and Services ............................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		ProductnServices pns = new ProductnServices(driver);         //import class instead of extending class
		WebElement hover = pns.getProductnServices();
		action.moveToElement(hover).build().perform();
		Utility.takeScreenshot(driver, "Menu");

		/*.................................  Click on Accessories .................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Accessories acc = new Accessories(driver);
		acc.getAccessories().click();
	
		String str = driver.getTitle();
		Assert.assertEquals("Accessories", str);      // Assertions
		System.out.println("User is at Accessorries page");

		/*.................................  Close Pop-ups     .......................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CloseFrame cframe = new CloseFrame(driver);
		cframe.closePopup().click();
		System.out.println("User looks for accessories in products & services menu");
		Utility.takeScreenshot(driver, "Accessorries");
	}

	@When("^User filters accessories by filter By, Brands and Sort By$")
	public void user_filters_accessories_by_filter_By_Brands_and_Sort_By() throws Throwable {
		/*.................................  Select filters        .................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		SelectAccessories sel = new SelectAccessories(driver);
		// Select deals
		WebElement selfil = sel.getCategories();
		Select dropdown1 = new Select(selfil);
		dropdown1.selectByValue("singtel:rrp/rrp-accessory-deals/apple");

		WebElement selbran = sel.getBrands();
		Select dropdown2 = new Select(selbran);
		dropdown2.selectByValue("Apple");

		WebElement selsort = sel.getSorts();
		Select dropdown3 = new Select(selsort);
		dropdown3.selectByValue("Price:High to Low");
		System.out.println("User filters accessories by filter By, Brands and Sort By");
		Utility.takeScreenshot(driver, "filter");

	}

	@Then("^user is displayed with minimum three Accessorries$")
	public void user_is_displayed_with_minimum_three_Accessorries() throws Throwable {
		NoOfAccessorries noa = new NoOfAccessorries(driver);
	    int num = noa.getNoOfAccessories();
		System.out.println("Value of Num" + num);
		
		//Assert.assertEquals(num>=3 );      // Assertions
        Assert.assertTrue(num>3);
		System.out.println("More than 3 accessorries found");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		driver.quit();
		System.out.println("User is displayed with minimum three Accessorries$");
	}

}
