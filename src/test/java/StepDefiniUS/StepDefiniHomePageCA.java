package StepDefiniUS;

import org.apache.log4j.Logger;

import californiaUS.PageActionn.CaliforniaHomePageAction;
import californiaUS.Utillll.CaliforniaTestBase;
import californiaUS.Utillll.CaliforniaUtill;
import californiaUS.Utillll.Loggs_Helpper_Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefiniHomePageCA extends CaliforniaTestBase {

	CaliforniaHomePageAction californiaHomePageAction = new CaliforniaHomePageAction();

	Logger loggg = Loggs_Helpper_Log.getLogs(Loggs_Helpper_Log.class);

	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
		LaunchApplication(URL);
		CaliforniaUtill.takescreenshot(driver, "Home Page");
		loggg.info("Open URL");

	}

	@Then("^Enter Shirts in search box$")
	public void enter_Shirts_in_search_box() throws Throwable {
		californiaHomePageAction.EnterShirtsinsearchbox();
		loggg.info("Enter Shirts in search box");

	}

	@Then("^Click on Search Icon$")
	public void click_on_Search_Icon() throws Throwable {
		californiaHomePageAction.ClickonSearchIcon();
		loggg.info("Click on search icon");

	}

	@Then("^Search for specific product$")
	public void search_for_specific_product() throws Throwable {
		californiaHomePageAction.Searchforspecificproduct();
		CaliforniaUtill.takescreenshot(driver, "Specific Product");
		loggg.info("Search for specific product");
	}

	@Then("^Verify Specific product displayed$")
	public void verify_Specific_product_displayed() throws Throwable {
		californiaHomePageAction.VerifySpecificproductdisplayed();
		CaliforniaUtill.takescreenshot(driver, "Verify");
		loggg.info("Verify specific product displayed");
	}

	@Then("^selected item add to cart$")
	public void selected_item_add_to_cart() throws Throwable {
		californiaHomePageAction.Selecteditemaddtocart();
	}

	@Then("^move forward to next step$")
	public void move_forward_to_next_step() throws Throwable {
		californiaHomePageAction.Moveforwardtonextstep();

	}

	@Then("^customer verifies his shopping cart summary$")
	public void customer_verifies_his_shopping_cart_summary() throws Throwable {
		californiaHomePageAction.Customerverifieshisshoppingcartsummary();
	}

	@Then("^proceed to check out$")
	public void proceed_to_check_out() throws Throwable {
		californiaHomePageAction.Proceedtocheckout();

	}

}
