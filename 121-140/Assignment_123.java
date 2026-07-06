package sel_Assignments_121_to_140;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_123 {

	public static void main(String[] args) throws InterruptedException {
		// Write a program to Automate double click on GroTechMinds application
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/left-double-click/");
		Thread.sleep(7000);
		
		driver.manage().window().maximize();
		
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement dc1=driver.findElement(By.xpath("//div[@ondblclick='myFunction1()']"));
		Thread.sleep(2000);
		
		a1.doubleClick(dc1).perform();
		
		WebElement link = driver.findElement(By.linkText("Link1"));
		Thread.sleep(2000);
		
		a1.doubleClick(link).perform();
		Thread.sleep(7000);
		
		
		driver.quit();
	}

}
