package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class guru99 {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();			
			//now we are going to correct the testcase
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
			
			
		
	}	
		@BeforeTest
		public void beforeTest() {	
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\chromedriver.exe");
		       
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}