package sel_Assignments_121_to_140;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment_131 {
	public static void main(String[] args) throws InterruptedException {
		// WAP to automate the grotechminds registration form dropdown : https://grotechminds.com/registeration-form/	
		ChromeDriver driver = new ChromeDriver();						driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");		Thread.sleep(7600);
		
		WebElement e1 = driver.findElement(By.id("firstName"));			e1.sendKeys("Tanmay");
		
		WebElement e2 = driver.findElement(By.id("lastName"));			e2.sendKeys("Mohanty");
		
		WebElement e3 = driver.findElement(By.id("email"));				e3.sendKeys("iamtmohanty@gmail.com");
		
		WebElement e4 = driver.findElement(By.id("phone"));				e4.sendKeys("987654321");
		
		WebElement gender = driver.findElement(By.id("select2-gender-container")); 		gender.click();
		Thread.sleep(2600);
		gender.sendKeys(Keys.ARROW_DOWN);		gender.sendKeys(Keys.ARROW_DOWN);
		
		WebElement state = driver.findElement(By.id("select2-state-container"));		state.click();
		Thread.sleep(2600);
		state.sendKeys(Keys.ARROW_DOWN);		state.sendKeys(Keys.ARROW_DOWN);
		
		WebElement aadhaar = driver.findElement(By.id("aadhaar"));
		aadhaar.sendKeys("123456784321");
		
		WebElement pan = driver.findElement(By.id("pan"));
		pan.sendKeys("ABCDE123456054");
		
		WebElement cb = driver.findElement(By.id("c_bs_1"));
		cb.click();
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
	}
}
