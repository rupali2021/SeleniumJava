package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectFiles.Accessories;
import pageObjectFiles.CloseFrame;
import pageObjectFiles.ProductnServices;
import pageObjectFiles.SelectAccessories;
import resources.base;

//@RunWith(Cucumber.class)
public class TC01 extends base
{
	@Given("^Usera is at eshop Home page$")
	public void usera_is_at_eshop_Home_page() throws Throwable {
		driver = InitialiseDriver();
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

		/*.................................  Click on Accessories .................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Accessories acc = new Accessories(driver);
		acc.getAccessories().click();

		/*.................................  Close Popup     .......................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CloseFrame cframe = new CloseFrame(driver);
		cframe.closePopup().click();
		System.out.println("User looks for accessories in products & services menu");
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
		dropdown2.selectByValue("APPLE");

		WebElement selsort = sel.getSorts();
		Select dropdown3 = new Select(selsort);
		dropdown3.selectByValue("Price:High to Low");
		System.out.println("User filters accessories by filter By, Brands and Sort By");

	}

	@Then("^user is displayed with minimum three Accessorries$")
	public void user_is_displayed_with_minimum_three_Accessorries() throws Throwable {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		driver.quit();
		System.out.println("user is displayed with minimum three Accessorries$");
	}

}
