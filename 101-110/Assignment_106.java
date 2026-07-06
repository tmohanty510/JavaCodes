package sel_Assignments_103_to_110;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_106 {

	public static void main(String[] args) {
		// Wap on below Browser Methods: Launch Chrome. Open Facebook. Print: Title Current URL quit the browser
		
		ChromeDriver cd = new ChromeDriver();
		
		cd.manage().window().maximize(); //To maximize the window
		
		cd.get("https://www.facebook.com/");
		
		String title = cd.getTitle(); 	//To get Title of the Webpage
		System.out.println(title);
		
		String url = cd.getCurrentUrl();//To get the current Url 
		System.out.println(url);
		
		cd.close();

	}

}
