package sel_Assignments_140_to_160;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_149 {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://www.bseindia.com/markets/equity/equitysensexstream Find Security code of ADANIPORTS
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/equitysensexstream");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//What is the security code for ADANIPORTS?

		WebElement e1 = driver.findElement(By.xpath("//b[text()=' ADANIPORTS ']/ancestor::tr[@data-symbol='532921']/child::td[@data-cell='Symbol' and @class='td-text-center']"));
		
		Thread.sleep(2000);
		
		String security = e1.getText();
		
		System.out.println("security code for ADANIPORTS: "+security);

	}

}
