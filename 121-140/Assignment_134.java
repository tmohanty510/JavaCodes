package sel_Assignments_121_to_140;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_134 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to go to google.com then click on the 1st number autosuggestion
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Indian Cricket");
		
		Thread.sleep(7000);
		
		List<WebElement> auto = driver.findElements(By.xpath("//div[@role='presentation']/ul[@role='listbox']/li"));
		Thread.sleep(8000);
		int count = auto.size();
		System.out.println(count);
		Thread.sleep(3000);
		
		System.out.println(("The First autosuggestion is: "+auto.get(0).getText()));
		auto.get(0).click();
		
		Thread.sleep(7000);
		
		driver.quit();

	}

}
