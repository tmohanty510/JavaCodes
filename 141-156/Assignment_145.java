package sel_Assignments_140_to_160;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_145 {

	public static void main(String[] args) throws InterruptedException {
		// Go to Employee table Html FIND out how many rows are present? FIND out how many Columns are present? FIND out how many QA's are working ? FIND out what is the salary of ram? print the dept of neha WAP to find oyt how many employees have the same salary as 80k WAP to iterate each employee names
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\lopam\\Downloads\\employee.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));
		System.out.println("Number of rows: "+row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='employeeTable']/thead/tr/th"));
		System.out.println("Number of columns: "+col.size());
		
		List<WebElement> alldept = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr/td[2]"));
		
		int count=0;
		for(WebElement qa : alldept)
		{
			if(qa.getText().equals("QA"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	
		driver.quit();
	}
	

}
