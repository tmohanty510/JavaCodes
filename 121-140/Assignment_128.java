package sel_Assignments_121_to_140;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_128 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to automate 'All' dropdown using selectbyVisibletext
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(2500);
		
		System.out.println(e1.isDisplayed());
		Thread.sleep(1500);
		Select s1 = new Select(e1);
		Thread.sleep(3500);
		s1.selectByVisibleText("Books");
		
		Thread.sleep(5500);
		driver.quit();

	}

}
