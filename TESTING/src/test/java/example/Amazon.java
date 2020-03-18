package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Amazon {
	 private WebDriver driver;	
  @Test
  public void f() {
	 
	driver.get("https://www.amazon.com/");
	    driver.manage().window().setSize(new Dimension(1552, 840));
	    driver.findElement(By.id("twotabsearchtextbox")).click();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("\"S10\"");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	    driver.findElement(By.cssSelector(".a-color-state")).click();
	    String text=driver.findElement(By.cssSelector(".a-color-state")).getText();
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
