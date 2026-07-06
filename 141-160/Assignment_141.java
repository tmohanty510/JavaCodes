package sel_Assignments_140_to_160;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_141 {

	public static void main(String[] args) throws InterruptedException {
		// Automate this: On the below website https://www.ebay.com/ Search Toys product and click on 3rd one. Click on Add to cart Click on Checkout 1 Item
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.sendKeys("toys"+Keys.ENTER);
		
		WebElement	thirdproduct = driver.findElement(By.xpath("(//span[@class='su-styled-text primary default'])[5]"));
		thirdproduct.click();
								Thread.sleep(3000);
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> i= wh.iterator();
		String pw = i.next();
		String cw = i.next();
		driver.switchTo().window(cw);
		
		WebElement	addtorcart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtorcart.click();
		Thread.sleep(1200);
		WebElement checkout = driver.findElement(By.xpath("(//span[@class='ux-call-to-action__cell'])[7]"));
		checkout.click();

	}

}
