package chiselon_colourTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ColourClassifiedsTestcases {
	
	WebDriver driver= new FirefoxDriver();
		@Test
		public void testCase1()
		{
			driver.get("https://www.facebook.com/");
		}

}
