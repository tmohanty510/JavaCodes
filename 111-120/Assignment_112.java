package sel_Assignment_110_to_120;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 {

	public static void main(String[] args) throws InterruptedException {
		// Open Google. Locate the search box using className locater. Search for $tsla. Wait 3 seconds. Close the browser using driver.quit()
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1200);
		
		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("$tsla");
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
