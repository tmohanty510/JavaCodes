package sel_Assignments_121_to_140;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_122 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to launch google.com and do theright click on gmail
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement g = driver.findElement(By.linkText("Gmail"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(g).perform();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
