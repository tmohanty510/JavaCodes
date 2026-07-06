package sel_Assignments_140_to_160;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_154 {
	public static void main(String[] args) throws InterruptedException {
		// WAP to go to https://www.irctc.co.in/nget/train-search 1)  click on English 2) search from -To to any destination , select date  and click on Search Trains button 3)  print all the  train names
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='English']")).click();
		
		driver.findElement(By.xpath("(//input[@role='searchbox' and @type='text' and @aria-autocomplete='list'])[1]")).sendKeys("Bhubaneswar"+ Keys.ARROW_DOWN +Keys.ARROW_DOWN+ Keys.ENTER);
		driver.findElement(By.xpath("(//input[@role='searchbox' and @type='text' and @aria-autocomplete='list'])[2]")).sendKeys("Bangalore" + Keys.ENTER);
		
		WebElement jdate = driver.findElement(By.xpath("//p-calendar[@dateformat='dd/mm/yy' and @formcontrolname='journeyDate']"));
		jdate.click();
		
		//WebElement i1 = driver.findElement(By.id("goog_plcm_frame"));
		
		//driver.switchTo().frame(i1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c69-61 ng-star-inserted']")).click();
		
		driver.findElement(By.xpath("//a[text()='15']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//button[text()=' Search Trains ']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> lot = driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']/strong"));
		
		int count = lot.size();
		
		for(int i=0; i<count; i++)
		{
			WebElement t = lot.get(i);
			String t1 = t.getText();
			System.out.println(t1);
		}
		
		driver.quit();
		
		
	}

}
