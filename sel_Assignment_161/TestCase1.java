package sel_Assignment_161;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest
{
	@Test
	public static void login()
	{
		//Test Case 1: Launch Amazon, log in with valid credentials, and log out successfully.
		WebElement email = driver.findElement(By.id("ap_email_login"));
		email.sendKeys("iamtmohanty@gmail.com" + Keys.ENTER);

		WebElement password = driver.findElement(By.id("ap_password"));
																																		password.sendKeys("Bbsr@1234" + Keys.ENTER);
	}
	public static void logout()
	{
		
		WebElement s = driver.findElement(By.xpath("//span[text()='Hello, Tanny']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(s).perform();
		
		WebElement so = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		so.click();
	
	}
	
	
	
}
