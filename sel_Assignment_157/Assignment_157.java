package sel_Assignment_157;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Assignment_157 extends BaseTest {

// " Website: https://www.saucedemo.com/
//Create a BaseTest class.
//Use @BeforeMethod to:
//Launch Chrome.
//Maximize the browser.
//Open the SauceDemo application.
//Use @AfterMethod to quit the browser.
//TestNG Concept: @Test(priority = )
//Create a class Assignment_157 that extends BaseTest.
//Write separate @Test methods to perform the following:
//@Test(priority = 1) – Launch the application and log in using valid credentials.
//@Test(priority = 2) – print the page title
//@Test(priority = 3) – print the current url"

	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce" + Keys.ENTER);
		System.out.println("Login Successful");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 2)
	public void title() throws InterruptedException {
		String a = driver.getTitle();
		System.out.println("Title: " + a);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 3)
	public void url() throws InterruptedException {
		String url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
