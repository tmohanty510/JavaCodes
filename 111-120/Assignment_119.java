package sel_Assignment_110_to_120;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_119 {

	public static void main(String[] args) throws InterruptedException {
	// Write a Selenium program to open the JSAM HTML page. use absolute xpath: Enter First Name Select the second checkbox button -> I have a Girl. use relative xpath: who are you? -> Select female radio button Click  to know about us link

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\lopam\\Downloads\\learningHTML1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		WebElement Fname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		Fname.click();
		Fname.sendKeys("Tanmay");
		
		Thread.sleep(1500);
		
		WebElement chkbox = driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		chkbox.click();
		
		Thread.sleep(1500);
		
		WebElement radio = driver.findElement(By.xpath("(//input)[12]"));
		radio.click();
		
		Thread.sleep(1500);
		
		WebElement link = driver.findElement(By.xpath("(//a)[1]"));
		link.click();
		
		Thread.sleep(3500);
		
		driver.quit();

	}

}
