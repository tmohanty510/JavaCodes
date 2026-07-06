package sel_Assignments_140_to_160;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_146 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch SauceDemo  -https://www.saucedemo.com/ 2. Login 3. Sort Price High to Low 4. Click on 3rd Product 5. Add to Cart 6. Open Cart 7. Checkout 8. Enter Customer Details 9. Finish Order 10. Logout
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement sort = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		sort.click();
		
		Select s1 = new Select(sort);
		s1.selectByValue("hilo");
		
		Thread.sleep(1800);
		
		WebElement click = driver.findElement(By.xpath("//div[@id='inventory_container' and @class='inventory_container']/descendant::div[22]"));
		click.click();
		
		Thread.sleep(1500);
		
		WebElement add = driver.findElement(By.id("add-to-cart"));
		add.click();
		
		driver.findElement(By.xpath("//span[text()='1']")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Tanmay");
		
		driver.findElement(By.id("last-name")).sendKeys("Mohanty");
		
		driver.findElement(By.id("postal-code")).sendKeys("560037");
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("finish")).click();
		
		driver.findElement(By.id("back-to-products")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3500);
		
		driver.quit();
		
	}
	

}
