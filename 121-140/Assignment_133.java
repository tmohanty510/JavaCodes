package sel_Assignments_121_to_140;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_133 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to go to google.com then count the number of options in the given autosuggestion print the number
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("India");
		
		Thread.sleep(2000);
		
		List<WebElement> auto = driver.findElements(By.xpath("(//ul[@role='menu'])//li"));
		
		System.out.println(auto.size());
		
		
		

	}

}
