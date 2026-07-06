package sel_Assignment_110_to_120;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_113 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to count all <input> tags present on the JSAM webpage (HTML link shared on whatsapp .please check)
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\lopam\\Downloads\\learningHTML1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		List<WebElement> input = driver.findElements(By.tagName("input"));
		
		int count = input.size();
		
		for(int i=0; i<count; i++)
		{
			WebElement input2 = input.get(i);
			String url = input2.getAttribute("type");
			System.out.println(url);
		}

		driver.quit();
	}

}
