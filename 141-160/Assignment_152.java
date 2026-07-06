package sel_Assignments_140_to_160;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_152 {

public static void main(String[] args) throws InterruptedException {
		// WAP to login to amazon-> search the prodouct-> add it to wishlist-> add it to cart-> Reach payment page -> Select Credit card option and enter your card details -this is present in iframe
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Amazon_Login_Credentials.login(driver);
		
		Thread.sleep(2200);
		
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes"+Keys.ENTER);
		
		Thread.sleep(12000);
		
		List<WebElement> l = driver.findElements(By.xpath("//a/h2"));
		l.get(5).click();

		Thread.sleep(6500);
		
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> i = pcid.iterator();
		
		String pid= i.next();
		String cid= i.next();
		driver.switchTo().window(cid);
		
		Thread.sleep(2300);
		
		WebElement e3 = driver.findElement(By.id("add-to-wishlist-button-submit"));
		e3.click();
		
		Thread.sleep(2300);
		
		WebElement proceed = driver.findElement(By.xpath("//input[@aria-label='Continue shopping' and @type='submit']"));
		proceed.click();
		
		Thread.sleep(2300);
		
		WebElement e4 = driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @name='submit.add-to-cart']"));
		e4.click();
		
		Thread.sleep(1200);
		
		WebElement e5 = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout' and @type='submit']"));
		e5.click();
		
		Thread.sleep(1500);
		
		WebElement e6 = driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection' and @type='radio'])[5]"));
		e6.click();
		
		Thread.sleep(2200);
		
		WebElement e7 = driver.findElement(By.xpath("//input[@type='radio' and @name='ppw-instrumentRowSelection' and @value='SelectableAddCreditCard']"));
		e7.click();
		
		Thread.sleep(2200);
		
		WebElement e9 = driver.findElement(By.linkText("Add a new credit or debit card"));
		e9.click();
		
		Thread.sleep(2200);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='ApxSecureIframe']"));
		
		Thread.sleep(19000);
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(4200);
		
		WebElement e10 = driver.findElement(By.xpath("//input[@type='tel' and @class='a-input-text a-form-normal pmts-account-Number']"));
		e10.sendKeys("4242424242424242");
		
		WebElement month = driver.findElement(By.xpath("//span[text()='01']"));
		month.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//ul/li/a[text()='09']")).click();

		Thread.sleep(2000);

		WebElement year = driver.findElement(By.xpath("//span[text()='2026']"));
		year.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//ul/li/a[text()='2029']")).click();
	
		WebElement e13 = driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent' and @type='submit']")) ;
		e13.click();
		Thread.sleep(2200);
		
		driver.switchTo().defaultContent();
		
		WebElement e8 = driver.findElement(By.xpath("//input[@data-csa-c-slot-id='checkout-secondary-continue-payselect' and @type='submit']"));
		e8.click();
		
		Thread.sleep(2200);
		
		


	}

}
