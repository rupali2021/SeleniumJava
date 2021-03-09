package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjectFiles.Checkout;
import pageObjectFiles.ChoosePack;
import pageObjectFiles.InstallationAddress;
import pageObjectFiles.NewPlanOrCustomer;
import pageObjectFiles.PackUnderTv;
import pageObjectFiles.ProductnServices;
import resources.base;

@RunWith(Cucumber.class)
public class TC03 extends base {
	@Given("^Userc is at eshop Home page$")
	public void userc_is_at_eshop_Home_page() throws Throwable {
		driver = InitialiseDriver();
		System.out.println("8");
	}

	@When("^User looks for packs in TV menu$")
	public void user_looks_for_packs_in_TV_menu() throws Throwable {
		/*............................ Hover over Product and Services ............................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		ProductnServices pns = new ProductnServices(driver);         //import class instead of extending class
		WebElement hover = pns.getProductnServices();
		action.moveToElement(hover).build().perform();

		/*................................. Broadband plans under BB ................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PackUnderTv putv = new PackUnderTv(driver);
		putv.getPackUnderTv().click();
		System.out.println("9");
	}

	@When("^Select new packs$")
	public void select_new_packs() throws Throwable {
		/*................................. View packs for customer  ................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ChoosePack cp_driver = new ChoosePack(driver);
		cp_driver.getViewPacks().click();
		cp_driver.getSelectPacks().click();
		/*....................................Select new Customer  ..................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		NewPlanOrCustomer nfb = new NewPlanOrCustomer(driver);
		nfb.getNewCustomer().click();
		System.out.println("10");
	}

	@Then("^Enters postal code, floor No and unit No for New customer$")
	public void enters_postal_code_floor_No_and_unit_No_for_New_customer() throws Throwable {
		/*.................................  Enter Address details  .................................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		//enter postal code
		InstallationAddress ad_driver = new InstallationAddress(driver);
        ad_driver.getPostalCode().sendKeys("520420");
        //retrieve postal code
        ad_driver.getRetrieve().click();
        //enter floor number
        WebElement selfn = ad_driver.getFloorNo();
        Select dropdown4 = new Select(selfn);
        dropdown4.selectByIndex(01);        
        //enter unit number
        WebElement selun = ad_driver.getUnitNo();
        Select dropdown5 = new Select(selun);
        dropdown5.selectByIndex(02);
        //check fiber availability
        ad_driver.getCheckFibreAvai().click();
		System.out.println("11");
	}

	@Then("^Check fibre availbility for new customer$")
	public void check_fibre_availbility_for_new_customer() throws Throwable {
        //proceed to cart
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Checkout ch_driver = new Checkout(driver);
        String text = ch_driver.getSgPlan().getText();
        System.out.println(text);
        String text1 = ch_driver.getPricetext().getText();
        System.out.println(text1);
        String text2 = ch_driver.getTotalPrice().getText();
        System.out.println(" : /t" + text2);
        //checkout
        ch_driver.getCheckout().click();
		System.out.println("12");
	}

	@Then("^new user is displayed with plan details and Total in shopping card$")
	public void new_user_is_displayed_with_plan_details_and_Total_in_shopping_card() throws Throwable {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		driver.quit();
		System.out.println("13");
	}
}
