package sel_Assignments_140_to_160;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_151 {
	
	public static void main(String[] args) throws InterruptedException {
		// Go to -->https://www.bseindia.com/markets/equity/eqreports/mktwatchr?filter=gainer*all$all$ find out the group of the TOP Company i.e whichever is on Top
		
		ChromeDriver driver = new ChromeDriver();
		driver.get
		("https://www.bseindia.com/markets/equity/eqreports/mktwatchr?filter=gainer*all$all$");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// find out the group of the TOP Company i.e whichever is on Top
		
		WebElement name = driver.findElement(By.xpath("//a[text()=' VELJAN']"));
		
		String Company_name = name.getText(); 
		
		System.out.println("Name of the company is: "+ Company_name);
		
		WebElement e1 = driver.findElement
		(By.xpath("//a[text()=' VELJAN']/parent::td/following-sibling::td[@class='td-txt-center']"));
		
		Thread.sleep(3000);
		
		String group =  e1.getText();
		
		System.out.println("The group of the TOP Company: "+group);

	}

}
