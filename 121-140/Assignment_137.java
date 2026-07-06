package sel_Assignments_121_to_140;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_137 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to go to https://retail.sbi.bank.in/retail/login.htm Click on contact us
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
