package sel_Assignments_121_to_140;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_139 {
	public static void main(String[] args) throws InterruptedException {
		// WAP to go to 1. Launch https://pharmeasy.in/ 2. Search for ""dolo 650"" 3. Click 1st product/search result 4. Add 4 quantity 5. Click Add to Cart"
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://pharmeasy.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//div[@class='typeahead-lib-Typeahead-module_placeholderContent__8HePU']"));
		search.click();
		
		WebElement searchb = driver.findElement(By.xpath("//input[@placeholder='Search medicines/Healthcare products']"));
		searchb.sendKeys("Dolo 650"+Keys.ENTER);
		
		WebElement firstproduct = driver.findElement(By.xpath("//h1[text()='Dolo 650Mg Strip Of 15 Tablets']"));
		firstproduct.click();
		
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		addtocart.click();
		
		WebElement quantity = driver.findElement(By.xpath("//div[@role='option' and normalize-space()='4']"));
		quantity.click();

		WebElement viewcart = driver.findElement(By.linkText("View Cart"));
		viewcart.click();							
															Thread.sleep(6000);
		driver.quit();
		
	}

}
