package sel_Assignments_121_to_140;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_135 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to go to amazon.in then select the 1st number autosuggestion
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		
		Thread.sleep(3000);
		
		List<WebElement> auto = driver.findElements
		(By.xpath("//div[@id='sac-autocomplete-results-container']/div/div/div"));
		
		//System.out.println(auto.size());
		
		int count = auto.size();
		System.out.println(count);
		System.out.println("First Suggestion is: "+ auto.get(0).getText());
		auto.get(count-10).click();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
