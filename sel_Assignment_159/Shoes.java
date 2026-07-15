package sel_Assignment_159;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.Test;

public class Shoes extends BaseTest {
	@Test
	public void Flipkart_Search() throws InterruptedException {
		System.out.println("Search Shoes");

		try {
			WebElement a = driver.findElement(By.xpath("//span[@role='button']"));
			if (a.isDisplayed()) {
				a.click();
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Popup");
		} catch (UnreachableBrowserException f) {
			System.out.println("Working");
		}

		WebElement e1 = driver.findElement(By.xpath("(//input[@title='Search for Products, Brands and More'])[1]"));
		e1.sendKeys("Shoes" + Keys.ENTER);

		Thread.sleep(3000);

	}
}
