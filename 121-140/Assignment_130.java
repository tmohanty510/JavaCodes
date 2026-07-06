package sel_Assignments_121_to_140;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment_130 {
	public static void main(String[] args) throws InterruptedException {
		// WAP to automate the passport seva for city dropdown
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://services2.passportindia.gov.in/forms/registration?_gl=1%2Abyz5f1%2A_ga%2AMzU3ODkyMDMxLjE3ODE1ODEzNTE.%2A_ga_B4255W3J9F%2AczE3ODE1ODEzNTAkbzEkZzEkdDE3ODE1ODEzNjMkajQ3JGwwJGgw%2A_ga_JTJJBP5DNH%2AczE3ODE1ODEzNTAkbzEkZzEkdDE3ODE1ODEzNjMkajQ3JGwwJGgw");
		
		WebElement radio = driver.findElement(By.xpath("(//div[@tabindex='0'])[8]"));
		radio.click();	
		
		Thread.sleep(2500);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@data-focusable='true']"));
		
		Select s1 = new Select(dropdown);
		s1.selectByVisibleText("Bhubaneswar");
		Thread.sleep(2500);
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Tanmay");
		Thread.sleep(2500);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("iamtmohanty@gmail.com");
		
		WebElement radio2 = driver.findElement(By.xpath("(//div[@data-focusable='true'])[10]"));
		radio2.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("abcd#2026");
		
		driver.quit();

	}

}
