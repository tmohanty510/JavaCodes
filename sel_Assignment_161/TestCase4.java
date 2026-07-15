package sel_Assignment_161;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase4 extends BaseTest
{
	//Test Case 4: Launch Amazon, log in with valid credentials, search for a product, add it to the wishlist,
	 //add the product to the cart, and verify that the product is successfully added to the shopping cart.
	@Test
	public static void cart()
	{
		TestCase3.wish();
		WebElement cont = driver.findElement(By.xpath("//input[@aria-label='Continue shopping' and @type='submit']"));
		cont.click();
		
		WebElement addC = driver.findElement(By.id("add-to-cart-button"));
		addC.click();
		
		WebElement conC = driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));
		
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(conC.getText(), "Added to cart", "Message: Not Added to Cart");
		s1.assertAll();
			
	}
		
}
