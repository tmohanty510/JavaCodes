package sel_Assignment_110_to_120;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_114 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to open Google.com and perform the following operations using the TagName locator (a tag): Print the text of the second link on the page. Print the text of all links present on the page
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		int count = Links.size();
		WebElement input2 = Links.get(1);
		System.out.println(input2.getText());
		
		for(int i=0; i<count; i++)
		{
			WebElement input3 = Links.get(i);
			String url = input3.getText();
			System.out.println(url);
		}
		
		driver.quit();

		

	}

}
