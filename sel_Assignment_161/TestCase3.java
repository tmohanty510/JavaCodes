package sel_Assignment_161;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3 extends BaseTest{
	
	//Test Case 3: Launch Amazon, log in with valid credentials, search for a product,
	//add the product to the wishlist,
	//verify that the product is successfully added to the wishlist.
	
	@Test
	public static void wish()
	{
		TestCase2.search();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base desktop-grid-content-view']"));
		list.get(8).click();
		
		//WebElement product = driver.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']/descendant::div[@role='listitem' and @data-index='7']"));
		//product.click();
		
		WebElement addW = driver.findElement(By.id("add-to-wishlist-button-submit"));
		addW.click();
		
		WebElement con = driver.findElement(By.xpath("//span[text()='One item added to']"));
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(con.getText(),"One item added to", "Message: Product not added to wishlist");
		s1.assertAll();
		
	}

}
