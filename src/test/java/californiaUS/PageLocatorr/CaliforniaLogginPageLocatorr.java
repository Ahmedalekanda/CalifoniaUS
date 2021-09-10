package californiaUS.PageLocatorr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import californiaUS.Utillll.CaliforniaTestBase;

public class CaliforniaLogginPageLocatorr extends CaliforniaTestBase {
	
	public CaliforniaLogginPageLocatorr() {
	
	
	PageFactory.initElements(driver, this);

}
	@FindBy(how=How.ID, using="email")
	public WebElement Email;
	
	@FindBy(how=How.ID, using="passwd")
	public WebElement Password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"SubmitLogin\"]/span/i")
	public WebElement Login;
	
	@FindBy(how=How.XPATH, using="//span[text()='Ashequr Rahman']")
	public WebElement UserintheProfilePage;
	
	@FindBy(how=How.XPATH, using="//span[text()='Order history and details']")
	public WebElement orderdetailsPage;
	
	@FindBy(how=How.XPATH, using="//h1[text()='Order history']")
	public WebElement  entersorderhistorypage ;

}
