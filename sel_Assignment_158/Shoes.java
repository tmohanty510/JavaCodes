package sel_Assignment_158;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Shoes extends BaseTest {

	@Test
	public void search() throws InterruptedException {
		System.out.println("Search for shoes");

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes", Keys.ENTER);

		Thread.sleep(2000);
	}

}
