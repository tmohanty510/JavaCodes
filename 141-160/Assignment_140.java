package sel_Assignments_140_to_160;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_140 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to launch https://www.airindia.com/ Click Accept All on cookie
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		WebElement e2 = driver.findElement(By.xpath("(//button[text()='Accept All'])[1]"));
		e2.click();
		
		driver.quit();

	}

}
