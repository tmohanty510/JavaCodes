package sel_Assignments_140_to_160;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_155 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Website: https://www.google.com/ Launch the Google website. Maximize the browser. Find all hyperlinks present on the webpage. Extract the href attribute of each hyperlink to get url. Verify every URL using HttpURLConnection. Print ""The Link is Valid"" if the response code is 200. Otherwise, print the response message and response code for the broken link.
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		for(int i=0; i<count; i++)
		{
			WebElement e1 = links.get(i);
			String url = e1.getAttribute("href");
			System.out.println(url);
			Verify_Links(url);
		}
	}
	
	static void Verify_Links(String url) throws IOException
	{
		URL u1;
		try {
			u1 = new URL(null);
		HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
		
		if(h1.getResponseCode()==200)
		{
			System.out.println("Valid Link");
		}
		else {
			System.out.println("Invalid Link"+ h1.getResponseCode()+h1.getResponseMessage());
		}
		}
		
		catch (MalformedURLException e) {
			System.out.println("Handled the exception");
			
		}
	}

}
