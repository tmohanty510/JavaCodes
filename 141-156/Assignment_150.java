package sel_Assignments_140_to_160;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_150 {

	public static void main(String[] args) throws InterruptedException {
		// go to -->https://beta.bseindia.com/register/AuditorRegisteration.aspx Launch the BSE Auditor Registration page. Maximize browser. Fill all mandatory fields with dummy test data. no need to verify OTP Select dropdown values if available. At last click on Reset button
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://beta.bseindia.com/register/AuditorRegisteration.aspx");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement firmName = driver.findElement(By.id("txtFirmName"));
		firmName.sendKeys("GroDevML, LLP");
		
		WebElement firmAdd = driver.findElement(By.id("txtFirmAddress"));
		firmAdd.sendKeys("(856) 455-3512 532 Springtown Rd Greenwich, New Jersey(NJ), 08323");
		
		WebElement contact = driver.findElement(By.id("txtfirmmobile"));
		contact.sendKeys("7274347126");
		
		WebElement email = driver.findElement(By.id("txtfirmemail"));
		email.sendKeys("user@workday.com");
		
		WebElement pan = driver.findElement(By.id("txtfirmPAN"));
		pan.sendKeys("ABCDE1234F");
		
		WebElement regno = driver.findElement(By.id("txtFirmRegNo"));
		regno.sendKeys("439088");
		
		WebElement name = driver.findElement(By.id("Gridview1_txtname_0"));
		name.sendKeys("Manish Gaur");
		
		WebElement mem = driver.findElement(By.id("Gridview1_txtMembership_0"));
		mem.sendKeys("EDL34190");
		
		WebElement ppan = driver.findElement(By.id("Gridview1_txtPAN_0"));
		ppan.sendKeys("ABCDE1234F");
		
		WebElement pemail = driver.findElement(By.id("Gridview1_txtEmailid_0"));
		pemail.sendKeys("partner@gmail.com");
		
		WebElement con = driver.findElement(By.id("Gridview1_txtContact_0"));
		con.sendKeys("9883456798");
		Thread.sleep(1000);
		
		WebElement exp = driver.findElement(By.id("Gridview1_txtNoyear_0"));
		exp.sendKeys("4");
		
		WebElement partsts = driver.findElement(By.id("Gridview1_ddlpatnership_0"));
		
		Thread.sleep(3000);
		
		Select s1 = new Select(partsts);
		s1.selectByVisibleText("Full Time Partner");
		
		Thread.sleep(8000);
		
		driver.findElement(By.id("btnReset")).click();
		
		

	}

}
