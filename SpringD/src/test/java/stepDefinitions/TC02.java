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
import pageObjectFiles.BroadbandPlansUnderBroadband;
import pageObjectFiles.ChoosePlan;
import pageObjectFiles.Continue;
import pageObjectFiles.InstallationAddress;
import pageObjectFiles.NewNumber;
import pageObjectFiles.NewPlanOrCustomer;
import pageObjectFiles.ProductnServices;
import pageObjectFiles.Utility;
import resources.base;

@RunWith(Cucumber.class)
public class TC02 extends base {
	
	@Given("^Userb is at eshop Home page$")
	public void userb_is_at_eshop_Home_page() throws Throwable {
		driver = InitialiseDriver();
		System.out.println("Usera is at eshop Home page");
		Utility.takeScreenshot(driver, "HomePage1");
	}

	@When("^User looks for Broadband plan in Boardband menu$")
	public void user_looks_for_Broadband_plan_in_Boardband_menu() throws Throwable {
		/*............................ Hover over Product and Services ............................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		ProductnServices pns = new ProductnServices(driver);         //import class instead of extending class
		WebElement hover = pns.getProductnServices();
		action.moveToElement(hover).build().perform();
		Utility.takeScreenshot(driver, "Menu1");

		/*................................. Broadband plans under BB ................................*/
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		BroadbandPlansUnderBroadband bbub = new BroadbandPlansUnderBroadband(driver);
		bbub.getBroadbandPlansUnderBroadband().click();
		
		//Assert.assertEquals("Fibre Broadband Plans on Singtel's #1 Network", driver.getTitle());      // Assertions
		System.out.println("User is at Broadband Plans page");
		System.out.println(driver.getTitle());
	}

	@When("^Selects (\\d+) Gbps fibre plan$")
	public void selects_Gbps_fibre_plan(int arg1) throws Throwable {
		/*.................................... Choose Plan ......... ................................*/
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		Utility.takeScreenshot(driver, "Chooseplan");
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
		ChoosePlan cp_driver = new ChoosePlan(driver);
		cp_driver.getChoosePlan().click();
		
		/*............................Select new fibre broadband plan  .............................*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		NewPlanOrCustomer nfb = new NewPlanOrCustomer(driver);
		nfb.getNewFibreBand().click();
		System.out.println("Fibre broanband selected");
		Utility.takeScreenshot(driver, "fibreSelection");
	}

	@Then("^Enters postal code, floor No and unit No for New fibre Broadband Plan$")
	public void enters_postal_code_floor_No_and_unit_No_for_New_fibre_Broadband_Plan() throws Throwable {
		/*.................................  Enter Address details  .................................*/
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		//enter postal code
		InstallationAddress ad_driver = new InstallationAddress(driver);
        ad_driver.getPostalCode().sendKeys("529774");
        //retrieve postal code
        ad_driver.getRetrieve().click();
        //enter floor number
        WebElement selfn = ad_driver.getFloorNo();
        System.out.println(".......flllooorr number......." + selfn);
        Select dropdown4 = new Select(selfn);
        dropdown4.selectByValue("02");	        
        //enter unit number
        WebElement selun = ad_driver.getUnitNo();
        Select dropdown5 = new Select(selun);
        dropdown5.selectByValue("#02-01");
		Utility.takeScreenshot(driver, "address1");
        //check fiber availability
        ad_driver.getCheckFibreAvai().click();
		System.out.println("Check Fibre availablility");
	}

	@Then("^Check fibre availbility for new plan$")
	public void check_fibre_availbility_for_new_plan() throws Throwable {

		/*.....................................      Continue       .................................*/
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Continue con_driver = new Continue(driver);
        con_driver.getContinue().click();
		Utility.takeScreenshot(driver, "Continue1");
		System.out.println("Click Continue");
	}

	@Then("^Enters new number for fibre plan$")
	public void enters_new_number_for_fibre_plan() throws Throwable {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        NewNumber nno_driver = new NewNumber(driver);
        nno_driver.getNewNumber().click();
        // continue
        Continue con_driver = new Continue(driver);
        con_driver.getContinue().click();
        nno_driver.getProceedToCart().click();
		System.out.println("New number entered");
		Utility.takeScreenshot(driver, "newnumber1");
	}

	@Then("^User is displayed with plan details and Total in shopping card$")
	public void user_is_displayed_with_plan_details_and_Total_in_shopping_card() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		driver.quit();
		System.out.println("7");
	}
}
