package sel_Assignment_161;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends BaseTest
{
	//Test Case 2: Launch Amazon, log in with valid credentials.
	//search for a product, and verify that the search results are displayed.
	
	@Test
	public static void search()
	{
		TestCase1.login();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes" + Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SoftAssert s1 = new SoftAssert();
		s1.assertTrue(driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText().contains("shoes"), "Message: Incorrect Search Results");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base desktop-grid-content-view']"));
		
		s1.assertTrue(list.size()>10, "Message: No relevant products");
		
		s1.assertAll();
	
	}
}
