package sel_Assignment_158;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Mobile extends BaseTest {
	@Test
	public void search() throws InterruptedException {
		System.out.println("Search for Mobile");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Mobile", Keys.ENTER);

		Thread.sleep(2000);
	}
}
