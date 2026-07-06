package sel_Assignments_140_to_160;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login_Credentials {

	public static void login(ChromeDriver driver) throws InterruptedException
	{
	        
			WebElement email = driver.findElement(By.id("ap_email_login"));
	        email.sendKeys("iamtmohanty@gmail.com" + Keys.ENTER);

	        Thread.sleep(2000);

	        WebElement password = driver.findElement(By.id("ap_password"));
	        password.sendKeys("Bbsr@1234" + Keys.ENTER);

	        Thread.sleep(2000);
	    }

	}

