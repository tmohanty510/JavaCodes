package sel_Assignment_158;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(@Optional("chrome") String browser) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
	public void quit() {

		if (driver != null) {
			driver.quit();
		}
	}

}
