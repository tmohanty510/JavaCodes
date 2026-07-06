package sel_Assignments_103_to_110;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_110 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to open Amazon.in website. Use PartialLinkText locator to identify the ""Fashion"" link. Print the link text and click on it
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		WebElement fashion = driver.findElement(By.partialLinkText("Fash"));
		
		String text = fashion.getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		
		fashion.click();
	
	}

}
