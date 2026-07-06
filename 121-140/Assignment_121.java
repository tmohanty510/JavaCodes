package sel_Assignments_121_to_140;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_121 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Program to Automate fresh hoverover  fromAmazon.in
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		WebElement e1 = driver.findElement(By.linkText("Fresh"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(e1).perform();
		
		Thread.sleep(3500);
		
		driver.quit();
		
	}

}
