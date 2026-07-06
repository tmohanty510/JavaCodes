package sel_Assignment_110_to_120;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_115 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to open Google.com 1) locate all links using the TagName locator (a), 2)count the total number of links 3) print the URL (href attribute) of each link

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			WebElement e2 = allLinks.get(i);
			String url = e2.getAttribute("href");
			System.out.println(url);
		}
		
		driver.quit();

	}

}
