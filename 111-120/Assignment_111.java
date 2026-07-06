package sel_Assignment_110_to_120;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_111 {

	public static void main(String[] args) throws InterruptedException {
		// Open Google. Identify the search box using TagName. Enter ""grotechminds"". Press Enter. quit()
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement searchbox = driver.findElement(By.tagName("textarea"));
		searchbox.click();
		
		searchbox.sendKeys("GroTechMinds"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
