package sel_Assignments_103_to_110;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_108 {

	public static void main(String[] args) throws InterruptedException {
		// Write a Selenium program to automate the Amazon login page using findElement(), sendKeys(), and click() methods

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement username = driver.findElement(By.id("ap_email_login"));
		username.sendKeys("abcd@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("abcd1234");
		
		WebElement signInButton = driver.findElement(By.id("auth-signin-button"));
		signInButton.click();
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
