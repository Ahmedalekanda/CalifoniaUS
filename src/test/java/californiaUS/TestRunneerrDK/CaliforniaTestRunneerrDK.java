package californiaUS.TestRunneerrDK;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import californiaUS.Utillll.CaliforniaTestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefiniUS",tags= {"@TC"})

public class CaliforniaTestRunneerrDK extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void OpenBrowser() {
		CaliforniaTestBase Launch=new CaliforniaTestBase();
		Launch.initialise();
	} 


	@AfterTest
	public void Closeebrowser() {
		CaliforniaTestBase Closee=new CaliforniaTestBase();
		Closee.driver.quit(); 

	}
	

}

