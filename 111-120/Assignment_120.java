package sel_Assignment_110_to_120;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_120 {

	public static void main(String[] args) throws InterruptedException {
		
		// Write a Selenium program to open Amazon.in website. Maximize the browser. Hover the mouse over ""change language"". Wait for 3 seconds. quit the browser

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.id("icp-nav-flyout"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(e1).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
}
