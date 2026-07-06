package sel_Assignments_103_to_110;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_105 {

	public static void main(String[] args) throws InterruptedException {
		/* WAP to Launch Chrome browser. 
		Open https://grotechminds.com/. 
			Wait for 3 seconds. Close the browser*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
