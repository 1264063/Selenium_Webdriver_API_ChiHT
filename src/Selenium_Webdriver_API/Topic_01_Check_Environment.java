package Selenium_Webdriver_API;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_01_Check_Environment {
	//Declare a Webdriver
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  //Create new Browser
	  driver = new FirefoxDriver();
	  //Wait the page for loading success
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //Minimize browser to full screen
	  driver.manage().window().maximize();
	  //Get URL 
	  driver.get("http://live.guru99.com/");
  }
@Test
  public void TC_01_CheckTitle(){
	
	 }
@Test
  public void TC_02_CheckURL(){
	  
  }

  @AfterClass
  public void afterClass() {
	  //Quit Browser 
	  driver.quit();
  }

}
