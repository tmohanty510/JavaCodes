package sel_Assignments_103_to_110;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_109 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to open Google website use LinkText Locater to identify the following links:
		// 1)About 2)Gmail 3)Store 4)Image Print all these links using getText() method At Last ,click on Image then wait for 3 second and then close the browser
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement about = driver.findElement(By.linkText("About"));
		String atext = about.getText();
		System.out.println(atext);
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		String gtext = gmail.getText();
		System.out.println(gtext);
		
		WebElement store = driver.findElement(By.linkText("Store"));
		String stext = store.getText();
		System.out.println(stext);
		
		WebElement images = driver.findElement(By.linkText("Images"));
		String itext = images.getText();
		System.out.println(itext);
		images.click();
		
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
