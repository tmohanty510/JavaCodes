package sel_Assignments_140_to_160;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_153 {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://grotechminds.com/ *Click on manish photo bot and enter your name close the bot Click on Apply Now Enter data and submit
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		Thread.sleep(12000);
		driver.manage().window().maximize();
		
		Thread.sleep(9000);
		
		WebElement chatbot = driver.findElement(By.xpath("//div[@id='chat-bot-launcher-button' and @class='chat-bot-launcher-button']"));
		chatbot.click();
		
		WebElement iframe = driver.findElement(By.id("chat-bot-iframe"));
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(5500);
		
		WebElement e1 = driver.findElement(By.xpath("//textarea[@id='textInput']"));
		e1.sendKeys("Manish"+Keys.ENTER);
		
		Thread.sleep(4400);
		
		WebElement e2 = driver.findElement(By.xpath("//textarea[@id='textInput']"));
		e2.sendKeys("grotech@gmail.com"+Keys.ENTER);
		
		Thread.sleep(4400);
		
		WebElement e3 = driver.findElement(By.xpath("//textarea[@id='textInput']"));
		e3.sendKeys("9337776464"+Keys.ENTER);
		
		Thread.sleep(4400);
		
		WebElement e4 = driver.findElement(By.xpath("//span[@class='checkmark theme-border']"));
		e4.click();
		
		Thread.sleep(4400);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-bot-widget-close")).click();
		
		WebElement apply = driver.findElement(By.xpath("//button[@type='button' and text()='Apply Now']"));
		apply.click();
		
		driver.switchTo().frame(iframe);
		
		//WebElement a= driver.findElement(By.xpath("//h5[text()='Apply Now']"));
		
		Thread.sleep(2400);
		
		WebElement name1= driver.findElement(By.name("your-name"));
		name1.sendKeys("Manish Gaur");
		
		WebElement email1 = driver.findElement(By.name("your-email"));
		email1.sendKeys("abc@gmail.com");
		
		WebElement phn = driver.findElement(By.name("your-email"));
		phn.sendKeys("9337776464");
	
		WebElement sub = driver.findElement(By.xpath("//input[@type='submit' and @value='Submit' and @class='wpcf7-form-control wpcf7-submit has-spinner']"));
		sub.click();


	}

}
