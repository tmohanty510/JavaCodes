package sel_Assignments_140_to_160;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_147 {
	public static void main(String[] args) throws InterruptedException {
		// Launch " https://testautomationpractice.blogspot.com/ " Scroll down and you see Static Web Table .Please work on below questions 1)Count total rows in BookTable excluding header. 2)Count total columns in BookTable. 3)Print all book names. 4)Print author of ""Learn Selenium"". 5)Print price of ""Master In Java"". 6)Print the names of the books whose subject is ""Selenium"". 7)Print the names of the books whose price is greater than or equal to 1000
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Total no. of rows
		List <WebElement> list = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[td]"));
		int row = list.size();
		System.out.println("\nTotal no. of rows: "+row+"\n\n");
		
		//Total no. of columns
		List <WebElement> list1 = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		int col = list1.size();
		System.out.println("Total no. of columns: "+col+"\n\n");
		
		//Print all book names
		List <WebElement> list2 = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[1]"));
		int count = list2.size();
		for(int i=0; i<count; i++)
		{
			System.out.println(i+" Book:"+list2.get(i).getText());
			System.out.println("\n");
		}
		
		//Print author of learn selenium
		WebElement auth = driver.findElement(By.xpath("(//table[@name='BookTable']/tbody/tr/td[2])[1]"));
		String auth1 = auth.getText();
		System.out.println("Author of Learn Selenium: "+auth1+"\n\n");
		
		//Print the price of Master in Java
		WebElement price = driver.findElement(By.xpath("(//table[@name='BookTable']/tbody/tr/td[4])[5]"));
		String price1 = price.getText();
		System.out.println("Price of Master in Java: "+price1+"\n\n");
		
		//Print the names of the books whose subject is "Selenium"
		List <WebElement> list3 = driver.findElements(By.xpath("//td[text()='Selenium']"));
		int count1 = list3.size();
		for(int i=0; i<count1; i++)
		{
			System.out.println(i+". "+list3.get(i).getText());
			System.out.println("\n");
		}
		
		//Print the names of the books whose price is greater than or equal to 1000
		List <WebElement> list4 = driver.findElements(By.xpath("//td[text()>='1000']/preceding-sibling::td[3]"));
		int count2 = list4.size();
		for(int i=0; i<count2; i++)
		{
			String names = list4.get(i).getText();
			System.out.println(names);
			
		}
		


		
		
	
	}

}
