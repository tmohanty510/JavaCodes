package sel_Assignments_121_to_140;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_138 {

	public static void main(String[] args) throws InterruptedException {
		// Open the JSAM HTML form. verify that the First Name and Last Name textboxes are displayed and enabled using isDisplayed() and isEnabled(). then enter valid data into both fields
		
		EdgeDriver driver = new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lopam/Desktop/learningHTML1.html");
	
		Thread.sleep(3000);
		
		WebElement fn= driver.findElement(By.name("fname"));
		WebElement ln= driver.findElement(By.name("lname"));
		
		try {
		if(fn.isDisplayed()&&fn.isEnabled())
		{
			fn.sendKeys("Tanmay");
			if((ln.isDisplayed()&&ln.isDisplayed()))
					{
						ln.sendKeys("Mohanty");
					}
		}	
		}
		catch(ElementNotInteractableException ex1)
		{
			System.out.println("Handled ElementNotInteractableException");
		}
		Thread.sleep(3000);
		
		driver.quit();
}

}