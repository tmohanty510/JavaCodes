package sel_Assignment_162_and_163;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Assignment_162 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		/*Write a program to launch Amazon India (https://www.amazon.in)
		   search for a product 
		   and count the number of products that display the "Best Seller" badge in the search results
		   click on 4th bestseller product
		   Use SoftAssertion
	
		*/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SoftAssert s1 = new SoftAssert();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys" + Keys.ENTER);
		
		List<WebElement>best = driver.findElements(By.xpath("//span[text()='Best seller']")) ;
		int count = best.size();
		System.out.println(best.get(4).getText());
		best.get(4).click();
	
		s1.assertAll();
		driver.quit();
		
	}
}
