package sel_Assignment_110_to_120;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_118 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to open the JSAM HTML page. 1)Locate the First name textbox using Relative XPath. 2)Enter your name. 3)quit the browser.
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\lopam\\Downloads\\learningHTML1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		WebElement Fname = driver.findElement(By.xpath("//input[4]"));
		
		Fname.click();
		
		Fname.sendKeys("Tanmay");
		
		Thread.sleep(2500);
		
		driver.quit();
		
		
	}

}
