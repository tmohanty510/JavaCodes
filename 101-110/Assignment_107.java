package sel_Assignments_103_to_110;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_107 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to open Amazon -> https://www.amazon.in/ search for ""shoes"" using findElement(),and press Enter using Keys.ENTER
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("shoes");
		
		Thread.sleep(3200);
		
		searchBox.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
