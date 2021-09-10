package californiaUS.Utillll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaliforniaTestBase {

	public static Properties prop;
	public static WebDriver driver;

	public CaliforniaTestBase() {

		try {
			FileInputStream flz = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\java\\californiaUS\\configure\\caliuscofiguree.properties");
			prop = new Properties();
			prop.load(flz);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void initialise() {

		String Browsername = prop.getProperty("BrowserCA");
		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(CaliforniaUtill.implicitlyWait_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(CaliforniaUtill.pageLoadTimeout_wait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else
			System.out.println("Browser not found");
	}

	public static void LaunchApplication(String URL) {
		driver.get(prop.getProperty("CA_URL"));
	}

}
