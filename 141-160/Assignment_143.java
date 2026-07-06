package sel_Assignments_140_to_160;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_143 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to login to amazon.in or amazon.com based on your region-> search a prodouct->add it to wishlist-> add it to cart->Reach payment page -> Select Credit card option and enter your card details
		
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
		
		WebElement e7 = driver.findElement(By.xpath("//input[@data-csa-c-slot-id='checkout-secondary-continue-payselect' and @type='submit']"));
		e7.click();
		
		
	}

}
