package sel_Assignments_103_to_110;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_104 {

	public static void main(String[] args) {
		//Write a Java program to launch the Chrome,Firefox,Edge browser using Selenium in a Maven Project.

		ChromeDriver cd= new ChromeDriver();
		
		FirefoxDriver fd = new FirefoxDriver();
		
		EdgeDriver ed = new EdgeDriver();
		
		cd.quit();
	    fd.quit();
	    ed.quit();

	}

}
