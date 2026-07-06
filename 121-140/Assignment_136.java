package sel_Assignments_121_to_140;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_136 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to  go to https://www.flipkart.com/ search for sunglass and choose 1st auto suggestion
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Sunglasses");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='VCplLH lTpUwR bRjjIF _1psv1ze5l _1psv1ze9l _1psv1ze7c _1cisqlf2']/li"));
		
		int count = list.size();
		System.out.println(count);
		
		System.out.println("The First Suggestion: "+list.get(0).getText());
		list.get(8-8).click();
		
		Thread.sleep(6500);
		
		driver.quit();
	}

}
