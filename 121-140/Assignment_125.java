package sel_Assignments_121_to_140;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_125 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to automate 'All' dropdown using Key functionality
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4300);
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement d = driver.findElement(By.id("searchDropdownBox"));
		d.click();
		Thread.sleep(8000);
		
		d.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		
		d.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		
		d.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		
		d.sendKeys(Keys.ENTER);
		Thread.sleep(1400);
		
		driver.quit();
		
		
		
		

	}

}
