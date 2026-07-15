package sel_Assignment_159;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.Test;
//	 Launch https://www.flipkart.com/
//		 
//		 Create 2 TestNG test cases to perform the following:
//		1)search toys 
//		2)search shoes
//
//		Run all test cases on Chrome and Edge ,firefox using Cross Browser Testing 
//		and Parallel Execution through testng.xml.

public class Toy extends BaseTest {
	@Test
	public void toy() throws InterruptedException {
		System.out.println("Search Toys");

		try {
			WebElement a = driver.findElement(By.xpath("//span[@role='button']"));
			if (a.isDisplayed()) {
				a.click(); // for closing the pop-up cross X symbol
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Popup");
		} catch (UnreachableBrowserException f) {
			System.out.println("Working");
		}

		WebElement e1 = driver.findElement(By.xpath("(//input[@title='Search for Products, Brands and More'])[1]"));
		e1.sendKeys("Toys" + Keys.ENTER);

		Thread.sleep(3000);
	}

}
