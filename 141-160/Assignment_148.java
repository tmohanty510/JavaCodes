package sel_Assignments_140_to_160;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_148 {
	public static void main(String[] args) throws InterruptedException {
		
		// Register your Account here-->https://demowebshop.tricentis.com/ Launch https://demowebshop.tricentis.com/ login Search for ""computer"" Click 1st product Add to cart Open cart Update quantity to 2 Click Update shopping cart
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		WebElement e1 = driver.findElement(By.id("small-searchterms"));
		e1.click();
		e1.sendKeys("Computers"+Keys.ENTER);			Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='search-results']/div/div/div[@class='product-item' and @data-productid='72']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("add-to-cart-button-72")).click();		Thread.sleep(1000);
		
		driver.findElement(By.linkText("shopping cart")).click();		Thread.sleep(1000);
		
		WebElement q = driver.findElement(By.name("itemquantity6844539"));
		q.sendKeys(Keys.BACK_SPACE+"2");
		
		driver.findElement(By.name("updatecart")).click();				Thread.sleep(5000);
		
		driver.quit();		

	}

}
