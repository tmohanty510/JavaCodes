package sel_Assignments_140_to_160;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_144 {

	public static void main(String[] args) throws InterruptedException {
		// WAP  to go to   https://www.amazon.in/ search ""shoes"" After searching the product on Amazon Click on the checkbox of Campus Brand.
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement e1 = d.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes"+Keys.ENTER);
		
		Thread.sleep(3300);
		
		WebElement e2 =
d.findElement(By.xpath("//div[@id='brandsRefinements']/descendant::span[text()='Campus']/ancestor::span[@class='a-list-item']/descendant::i"));
		
		e2.click();
		
		d.quit();

	}

}
