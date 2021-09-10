package californiaUS.PageActionn;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import californiaUS.PageLocatorr.CaliforniaHomePageLocator;
import californiaUS.Utillll.CaliforniaTestBase;
import californiaUS.Utillll.CaliforniaTestData;

public class CaliforniaHomePageAction extends CaliforniaTestBase {

	CaliforniaHomePageLocator californiaHomePageLocator = new CaliforniaHomePageLocator();

	public void EnterShirtsinsearchbox() {
		californiaHomePageLocator.Searchbox.sendKeys(CaliforniaTestData.garment);

	}

	public void ClickonSearchIcon() {
		californiaHomePageLocator.ClickSearchIcon.click();

	}

	public void Searchforspecificproduct() {
		californiaHomePageLocator.SpecificProduct.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

	}

	public void VerifySpecificproductdisplayed() {
		boolean Resultss = californiaHomePageLocator.Productdisplayed.isDisplayed();
		Assert.assertTrue(Resultss);

	}

	public void ClickonSigninButton() {
		californiaHomePageLocator.SigninButton.click();

	}

	public void Selecteditemaddtocart() {
		californiaHomePageLocator.Addtocart.click();
	}

	public void Moveforwardtonextstep() {
		californiaHomePageLocator.Forwardtonextstep.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
	}

	public void Customerverifieshisshoppingcartsummary() {
		boolean Resultone = californiaHomePageLocator.Cartsummary.isDisplayed();
		Assert.assertTrue(Resultone);
	}

	public void Proceedtocheckout() {
		californiaHomePageLocator.Proceedtocheckout.click();

	}

}
