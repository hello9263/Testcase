package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class signin {
	 private WebDriver driver;	
  @Test
  public void f() {
	  driver.get("https://www.amazon.com/");
	    driver.manage().window().setSize(new Dimension(1552, 840));
	    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	    driver.findElement(By.id("ap_email")).sendKeys("Steve.fox9263@gmail.com");
	    driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("1234qwerty");
	    driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	    System.out.println("you have passed the test");
	 
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
