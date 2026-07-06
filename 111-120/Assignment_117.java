package sel_Assignment_110_to_120;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_117 {
	public static void main(String[] args) throws InterruptedException {
		// JSAM : Write a Selenium program to enter your name in the First Name text box using Absolute XPath
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\lopam\\Downloads\\learningHTML1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		WebElement Fname = driver.findElement(By.xpath("html/body/form/input[1]"));
		
		Fname.sendKeys("Tanmay");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
