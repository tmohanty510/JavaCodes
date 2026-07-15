package sel_Assignment_158;

import org.testng.annotations.Test;

public class Url extends BaseTest {

	@Test
	public void url() {
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}
}
