package sel_Assignments_140_to_160;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment_156 {

	public static void main(String[] args) throws InterruptedException {
		// WebSite: Local HTML Practice Page (iframehtmlpagefromGROTECHMINDS.html) [This HTML file was shared during the class on 29 June 2026.] Launch the local HTML webpage. Maximize the browser window. Enter the student name and mobile number. Select   the gender. Select Automation Testing from the Course dropdown. Accept the Terms & Conditions checkbox. Click the Register Student button. Enter the teacher name. Increase the teacher's experience to 3 years using keyboard actions. Enter teacher remarks. Switch to Iframe Level 1. Enter student feedback. Select Good as the feedback rating. Click the Submit Feedback button. Switch back to the main webpage using defaultContent().
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/lopam/Downloads/iframehtmlpagefromGROTECHMINDS.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement e1 = driver.findElement(By.id("studentName"));
		e1.sendKeys("Manish Gaur");
		
		WebElement e2 = driver.findElement(By.id("studentMobile"));
		e2.sendKeys("987654321");
		
		WebElement e3 = driver.findElement(By.id("genderMale"));
		e3.click();
		
		WebElement e4 = driver.findElement(By.name("course"));
		
		Select s1 = new Select(e4);
		s1.selectByValue("automation");
		
		WebElement e5 = driver.findElement(By.id("acceptTerms"));
		e5.click();
		
		WebElement e6 = driver.findElement(By.id("studentSubmitBtn"));
		e6.click();
		
		WebElement e7 = driver.findElement(By.id("teacherName"));
		e7.sendKeys("MK Gaur");
		
		WebElement e8 = driver.findElement(By.id("teacherExperience"));
		e8.sendKeys("30");
		
		WebElement e9 = driver.findElement(By.id("teacherRemarks"));
		e9.sendKeys("Good Teacher");
		
		
		WebElement iframe = driver.findElement(By.id("iframeLevel1"));
		
		driver.switchTo().frame(iframe);
		
		WebElement e10 = driver.findElement(By.id("feedbackText"));
		e10.sendKeys("No comments");
		
		WebElement e11 = driver.findElement(By.xpath("//input[@name='rating' and @value='Good']"));
		e11.click();
		
		WebElement e12 = driver.findElement(By.xpath("feedbackSubmitBtn"));
		e12.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
