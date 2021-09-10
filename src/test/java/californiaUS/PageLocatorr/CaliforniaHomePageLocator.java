package californiaUS.PageLocatorr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import californiaUS.Utillll.CaliforniaTestBase;

public class CaliforniaHomePageLocator extends CaliforniaTestBase {

	public CaliforniaHomePageLocator() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "search_query_top")
	public WebElement Searchbox;

	@FindBy(how = How.XPATH, using = "//button[@name='submit_search']")
	public WebElement ClickSearchIcon;

	@FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")
	public WebElement SpecificProduct;

	@FindBy(how = How.ID, using = "product")
	public WebElement Productdisplayed;

	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement SigninButton;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add to cart')]")
	public WebElement Addtocart;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
	public WebElement Forwardtonextstep;
	@FindBy(how = How.ID, using = "cart_title")
	public WebElement Cartsummary;
	@FindBy(how = How.LINK_TEXT, using = "Proceed to checkout")
	public WebElement Proceedtocheckout;
}
