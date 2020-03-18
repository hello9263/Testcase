package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class searchproducts {
	 private WebDriver driver;		
  @Test
  public void f() {
	  driver.get("https://www.ebay.com/");
	    driver.manage().window().setSize(new Dimension(1382, 744));
	    driver.findElement(By.id("gh-ac")).click();
	    driver.findElement(By.id("gh-ac")).sendKeys("S10");
	    driver.findElement(By.id("gh-btn")).click();
	    String text=driver.findElement(By.cssSelector(".srp-controls__count-heading > .BOLD:nth-child(2)")).getText();
	    String actualtext="S10";
	    Assert.assertEquals(text, actualtext);
	   
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
