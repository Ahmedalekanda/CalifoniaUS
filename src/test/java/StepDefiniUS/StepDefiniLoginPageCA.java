package StepDefiniUS;

import californiaUS.PageActionn.CaliforniaHomePageAction;
import californiaUS.PageActionn.CaliforniaLogginPageAction;
import californiaUS.Utillll.CaliforniaTestBase;
import californiaUS.Utillll.CaliforniaUtill;
import cucumber.api.java.en.Then;

public class StepDefiniLoginPageCA extends CaliforniaTestBase {
	
	CaliforniaHomePageAction californiaHomePageAction = new CaliforniaHomePageAction();
	CaliforniaLogginPageAction californiaLogginPageAction = new CaliforniaLogginPageAction();
	
	
	@Then("^Click on Signin Button$")
	public void click_on_Signin_Button() throws Throwable {
		californiaHomePageAction.ClickonSigninButton();
	   
	}

	@Then("^Enter User Email Password and Click Signin Icon$")
	public void enter_User_Email_Password_and_Click_Signin_Icon() throws Throwable {
		californiaLogginPageAction.usercard(prop.getProperty("userx"), prop.getProperty("usery"));
		
	    
	}

	@Then("^Verify User in the Profile Page$")
	public void verify_User_in_the_Profile_Page() throws Throwable {
		californiaLogginPageAction.VerifyUserintheProfilePage();
	  
	}

	@Then("^Check user in order details Page$")
	public void check_user_in_order_details_Page() throws Throwable {
		californiaLogginPageAction.CheckuserinorderdetailsPage();
		CaliforniaUtill.takescreenshot(driver, "Order details");
	}

	@Then("^Finally Verify user successfully enters order history page$")
	public void finally_Verify_user_successfully_enters_order_history_page() throws Throwable {
		californiaLogginPageAction.Verifyusersuccessfullyentersorderhistorypage();
	}


}
