package californiaUS.PageActionn;

import org.testng.Assert;

import californiaUS.PageLocatorr.CaliforniaLogginPageLocatorr;
import californiaUS.Utillll.CaliforniaTestBase;

public class CaliforniaLogginPageAction extends CaliforniaTestBase {
	
	CaliforniaLogginPageLocatorr californiaLogginPageLocatorr = new CaliforniaLogginPageLocatorr();

	public void usercard(String u, String p) {
		californiaLogginPageLocatorr.Email.sendKeys(u);
		californiaLogginPageLocatorr.Password.sendKeys(p);
		californiaLogginPageLocatorr.Login.click();
		
		
	}
	
	public void VerifyUserintheProfilePage() {
		boolean profile=californiaLogginPageLocatorr.UserintheProfilePage.isDisplayed();
		Assert.assertTrue(profile);
		
	}	
	public void CheckuserinorderdetailsPage() {
		californiaLogginPageLocatorr.orderdetailsPage.click();
		
		
	}
	
	public void Verifyusersuccessfullyentersorderhistorypage() {
		boolean orderhistory=californiaLogginPageLocatorr.entersorderhistorypage.isDisplayed();
		Assert.assertTrue(orderhistory);
		
		
	}
		
}
