package sel_Assignment_158;

import org.testng.annotations.Test;

public class Title extends BaseTest {

	@Test
	public void title() {
		System.out.println("Page Title: " + driver.getTitle());
	}
}
