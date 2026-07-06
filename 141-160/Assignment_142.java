package sel_Assignments_140_to_160;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment_142 {
	public static void main(String[] args) throws InterruptedException {
		//1. Launch www.tata1mg.com 2. Search for "Cetirizine 10mg" 3. Click the 3rd product from search results 5. Click 3 items as Add to Cart 6. Open cart 7.Delete item from cart
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.1mg.com/?srsltid=AfmBOorvMOaXJ8kZ6Z0zMPjrHAxbJLdfIXm8HdynFWp_zP6GmGsc09MJ&wpsrc=Google+Organic+Search");
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='search-medicine' and @type='text' and @placeholder='Search for Medicines and Health Products']"));
		e1.sendKeys("Cetirizine 10mg"+Keys.ENTER);
											Thread.sleep(12000);
		WebElement e2= driver.findElement(By.xpath("(//span[text()='Add to cart'])[3]"));
		e2.click();
											Thread.sleep(2500);
		WebElement e3= driver.findElement(By.xpath("//img[@alt='add quantity' and @width='24']"));
		e3.click();							e3.click();
						
		Thread.sleep(4500);
		WebElement e4= driver.findElement(By.xpath("//img[@alt='cart icon']"));
		Actions a1 = new Actions(driver);
		
		Thread.sleep(3500);
		
		a1.moveToElement(e4).perform();			
		
		Thread.sleep(6500);
		
		WebElement e5= driver.findElement(By.linkText("PROCEED TO CART"));
		e5.click();
		
		Thread.sleep(5500);
		
		driver.quit();

	}

}
