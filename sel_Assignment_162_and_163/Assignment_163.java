package sel_Assignment_162_and_163;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Assignment_163 {
	public static WebDriver driver;
	public static void main(String[] args) {
		/*Write a program to launch Amazon India (https://www.amazon.in)
		  search for a product and count the number of products that display the "Best Seller" badge in the search result. click on 4th bestseller product
		   	1)Verify that Amazon  launched successfully
			2)Verify that bestsellers product are present.
			3)Verify there are at least four Best Seller products before clicking the fourth one.
			4)Verify navigation to the product page after clicking.
		*/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys" + Keys.ENTER);
		
		SoftAssert s1 = new SoftAssert();
		
		List<WebElement> best = driver.findElements(By.xpath("//div[@role='listitem']/descendant::div[@id='BEST_SELLER']"));
		int count = best.size();
		
		//To check if the bestsellers
		System.out.println("No. of bestsellers: "+count);
		s1.assertTrue(count>0,"sorry,no bestseller products available");
		s1.assertTrue(count>=5,"sorry bestseller count is less than 5");
	
		//For clicking on the 4th bestseller product:
		//this is taken from the product's image class
		
		List<WebElement> bestseller = driver.findElements(By.xpath("//div[@id='BEST_SELLER']/ancestor::div[@role='listitem']/descendant::a[@class='a-link-normal s-no-outline']"));
		bestseller.get(3).click();
		
		//To check if the new url is fromamazon.in or something else or a broken link:
		s1.assertTrue(driver.getCurrentUrl().contains("amazon.in"),"sorry product page did not open");
		s1.assertAll();
		
		
		//driver.quit();
		
		
	}

}
