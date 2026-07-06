package sel_Assignments_121_to_140;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_124 {

	public static void main(String[] args) throws InterruptedException {
		// Write a program to Automate drag and drop
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(7000);
		driver.manage().window().maximize();

		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.id("drag2"));
		WebElement drop = driver.findElement(By.id("div2"));
		Thread.sleep(2000);
		
		a1.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
